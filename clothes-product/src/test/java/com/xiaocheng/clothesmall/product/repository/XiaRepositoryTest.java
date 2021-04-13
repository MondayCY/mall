package com.xiaocheng.clothesmall.product.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class XiaRepositoryTest {
    @Autowired
    private XiaRepository xiaRepository;
    @Test
    void findAll()
    {
        System.out.println(xiaRepository.findAll());
    }

}