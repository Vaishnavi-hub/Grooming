package com.vaishu.springbootproject.controller;

import com.vaishu.springbootproject.dto.AppResponse;
import com.vaishu.springbootproject.dto.ProductDto;
import com.vaishu.springbootproject.dto.ProductDtoPriceOnly;
import com.vaishu.springbootproject.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping(value = "/add-product")
    public ResponseEntity<ProductDto> addProduct(@Valid @RequestBody ProductDto productDto){
        log.info("Adding new Product");
        return new ResponseEntity<>(service.addProduct(productDto), HttpStatus.CREATED);
    }

    @GetMapping(value = "/all-products")
    public ResponseEntity<List<ProductDto>> showAllProducts(){
        log.info("Showing All Products");
        return new ResponseEntity<>(service.showAllProducts(), HttpStatus.OK);
    }

    @GetMapping(value = "/id/{pid}")
    public ResponseEntity<ProductDto> getProduct(@PathVariable(value = "pid") Long pId){
        log.info("Get Product Details for PID: " + pId);
        return new ResponseEntity<>(service.getProductById(pId), HttpStatus.OK);
    }

    @GetMapping(value = "/search/name/{pname}")
    public ResponseEntity<List<ProductDto>> getProductByName(@PathVariable(value = "pname") String pname){
        log.info("Get Product Details for " + pname);
        return new ResponseEntity<>(service.getProductByName(pname), HttpStatus.OK);
    }

    @GetMapping(value = "/filter/category/{category}")
    public ResponseEntity<List<ProductDto>> filterProductByCategory(@PathVariable(value = "category") String category){
        log.info("Filter Product Details for Category: " + category);
        return new ResponseEntity<>(service.filterProductByCategory(category), HttpStatus.OK);
    }

    @PutMapping(value = "/update-product/{pid}")
    public ResponseEntity<ProductDto> updateProduct(@PathVariable(value = "pid") Long pid, @Valid @RequestBody ProductDto productDto){
        log.info("Updating Product Details for PID: " + pid);
        return new ResponseEntity<>(service.updateProduct(pid, productDto), HttpStatus.OK);
    }

    @PatchMapping(value = "/update-product/{pid}")
    public ResponseEntity<ProductDto> updatePriceOfProduct(@PathVariable(value = "pid") Long pid, @Valid @RequestBody ProductDtoPriceOnly productDto){
        log.info("Updating Price of the Product for PID: " + pid);
        return new ResponseEntity<>(service.updatePriceOfProduct(pid, productDto), HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete-product/{pid}")
    public ResponseEntity<AppResponse> deleteProduct(@PathVariable(value = "pid") Long pid){
        log.info("Deleting Product with PID: " + pid);
        service.deleteProduct(pid);
        return new ResponseEntity<>(new AppResponse(new Date(), "Request Passed", "Product with PID: " + pid + " Deleted Successfully") ,HttpStatus.OK);
    }

    @GetMapping(value = "/filter/price/greater/{price}")
    public ResponseEntity<List<ProductDto>> filterProductByPriceGreaterThan(@PathVariable(value = "price") Double price){
        log.info("Filter Product Details for Price Greater Than: " + price);
        return new ResponseEntity<>(service.filterProductByPriceGreaterThan(price), HttpStatus.OK);
    }

    @GetMapping(value = "/filter/price/lesser/{price}")
    public ResponseEntity<List<ProductDto>> filterProductByPriceLessThan(@PathVariable(value = "price") Double price){
        log.info("Filter Product Details for Price Lesser Than: " + price);
        return new ResponseEntity<>(service.filterProductByPriceLessThan(price), HttpStatus.OK);
    }

    @GetMapping(value = "/filter/price/{price}")
    public ResponseEntity<List<ProductDto>> filterProductByPrice(@PathVariable(value = "price") Double price){
        log.info("Filter Product Details for Price: " + price);
        return new ResponseEntity<>(service.filterProductByPrice(price), HttpStatus.OK);
    }
}
