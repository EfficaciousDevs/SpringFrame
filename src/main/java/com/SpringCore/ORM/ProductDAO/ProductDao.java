package com.SpringCore.ORM.ProductDAO;

import com.SpringCore.ORM.ProductEntity.Product;

import java.util.List;

public interface ProductDao {
    int create(Product product);

    void update(Product product);

    void delete(Product product);

    Product find(int id);

    List<Product> findAll();
}
