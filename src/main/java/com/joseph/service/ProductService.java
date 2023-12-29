package com.joseph.service;

import com.joseph.entity.Customer;
import com.joseph.entity.Product;

import java.util.List;

public interface ProductService {

    public List<Product> getProducts();

    public void saveProduct(Product theProduct);

    public Product getProduct(int id);

    public void deleteProduct(int theId);
}
