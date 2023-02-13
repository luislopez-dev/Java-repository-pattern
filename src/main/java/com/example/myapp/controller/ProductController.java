package com.example.myapp.controller;

import com.example.myapp.entity.Product;
import com.example.myapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping
    public List<Product> findAll(){
        return productService.findAll();
    }
    @GetMapping("{id}")
    public Product findById(@PathVariable int id){
        return productService.findById(id);
    }
    @PostMapping
    public Product save(@RequestBody Product product){
        productService.saveOrUpdate(product);
        return product;
    }
    @PutMapping
    public Product update(@RequestBody Product product){
        productService.saveOrUpdate(product);
        return product;
    }
    @DeleteMapping("{id}")
    public String delete(@PathVariable int id){
        productService.delete(id);
        return "Product deleted";
    }
}