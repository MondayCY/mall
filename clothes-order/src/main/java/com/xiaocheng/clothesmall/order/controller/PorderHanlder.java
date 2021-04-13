package com.xiaocheng.clothesmall.order.controller;

import com.xiaocheng.clothesmall.order.entity.Porder;
import com.xiaocheng.clothesmall.order.repository.PorderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class PorderHanlder {
    @Autowired
    private PorderRepository porderRepository;
    @GetMapping("/findAll/{page}/{size}")
    public Page<Porder> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        Pageable pageable = PageRequest.of(page-1,size);
        return porderRepository.findAll(pageable);
    }
    @GetMapping("/findById/{id}")
    public Porder findById(@PathVariable("id") Integer id)
    {
        return  porderRepository.findById(id).get();

    }

    @PutMapping("/update")
    public  String update(@RequestBody Porder porder)
    {
        Porder result = porderRepository.save(porder);
        if (result == null) {
            return "error";
        }
        else {
            return "success";
        }
    }
    @PostMapping("/save")
    public String save(@RequestBody Porder porder){

        Porder result =  porderRepository.save(porder);
        if (result != null)
        {
            return "success";
        }
        else {
            return "failed";
        }

    }
    @GetMapping("/findAll")
    public List<Porder> findAll()
    {
        return porderRepository.findAll();
    }

}
