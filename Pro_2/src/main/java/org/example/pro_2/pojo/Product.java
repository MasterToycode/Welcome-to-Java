package org.example.pro_2.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private int productId; // 产品ID
    private String productName; // 产品名称
    private String unitQuantity; // 单位数量
    private double price; // 单价
    private int stockQuantity; // 库存量
    private int orderQuantity; // 订购量
    private int reorderQuantity; // 再订购量
    private boolean suspended; // 中止状态
    private String category;
    private int supplierId;

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", unitQuantity=" + unitQuantity +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                ", orderQuantity=" + orderQuantity +
                ", reorderQuantity=" + reorderQuantity +
                ", suspended=" + suspended +
                '}';
    }
}
