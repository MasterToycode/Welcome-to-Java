package org.example.pro_2.Service.Impl;


import org.example.pro_2.pojo.Product;

import java.util.List;

public interface ProductService {
    Product findByProductID(String productId);
    List<Product> getProductsByCategory(String category);
    List<Product> selectDistinctProductsByCategory(String category);
}
