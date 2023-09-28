package com.campusdual.appmazing.api;

import com.campusdual.appmazing.model.dto.CustomerDto;

import java.util.List;

public interface iCustomerService {
    //Metodos CRUD
    int insertCustomer(CustomerDto customerDto);
    int deleteCustomer(CustomerDto customerDto);
    int updateCustomer(CustomerDto customerDto);
    //Metodo mediante 1 atributo recoger TODA la info de ese objeto
    CustomerDto queryCustomer(CustomerDto customerDto);

    //Metodo para listar todos los Customers de la base de datos
    List<CustomerDto> queryAllCustomer();
}
