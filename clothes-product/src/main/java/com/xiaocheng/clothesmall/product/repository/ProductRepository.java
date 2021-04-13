package com.xiaocheng.clothesmall.product.repository;

import com.xiaocheng.clothesmall.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {


}
