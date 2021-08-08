package com.sazegar.APISampleV1.repository;

import com.sazegar.APISampleV1.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Long> {
}
