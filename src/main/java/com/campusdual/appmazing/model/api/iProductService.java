package com.campusdual.appmazing.model.api;

import com.campusdual.appmazing.model.dto.ProductDto;

import java.util.List;

public interface iProductService {
    ProductDto queryProduct(ProductDto product);
    List<ProductDto> queryAllProducts();

    int insertProduct(ProductDto product);
    int updateProduct(ProductDto product);
    int deleteProduct(ProductDto product);
}
