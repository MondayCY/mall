package com.xiaocheng.clothesmall.product.repository;

import com.xiaocheng.clothesmall.product.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;


@SpringBootTest
class ProductRepositoryTest {
    @Autowired
    private ProductRepository productRepository;
    @Test
    void findAll()
    {
        System.out.println(productRepository.findAll());
    }
//    @Test
//    void findShang()
//    {
//        System.out.println(productRepository.findAll());
//    }

}