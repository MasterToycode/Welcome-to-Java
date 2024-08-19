package org.example.pro_2.Service.Impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.pro_2.Mapper.OrderMapper;
import org.example.pro_2.pojo.Order;
import org.example.pro_2.pojo.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public Order findByorderID(int orderId) {
        return orderMapper.findByorderID(orderId);
    }

    @Override
    public List<Map<String, Object>>  getOrderDetails(int orderDetailId) {
        List<Map<String, Object>> orders = orderMapper.selectOrderDetailsByOrderId(orderDetailId);
        if (orders != null && !orders.isEmpty()) {
            return orders;
        } else {
            return null;
        }
    }
    //查询会返回订单的每一项产品的编号、名称、单位、数量、单价和总价


    @Override
    public List<Map<String, Object>>  getOrderSummry(int orderId) {
        List<Map<String, Object>> summary = orderMapper.selectOrderSummaryByOrderId(orderId);
        if (summary!=null&&summary.isEmpty()) {
            return summary;
        } else
        {
            return null;
        }
    }

    @Override
    public List<Map<String, Object>> getOrders(int orderId)
    {
        List<Map<String, Object>> maps = orderMapper.selectOrderDetailsAndSummaryByOrderId(orderId);
        if (maps!=null&&maps.isEmpty()){
            return maps;
        }
        else{
            return null;
        }
    }
    //返回整张订单的总金额、订单的订购日期、货主名称和地址。

}
