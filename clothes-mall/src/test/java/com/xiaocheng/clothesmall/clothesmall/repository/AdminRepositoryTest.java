package com.xiaocheng.clothesmall.clothesmall.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AdminRepositoryTest {
    @Autowired
    private AdminRepository adminRepository;
    @Test
    void findAll(){
        System.out.println(adminRepository.findAll());
    }

}