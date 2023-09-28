package com.campusdual.appmazing.service;

import com.campusdual.appmazing.api.iCustomerService;
import com.campusdual.appmazing.model.Customer;
import com.campusdual.appmazing.model.Product;
import com.campusdual.appmazing.model.dao.CustomerDao;
import com.campusdual.appmazing.model.dto.CustomerDto;
import com.campusdual.appmazing.model.dto.dtocmapper.CustomerMapper;
import com.campusdual.appmazing.model.dto.dtopmapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service ("CustomerService")
@Lazy
public class CustomerService implements iCustomerService {
@Autowired
private CustomerDao customerDao;
    @Override
    public int insertCustomer(CustomerDto customerDto) {
        Customer customer = CustomerMapper.INSTANCE.toEntity(customerDto);
        this.customerDao.saveAndFlush(customer);
        return customer.getId();
    }

    @Override
    public int deleteCustomer(CustomerDto customerDto) {
        Customer customer = CustomerMapper.INSTANCE.toEntity(customerDto);
        this.customerDao.delete(customer);
        return customer.getId();
    }

    @Override
    public int updateCustomer(CustomerDto customerDto) {
        return this.insertCustomer(customerDto);
    }

    @Override
    public CustomerDto queryCustomer(CustomerDto customerDto) {
        Customer customer = CustomerMapper.INSTANCE.toEntity(customerDto);
        Customer customerFinal = this.customerDao.getReferenceById(customer.getId());
        return CustomerMapper.INSTANCE.toDTO(customerFinal);
    }

    @Override
    public List<CustomerDto> queryAllCustomer() {
        return CustomerMapper.INSTANCE.toDTOList(this.customerDao.findAll());
    }
}
