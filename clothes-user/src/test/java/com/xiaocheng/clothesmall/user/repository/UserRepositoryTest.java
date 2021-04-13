package com.xiaocheng.clothesmall.user.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;
    @Test
    void findAll()
    {
        System.out.println(userRepository.findAll());
    }
    @Test
    void save()
    {

    }
    @Test
    void update() {

    }
    @Test
    void findById(){

    }
}