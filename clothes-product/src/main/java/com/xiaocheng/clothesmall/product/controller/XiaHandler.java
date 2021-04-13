package com.xiaocheng.clothesmall.product.controller;

import com.xiaocheng.clothesmall.product.entity.Xia;

import com.xiaocheng.clothesmall.product.repository.XiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/xia")
public class XiaHandler {
    @Autowired
    private XiaRepository xiaRepository;
    @GetMapping("/findAll")
    public List<Xia> findAll()
    {
        return xiaRepository.findAll();
    }
}
