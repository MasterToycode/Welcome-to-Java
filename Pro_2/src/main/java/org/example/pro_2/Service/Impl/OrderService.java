package org.example.pro_2.Service.Impl;


import org.example.pro_2.pojo.Order;
import org.example.pro_2.pojo.OrderDetail;

import java.util.List;
import java.util.Map;


public interface OrderService {
    Order findByorderID(int orderId);
    List<Map<String, Object>>  getOrderDetails(int orderId);
    List<Map<String, Object>>  getOrderSummry(int orderId);
    List<Map<String,Object>> getOrders(int orderId);
}
