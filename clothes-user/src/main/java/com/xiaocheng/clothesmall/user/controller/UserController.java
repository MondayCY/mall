package com.xiaocheng.clothesmall.user.controller;



import com.xiaocheng.clothesmall.user.entity.User;
import com.xiaocheng.clothesmall.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//import java.util.List;
//import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/findAll/{page}/{size}")
    public Page<User> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        Pageable pageable = PageRequest.of(page - 1, size);
        return userRepository.findAll(pageable);
    }
    @PostMapping("/save")
    public String save(@RequestBody User user){

        User result =  userRepository.save(user);
        if (result != null)
        {
            return "success";
        }
        else {
            return "failed";
        }

    }
    @PutMapping("/update")
    public  String update(@RequestBody User user)
    {
        User result = userRepository.save(user);
        if (result == null) {
            return "error";
        }
        else {
            return "success";
        }
    }
    @GetMapping("/findAll")
    public List<User> findAll()
    {
        return userRepository.findAll();

    }
    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") Integer id)
    {
        return  userRepository.findById(id).get();

    }
}