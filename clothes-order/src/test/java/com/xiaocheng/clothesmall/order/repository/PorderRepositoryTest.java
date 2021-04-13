package com.xiaocheng.clothesmall.order.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PorderRepositoryTest {
    @Autowired
    private PorderRepository porderRepository;
    @Test
    void findAll()
    {
        System.out.println(porderRepository.findAll());
    }
}