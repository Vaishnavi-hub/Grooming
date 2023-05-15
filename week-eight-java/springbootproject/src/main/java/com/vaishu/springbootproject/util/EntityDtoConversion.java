package com.vaishu.springbootproject.util;

import com.vaishu.springbootproject.dto.ProductDto;
import com.vaishu.springbootproject.model.Product;

public class EntityDtoConversion {

    public static ProductDto toDto(Product product){
        return new ProductDto(
                product.getPid(), product.getPname(), product.getPrice(), product.getCategory()
        );
    }

    public static Product toEntity(ProductDto productDto){
        return new Product(
                productDto.getPid(), productDto.getPname(), productDto.getPrice(), productDto.getCategory()
        );
    }
}
