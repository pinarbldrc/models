package com.moduleProduct.repository.repo;

import com.moduleProduct.repository.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
