package com.naveed.petstoreapp.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.naveed.petstoreapp.entities.Product;

@Service
public class ProductService {
    Map<Integer, Product> products = new HashMap<>();

    public String addProduct() {
        Product p1 = new Product();
        p1.setId(10);
        p1.setName("neha");
        p1.setPrice(670.00);
        p1.setDescription("desc p1");
        products.put(p1.getId(),p1);

        Product p2 = new Product();
        p2.setId(20);
        p2.setName("rahul");
        p2.setPrice(670.00);
        p2.setDescription("desc p2");
        products.put(p2.getId(),p2);
        return "Product Added";
    }
    public List<Product> getAll(){
        return new ArrayList<Product>(products.values());
    }

    public String deletePtoduct(Integer id){
        products.remove(id);
        return "Product Deleted";
    }
}
