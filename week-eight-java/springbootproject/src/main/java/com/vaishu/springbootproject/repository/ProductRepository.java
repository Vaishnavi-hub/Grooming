package com.vaishu.springbootproject.repository;

import com.vaishu.springbootproject.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    @Override
    List<Product> findAll();

    List<Product> findByPnameIgnoreCase(String pname);

    List<Product> findByCategoryIgnoreCase(String category);

    List<Product> findByPriceGreaterThan(Double price);

    List<Product> findByPriceLessThan(Double price);

    List<Product> findByPrice(Double price);
}
