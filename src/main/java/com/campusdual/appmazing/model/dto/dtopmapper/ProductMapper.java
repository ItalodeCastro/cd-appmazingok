package com.campusdual.appmazing.model.dto.dtopmapper;

import com.campusdual.appmazing.model.Product;
import com.campusdual.appmazing.model.dto.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductMapper {
    //Instanciamos la clase Mapper que trabaja directamente por detrás sin que hagamos nada mas. utiliza 3 metodos
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    //Pasamos un objeto tipo Product para convertirlo en un ProductDto mediante el metodo toDTO
    ProductDto toDTO (Product product);
    //Cogemos una lista de Products y la convertimos a una lista de elementos DTO (no existe al revés DTO A  no DTO)
    List<ProductDto> toDTOList(List<Product> products);
    //Converimos un ProductDTO a un Objeto Product, mediante el metodo toEntity
    Product toEntity(ProductDto productDto);
}