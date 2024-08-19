package org.example.pro_2.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.pro_2.pojo.Order;
import org.example.pro_2.pojo.OrderDetail;

import java.util.List;
import java.util.Map;

@Mapper
public interface OrderMapper {

    @Select("SELECT * from Order where orderId=#{orderId}")
    Order findByorderID(@Param("orderId") int orderId);

    //这个 SQL 查询会返回订单的每一项产品的编号、名称、单位、数量、单价和总价。
    @Select("SELECT " +
            "od.orderId, " +
            "p.productId, " +
            "p.productName, " +
            "p.unitQuantity, " +
            "od.quantity, " +
            "p.price, " +
            "(od.quantity * p.price) AS totalPrice " +
            "FROM " +
            "[class_do].[dbo].[OrderDetail] AS od " +
            "JOIN " +
            "[class_do].[dbo].[Product] AS p ON od.productId = p.productId " +
            "WHERE " +
            "od.orderId = #{orderId}")
    List<Map<String, Object>>  selectOrderDetailsByOrderId(int orderId);


    //订单的订购日期、货主名称和地址。
    @Select("SELECT " +
            "o.orderDate, " +
            "o.shipperName, " +
            "o.shipperAddress " +
            "FROM " +
            "[class_do].[dbo].[Order] AS o " +
            "WHERE " +
            "o.orderId = #{orderId}")
    List<Map<String, Object>> selectOrderSummaryByOrderId(int orderId);


    @Select("SELECT " +
            "od.orderId, " +
            "p.productId, " +
            "p.productName, " +
            "p.unitQuantity, " +
            "od.quantity, " +
            "p.price, " +
            "(od.quantity * p.price) AS totalPrice, " +
            "o.orderDate, " +
            "o.shipperName, " +
            "o.shipperAddress " +
            "FROM " +
            "[class_do].[dbo].[OrderDetail] AS od " +
            "JOIN " +
            "[class_do].[dbo].[Product] AS p ON od.productId = p.productId " +
            "JOIN " +
            "[class_do].[dbo].[Order] AS o ON od.orderId = o.orderId " +
            "WHERE " +
            "od.orderId = #{orderId}")
    List<Map<String, Object>> selectOrderDetailsAndSummaryByOrderId(int orderId);


}
