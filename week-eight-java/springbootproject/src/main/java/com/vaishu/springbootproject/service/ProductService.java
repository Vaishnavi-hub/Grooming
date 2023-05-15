package com.vaishu.springbootproject.service;

import com.vaishu.springbootproject.dto.ProductDto;
import com.vaishu.springbootproject.dto.ProductDtoPriceOnly;
import com.vaishu.springbootproject.model.Product;

import java.util.List;

public interface ProductService {

    ProductDto addProduct(ProductDto productDto);

    List<ProductDto> showAllProducts();

    ProductDto getProductById(Long pid);

    List<ProductDto> getProductByName(String pname);

    List<ProductDto> filterProductByCategory(String category);

    ProductDto updateProduct(Long pid, ProductDto productDto);

    ProductDto updatePriceOfProduct(Long pid, ProductDtoPriceOnly productDto);

    void deleteProduct(Long pid);

    List<ProductDto> filterProductByPriceGreaterThan(Double price);

    List<ProductDto> filterProductByPriceLessThan(Double price);

    List<ProductDto> filterProductByPrice(Double price);
}
