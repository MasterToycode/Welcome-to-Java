package org.example.pro_2.Service.Impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.pro_2.Mapper.ProductMapper;
import org.example.pro_2.pojo.Product;
import org.example.pro_2.pojo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductMapper productMapper;

    @Override
    public Product findByProductID(String productId)
    {
        return productMapper.findByProductID(productId);
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        List<Product> products = productMapper.selectProductsByCategory(category);
        if (products != null && !products.isEmpty()) {
            return products;
        } else
        {
            return null;
        }
    }

    @Override
    public List<Product> selectDistinctProductsByCategory(String category) {
        List<Product> products = productMapper.selectDistinctProductsByCategory(category);
        if (products != null && !products.isEmpty()) {
            return products;
        } else
        {
            return null;
        }
    }
}
