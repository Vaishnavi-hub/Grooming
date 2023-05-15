package com.vaishu.springbootproject.service;

import com.vaishu.springbootproject.dto.ProductDto;
import com.vaishu.springbootproject.dto.ProductDtoPriceOnly;
import com.vaishu.springbootproject.exception.BadRequestException;
import com.vaishu.springbootproject.exception.ProductNotFoundException;
import com.vaishu.springbootproject.model.Product;
import com.vaishu.springbootproject.repository.ProductRepository;
import com.vaishu.springbootproject.util.EntityDtoConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository repository;

    @Override
    public ProductDto addProduct(ProductDto newProductDto) {
        Product product = repository.save(EntityDtoConversion.toEntity(newProductDto));
        return EntityDtoConversion.toDto(product);
    }

    @Override
    public List<ProductDto> showAllProducts() {
        return repository.findAll().
                stream().
                map(EntityDtoConversion::toDto).
                collect(Collectors.toList());
    }

    @Override
    public ProductDto getProductById(Long pid) {
        Product product = repository.findById(pid).orElseThrow(() -> new ProductNotFoundException("Product with PID: " + pid + " not found"));
        return EntityDtoConversion.toDto(product);
    }

    @Override
    public List<ProductDto> getProductByName(String pname) {
        List<ProductDto> productDtoList = repository.findByPnameIgnoreCase(pname).
                    stream().
                    map(EntityDtoConversion::toDto).
                    collect(Collectors.toList());
        if(productDtoList.isEmpty()){
            throw new ProductNotFoundException("No Products available with Name: " + pname);
        }
        return productDtoList;
    }

    @Override
    public List<ProductDto> filterProductByCategory(String category) {
        List<ProductDto> productDtoList = repository.findByCategoryIgnoreCase(category).
                stream().
                map(EntityDtoConversion::toDto).
                collect(Collectors.toList());
        if(productDtoList.isEmpty()){
            throw new ProductNotFoundException("No Products available under Category: " + category);
        }
        return productDtoList;
    }

    @Override
    public ProductDto updateProduct(Long pid, ProductDto productDto) {
        ProductDto updateProductDto = getProductById(pid);
        updateProductDto.setPname(productDto.getPname()==null ? updateProductDto.getPname() : productDto.getPname());
        updateProductDto.setCategory(productDto.getCategory()==null ? updateProductDto.getCategory() : productDto.getCategory());
        updateProductDto.setPrice(productDto.getPrice()==null ? updateProductDto.getPrice() : productDto.getPrice());
        Product updatedProduct = repository.save(EntityDtoConversion.toEntity(updateProductDto));
        return EntityDtoConversion.toDto(updatedProduct);
    }

    @Override
    public ProductDto updatePriceOfProduct(Long pid, ProductDtoPriceOnly productDto) {
        ProductDto updateProductDto = getProductById(pid);
        if(productDto.getPrice() == null){
            throw new BadRequestException("Price value is null in the Request Payload");
        }
        updateProductDto.setPrice(productDto.getPrice());
        Product updatedProduct = repository.save(EntityDtoConversion.toEntity(updateProductDto));
        return EntityDtoConversion.toDto(updatedProduct);
    }

    @Override
    public void deleteProduct(Long pid) {
        repository.findById(pid).orElseThrow(() -> new ProductNotFoundException("Product with PID: " + pid + " not found"));
        repository.deleteById(pid);
    }

    @Override
    public List<ProductDto> filterProductByPriceGreaterThan(Double price) {
        List<ProductDto> productDtoList = repository.findByPriceGreaterThan(price).
                stream().
                map(EntityDtoConversion::toDto).
                collect(Collectors.toList());
        if(productDtoList.isEmpty()){
            throw new ProductNotFoundException("No Products available with Price greater than " + price);
        }
        return productDtoList;
    }

    @Override
    public List<ProductDto> filterProductByPriceLessThan(Double price) {
        List<ProductDto> productDtoList = repository.findByPriceLessThan(price).
                stream().
                map(EntityDtoConversion::toDto).
                collect(Collectors.toList());
        if(productDtoList.isEmpty()){
            throw new ProductNotFoundException("No Products available with Price lesser than " + price);
        }
        return productDtoList;
    }

    @Override
    public List<ProductDto> filterProductByPrice(Double price) {
        List<ProductDto> productDtoList = repository.findByPrice(price).
                stream().
                map(EntityDtoConversion::toDto).
                collect(Collectors.toList());
        if(productDtoList.isEmpty()){
            throw new ProductNotFoundException("No Products available with Price: " + price);
        }
        return productDtoList;
    }

}
