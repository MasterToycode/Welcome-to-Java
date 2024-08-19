package org.example.pro_2.Mapper;

import org.apache.ibatis.annotations.*;
import org.example.pro_2.pojo.Order;
import org.example.pro_2.pojo.OrderDetail;
import org.example.pro_2.pojo.Product;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface ProductMapper {

    @Select("SELECT * from Product where productId=#{productId}")
    Product findByProductID(String productId);

    @Select("select productId, productName, unitQuantity, price, stockQuantity from Product where category = #{category}")
    List<Product> selectProductsByCategory(@Param("category")String category);

    @Select("select distinct productName, unitQuantity, price, stockQuantity from Product where category = #{category}")
    List<Product> selectDistinctProductsByCategory(String category);

    @Select("select * from Product where productName=#{name}")
    Product findByProductname(String name);

    @Insert("INSERT INTO [class_do].[dbo].[Order] ([customerId], [employeeId], [orderDate], [arrivalDate], [paymentConfirmationDate], [freight], [shipperName], [shipperAddress], [shipperCity], [shipperRegion], [shipperPostalCode], [shipperCountry] ,[quantity]) " +
            "VALUES (#{customerId}, #{employeeId}, GETDATE(), NULL, NULL, #{freight}, #{shipperName}, #{shipperAddress}, #{shipperCity}, #{shipperRegion}, #{shipperPostalCode}, #{shipperCountry},#{quantity})")
    @Options(useGeneratedKeys = true, keyProperty = "orderId", keyColumn = "orderId")
    void insertOrder(Order order);

    @Insert("UPDATE [Order] " +
            "SET productId = #{productId} " +
            "WHERE orderId = #{orderId}")
    void insertOrderProductId(int orderId, int productId);

    @Insert("INSERT INTO [class_do].[dbo].[OrderDetail] ([orderId], [productId], [quantity]) " +
            "VALUES (#{orderId}, #{productId}, #{quantity})")
    void insertOrderDetail(OrderDetail orderDetail);


    //计算订单中的产品总价格
    @Select("SELECT SUM(p.price * od.quantity) AS total_price " +
            "FROM [class_do].[dbo].[Order] o " +
            "JOIN [class_do].[dbo].[OrderDetail] od ON o.orderId = od.orderId " +
            "JOIN [class_do].[dbo].[Product] p ON od.productId = p.productId " +
            "WHERE o.orderId = #{orderId}")
    double calculateTotalPriceByOrderId(@Param("orderId") int orderId);

    // 修改订单的支付确认日期
    @Update("UPDATE [class_do].[dbo].[Order] " +
            "SET paymentConfirmationDate = GETDATE() " +
            "WHERE orderId = #{orderId}")
    void confirmOrderPayment(int orderId);

    // 调用存储过程计算折扣
    @Select("EXEC [dbo].[CalculateDiscount] #{orderId}")
    BigDecimal calculateDiscount(int orderId);

    @Update("UPDATE [class_do].[dbo].[Order] " +
            "SET freight = #{freight} " +
            "WHERE orderId = #{orderId}")
    void Confrim_money(int orderId,double freight);


}
