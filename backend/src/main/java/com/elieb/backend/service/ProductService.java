package com.elieb.backend.service;

import com.elieb.backend.model.Product;
import com.elieb.backend.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    
    private final ProductRepository productRepository;
    
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }
    
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
    
}
