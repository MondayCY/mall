package com.xiaocheng.clothesmall.order;

import com.xiaocheng.clothesmall.order.entity.Porder;
import com.xiaocheng.clothesmall.order.repository.PorderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClothesPorderApplicationTests {
@Autowired
private PorderRepository repository;
    @Test
    void contextLoads() {
    }
    @Test
    void findById(){
        Porder porder = repository.findById(1).get();
        System.out.println(porder);

    }
    @Test
    void save(){

    }
    @Test
    void update(){
//        Porder porder =new Porder();
//        porder.setId(1);
//        porder.setStatus("已发货");
//        Porder porder1 =  repository.save(porder);
//        System.out.println(porder1);

    }

}
