package com.campusdual.appmazing.controller;

import com.campusdual.appmazing.api.iProductService;
import com.campusdual.appmazing.model.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    iProductService productService;
    @GetMapping public String testController(){
        return "test controller for Products works!";
    }

    @PostMapping public String testController(@RequestBody String name){
        return ("Product controller method Post works " + name);
    }
    @GetMapping(value = "/testMethod")
        public String testControllerMethod(){ return "Product Controller Method works!" ;
    }

    @PostMapping(value = "/get")
        public ProductDto queryProduct(@RequestBody ProductDto product){
        return this.productService.queryProduct(product);
        }
    @GetMapping(value ="/getAll")
        public List<ProductDto> queryALLProducts(){
        return this.productService.queryAllProducts();
        }

    @PostMapping(value = "/add")
        public int insertProduct(@RequestBody ProductDto product){
        return this.productService.insertProduct(product);
        }
    @PutMapping(value = "/update")
        public int productUpdate(@RequestBody ProductDto product){
        return this.productService.updateProduct(product);
    }

    @DeleteMapping(value = "/delete")
    public int productDelete(@RequestBody ProductDto product){
        return this.productService.deleteProduct(product);
    }

    @PutMapping(value= "/buy")
    public int buyProduct(@RequestBody ProductDto productDTO) {
        return this.productService.buyProduct(productDTO,5);
    }
    /*@PostMapping(value = "/price")
    public BigDecimal totalPrice(@RequestBody ProductDto productDto){
        return this.productService.totalPrice();
    }

      @PostMapping(value= "/buy5")
    public int buyProduct5(@RequestBody ProductDTO productDTO) {
        int quantity = 5;
        return this.productService.buyProduct(productDTO,quantity);
    }

    @PostMapping(value= "/buy")
    public int buyProduct(@RequestBody Map<String, Integer> body) {
        int quantity = body.get("quantity");
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(body.get("id"));
        return this.productService.buyProduct(productDTO,quantity);
    }
     */
}
//El controlador afecta a "/products", tras añadir esa etiqueta en la ruta, debemos añadir a mayores el siguiente metodo
//que queramos utilizar y comprobar si es tipo Post, Get etc, aplicando si necesita o no de un Body. Hacen referencia
//a los métodos de la clase ProductService mediante la interfaz de ProductService.