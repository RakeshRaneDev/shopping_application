package com.rakesh.microservies.order.controller;

import com.rakesh.microservies.order.dto.OrderRequest;
import com.rakesh.microservies.order.repository.OrderRepository;
import com.rakesh.microservies.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void placeOrder(@RequestBody OrderRequest request){
        orderService.placeOrder(request);

    }

}
