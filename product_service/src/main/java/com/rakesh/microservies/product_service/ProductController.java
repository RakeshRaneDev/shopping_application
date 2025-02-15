package com.rakesh.microservies.product_service;

import com.rakesh.microservies.product_service.dto.ProductRequest;
import com.rakesh.microservies.product_service.model.Product;
import com.rakesh.microservies.product_service.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")

@Slf4j
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product createProduct(@RequestBody ProductRequest request){
        return productService.createProduct(request);
    }

    @GetMapping
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }
}
