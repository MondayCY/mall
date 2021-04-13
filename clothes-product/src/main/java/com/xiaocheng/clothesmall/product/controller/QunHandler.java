package com.xiaocheng.clothesmall.product.controller;

import com.xiaocheng.clothesmall.product.entity.Qun;

import com.xiaocheng.clothesmall.product.repository.QunRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/qun")
public class QunHandler {
    @Autowired
    private QunRepository qunRepository;
    @GetMapping("/findAll")
    public List<Qun> findAll()
    {
        return qunRepository.findAll();
    }
}
