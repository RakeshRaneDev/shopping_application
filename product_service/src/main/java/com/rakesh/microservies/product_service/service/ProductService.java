package com.rakesh.microservies.product_service.service;

import com.rakesh.microservies.product_service.dto.ProductRequest;
import com.rakesh.microservies.product_service.model.Product;
import com.rakesh.microservies.product_service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;

    public Product createProduct(ProductRequest request) {
        Product product = new Product();
        product.setName(request.getName());
        product.setDescription(request.getDescription());
        product.setPrice(request.getPrice());
        productRepository.save(product);
        log.info("Product has been created");
        return product;
    }

    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
}
