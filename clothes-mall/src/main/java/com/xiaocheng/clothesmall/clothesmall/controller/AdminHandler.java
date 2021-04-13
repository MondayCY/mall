package com.xiaocheng.clothesmall.clothesmall.controller;

import com.xiaocheng.clothesmall.clothesmall.entity.Admin;
import com.xiaocheng.clothesmall.clothesmall.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/login")
public class AdminHandler {
    @Autowired
    private AdminRepository adminRepository;
    @GetMapping("/findAll")
    public List<Admin> findAll()
    {
        return adminRepository.findAll();
    }
}
