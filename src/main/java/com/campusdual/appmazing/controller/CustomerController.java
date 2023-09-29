package com.campusdual.appmazing.controller;

import com.campusdual.appmazing.api.iCustomerService;
import com.campusdual.appmazing.model.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    iCustomerService CustomerService;
    @GetMapping public String testController(){
        return "Test controllers for Get method works!!";
    }
    @PostMapping public String testController(@RequestBody String name){
        return "Test Controller for Post method works: " + name;
    }

    @PostMapping(value = "/get")
    public CustomerDto queryCustomer(@RequestBody CustomerDto customer){
        return this.CustomerService.queryCustomer(customer);
    }

    @GetMapping(value = "/getAll")
    public List<CustomerDto> queryAllCustomer(){
        return this.CustomerService.queryAllCustomer();
    }

    @PostMapping(value = "/add")
    public int insertCustomer(@RequestBody CustomerDto customer){
        return this.CustomerService.insertCustomer(customer);
    }

    @PutMapping(value = "/update")
    public int updateCustomer(@RequestBody CustomerDto customer){
        return this.CustomerService.updateCustomer(customer);
    }

    @DeleteMapping(value = "/delete")
    public int deleteCustomer(@RequestBody CustomerDto customer){
        return this.CustomerService.deleteCustomer(customer);
    }

}
