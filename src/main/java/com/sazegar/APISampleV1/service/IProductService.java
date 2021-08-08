package com.sazegar.APISampleV1.service;

import com.sazegar.APISampleV1.model.Product;

import java.util.List;

public interface IProductService {
    Product saveProduct(Product product);

    void deleteProduct(Long productId);

    List<Product> findAllProducts();
}
