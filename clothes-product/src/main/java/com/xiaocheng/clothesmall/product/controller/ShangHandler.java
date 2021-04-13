package com.xiaocheng.clothesmall.product.controller;

import com.xiaocheng.clothesmall.product.entity.Shang;
import com.xiaocheng.clothesmall.product.repository.ShangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shang")
public class ShangHandler {
    @Autowired
    private ShangRepository shangRepository;
    @GetMapping("/findAll")
    public List<Shang> findAll()
    {
        return shangRepository.findAll();
    }
}
