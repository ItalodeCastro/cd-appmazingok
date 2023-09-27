package com.campusdual.appmazing.model.api;

import com.campusdual.appmazing.model.dto.CustomerDto;

import java.util.List;

public interface iCustomersService {
    //Metodos CRUD
    int insertCustomer(CustomerDto customer);
    int deleteCustomer(CustomerDto customer);
    int updateCustomer(CustomerDto customer);
    //Metodo mediante 1 atributo recoger TODA la info de ese objeto
    CustomerDto queryCustomer(CustomerDto customer);

    //Metodo para listar todos los Customers de la base de datos
    List<CustomerDto> queryAllCustomer();
}
