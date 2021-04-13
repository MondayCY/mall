package com.xiaocheng.clothesmall.product.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShangRepositoryTest {
    @Autowired
    private ShangRepository shangRepository;
    @Test
    void findAll(){
        System.out.println(shangRepository.findAll());
    }

}