package com.rakesh.microservies.order.service;


import com.rakesh.microservies.order.dto.OrderRequest;
import com.rakesh.microservies.order.model.Order;
import com.rakesh.microservies.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public void placeOrder(OrderRequest request){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        order.setPrice(request.getPrice());
        order.setSkuCode(request.getSkuCode());
        order.setQuantity(request.getQuantity());
        orderRepository.save(order);

    }
}
