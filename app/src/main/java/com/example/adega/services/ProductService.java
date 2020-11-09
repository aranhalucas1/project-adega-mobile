package com.example.adega.services;

import android.text.Editable;
import android.widget.EditText;

import com.example.adega.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {



    private List<Product> products = new ArrayList<>();

    public void addProduct(Editable name, Editable price) {
        String na = name.toString();
        String pr = price.toString();
        System.out.println("Name: " + na + ", Price: " + pr);

       // products.add(new Product(null, name.getText().toString(), price.getText().toString()));
    }

    public List<Product> getProducts() {
        return products;
    }
}
