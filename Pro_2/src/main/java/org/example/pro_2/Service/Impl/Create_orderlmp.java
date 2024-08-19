package org.example.pro_2.Service.Impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.pro_2.Mapper.ProductMapper;
import org.example.pro_2.pojo.Order;
import org.example.pro_2.pojo.OrderDetail;
import org.example.pro_2.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Create_orderlmp {
    @Autowired
    private ProductMapper productMapper;

//    public void Create_order(Order order, OrderDetail orderDetail){
//
//        productMapper.insertOrder(order);
//        productMapper.insertOrderDetail(orderDetail);
//    }

    public void insertOrder(Order order)
    {
        productMapper.insertOrder(order);
    }

    public void insertOrderDetail(OrderDetail orderDetail)
    {
        productMapper.insertOrderDetail(orderDetail);
    }

    public void insertOrderProductId(int orderId,  int productId){
        productMapper.insertOrderProductId(orderId,productId);
    }
     public Product findByProductname(String name){
         return productMapper.findByProductname(name);
    }

    public double confirmOrderPayment(int orderId) {
        // 调用Mapper层方法计算订单产品的总价格
        BigDecimal totalPrice = BigDecimal.valueOf(productMapper.calculateTotalPriceByOrderId(orderId));

        // 调用Mapper层方法调用存储过程计算折扣
        BigDecimal discount = productMapper.calculateDiscount(orderId);

        // 计算订单总价
        BigDecimal discountedTotalPrice = totalPrice.subtract(discount);

        // 将BigDecimal类型转换为double类型并返回
        return discountedTotalPrice.doubleValue();
    }

    public void Confirm(int orderId){
        productMapper.confirmOrderPayment(orderId);
    }

    public void  Confrim_money(int orderId,double freight){
        productMapper.Confrim_money(orderId,freight);
    }
}
