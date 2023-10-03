package com.campusdual.appmazing.api;

import com.campusdual.appmazing.model.dto.ProductDto;

import java.math.BigDecimal;
import java.util.List;

public interface iProductService {
    List<ProductDto> queryAllProducts();

    ProductDto queryProduct(ProductDto productDto);
    int insertProduct(ProductDto productDto);
    int updateProduct(ProductDto productDto);
    int deleteProduct(ProductDto productDto);
    int buyProduct(ProductDto product, int quantity);

    BigDecimal totalPrice(ProductDto product, int quantity);
}
