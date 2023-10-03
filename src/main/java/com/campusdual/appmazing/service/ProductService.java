package com.campusdual.appmazing.service;

import com.campusdual.appmazing.api.iProductService;
import com.campusdual.appmazing.model.Product;
import com.campusdual.appmazing.model.dto.ProductDto;
import com.campusdual.appmazing.model.dao.ProductDao;
import com.campusdual.appmazing.model.dto.dtomapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service("ProductService")
@Lazy
public class ProductService implements iProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public ProductDto queryProduct(ProductDto productDto) {
        Product product = ProductMapper.INSTANCE.toEntity(productDto);
        Product productFinal = this.productDao.getReferenceById(product.getId());
        return ProductMapper.INSTANCE.toDTO(productFinal);
    }


    @Override
    public List<ProductDto> queryAllProducts() {
        return ProductMapper.INSTANCE.toDTOList(this.productDao.findAll());
    }

    @Override
    public int insertProduct(ProductDto productDto) {
        Product product = ProductMapper.INSTANCE.toEntity(productDto);
        this.productDao.saveAndFlush(product);
        return product.getId();
    }

    @Override
    public int updateProduct(ProductDto productDto) {
        return this.insertProduct(productDto);
    }

    @Override
    public int deleteProduct(ProductDto productDto) {
        Product product = ProductMapper.INSTANCE.toEntity(productDto);
        this.productDao.delete(product);
        return product.getId();
    }

    @Override
    public int buyProduct(ProductDto product, int quantity) {
        ProductDto productToBuy = this.queryProduct(product);
        if (productToBuy.isActive() && quantity <= productToBuy.getStock()){
            productToBuy.setStock(productToBuy.getStock()-quantity);
            this.updateProduct(productToBuy);
        }
        return productToBuy.getStock();
    }
    @Override
    public BigDecimal totalPrice (ProductDto product, int quantity){
        BigDecimal price = product.getPrice();
        BigDecimal quantityDec = new BigDecimal(quantity);
        return price.multiply(quantityDec);
    }
}