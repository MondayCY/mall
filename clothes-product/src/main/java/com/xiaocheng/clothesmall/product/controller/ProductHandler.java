package com.xiaocheng.clothesmall.product.controller;

import com.xiaocheng.clothesmall.product.entity.Product;
import com.xiaocheng.clothesmall.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductHandler {
    @Autowired
    private ProductRepository productRepository;
@GetMapping("/findAll/{page}/{size}")
    public Page<Product> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
    Pageable pageable = PageRequest.of(page-1,size);
    return productRepository.findAll(pageable);
}
    @PostMapping("/save")
public String save(@RequestBody Product product){

  Product result =  productRepository.save(product);
  if (result != null)
  {
      return "success";
  }
  else {
      return "failed";
  }

}
@DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id)
{
    productRepository.deleteById(id);

}
@GetMapping("/findAll")
    public List<Product> findAll()
{
    return productRepository.findAll();
}

}
