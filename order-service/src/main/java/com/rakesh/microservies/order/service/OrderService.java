package com.rakesh.microservies.order.service;


import com.rakesh.microservies.order.client.InventoryClient;
import com.rakesh.microservies.order.dto.OrderRequest;
import com.rakesh.microservies.order.model.Order;
import com.rakesh.microservies.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    @Autowired
    private final InventoryClient inventoryClient;

    public void placeOrder(OrderRequest request){
        var isProductInStock = inventoryClient.isStock(request.getSkuCode() , request.getQuantity());
        if (isProductInStock) {
            Order order = new Order();
            order.setOrderNumber(UUID.randomUUID().toString());
            order.setPrice(request.getPrice());
            order.setSkuCode(request.getSkuCode());
            order.setQuantity(request.getQuantity());
            orderRepository.save(order);
        }else{
            throw new RuntimeException("product wih suk code"+ request.getSkuCode() + " is not in stock");
        }

    }
}
