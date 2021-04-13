package com.xiaocheng.clothesmall.product;

import com.xiaocheng.clothesmall.product.entity.Product;
import com.xiaocheng.clothesmall.product.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClothesProductApplicationTests {
    @Autowired
    private ProductRepository repository;
    @Test
    void contextLoads() {
    }
    @Test
    void save()
    {

    }
    @Test
    void delete()
    {

    }


}
