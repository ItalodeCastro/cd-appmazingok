package com.campusdual.appmazing.model.dto.dtomapper;

import com.campusdual.appmazing.model.Customer;
import com.campusdual.appmazing.model.dto.CustomerDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CustomerMapper {
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);
    CustomerDto toDTO(Customer customer);
    List<CustomerDto> toDTOList(List<Customer> customers);

    Customer toEntity(CustomerDto customerDto);
}
