package com.example.adega.services;

import com.example.adega.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private List<Product> products = new ArrayList<>();

    public void addProduct(String name, String price) {
        products.add(new Product(null, name, price));
    }

    public List<Product> getProducts() {
        return products;
    }
}
