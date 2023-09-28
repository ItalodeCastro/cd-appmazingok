package com.campusdual.appmazing.api;

import com.campusdual.appmazing.model.dto.ProductDto;

import java.util.List;

public interface iProductService {
    List<ProductDto> queryAllProducts();

    ProductDto queryProduct(ProductDto productDto);
    int insertProduct(ProductDto productDto);
    int updateProduct(ProductDto productDto);
    int deleteProduct(ProductDto productDto);
}
