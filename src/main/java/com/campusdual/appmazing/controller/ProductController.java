package com.campusdual.appmazing.controller;

import com.campusdual.appmazing.api.iProductService;
import com.campusdual.appmazing.model.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    iProductService productService;
    @GetMapping public String testController(){
        return "test controller for Products works!";
    }

    @PostMapping public String testController(@RequestBody String name){
        return ("Product controller method Post works " + name);
    }
    @GetMapping(value = "/testMethod")
        public String testControllerMethod(){
        return "Product Controller Method works!" ;
    }

    @PostMapping(value = "/get")
    public ProductDto queryProduct(@RequestBody ProductDto product){
        return this.productService.queryProduct(product);
        }
    @GetMapping(value ="/getAll")
        public List<ProductDto> queryALLProducts(){
        return this.productService.queryAllProducts();
        }
    }