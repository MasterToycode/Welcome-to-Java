package org.example.pro_2.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {
    private int orderDetailId; // 订单明细ID
    private int orderId; // 订单ID
    private int productId; // 产品ID
    private int quantity; // 数量
}
