package com.rakesh.microservies.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient( value = "inventory", url = "http://localhost:8082")
@Component
public interface InventoryClient {

    @RequestMapping(method = RequestMethod.GET , value = "/api/inventory")
    boolean isStock(@RequestParam String skuCode , @RequestParam Integer quantity);

}
