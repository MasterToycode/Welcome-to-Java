package org.example.pro_2.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface EmployeeMapper {

    //统计不同地区客户的订货量，以表格、曲线图、柱图方式呈现
    @Select("SELECT o.shipperCity AS region, SUM(od.quantity) AS totalQuantity " +
            "FROM [class_do].[dbo].[Order] o " +
            "JOIN [class_do].[dbo].[OrderDetail] od ON o.orderId = od.orderId " +
            "GROUP BY o.shipperCity")
    List<Map<String, Object>> getOrderQuantityByRegion();


    //统计不同季节的订货量，以表格、曲线图、柱图方式呈现
    @Select("SELECT " +
            "CASE " +
            "WHEN MONTH(o.orderDate) IN (3, 4, 5) THEN '春季' " +
            "WHEN MONTH(o.orderDate) IN (6, 7, 8) THEN '夏季' " +
            "WHEN MONTH(o.orderDate) IN (9, 10, 11) THEN '秋季' " +
            "WHEN MONTH(o.orderDate) IN (12, 1, 2) THEN '冬季' " +
            "END AS season, " +
            "SUM(od.quantity) AS totalQuantity " +
            "FROM [class_do].[dbo].[Order] o " +
            "JOIN [class_do].[dbo].[OrderDetail] od ON o.orderId = od.orderId " +
            "GROUP BY " +
            "CASE " +
            "WHEN MONTH(o.orderDate) IN (3, 4, 5) THEN '春季' " +
            "WHEN MONTH(o.orderDate) IN (6, 7, 8) THEN '夏季' " +
            "WHEN MONTH(o.orderDate) IN (9, 10, 11) THEN '秋季' " +
            "WHEN MONTH(o.orderDate) IN (12, 1, 2) THEN '冬季' " +
            "END")
    List<Map<String, Object>> getShippingQuantityBySeason();


    //统计每家供应商供应产品的单价总金额
    @Select("SELECT s.companyName, SUM(p.price) AS totalAmount " +
            "FROM [class_do].[dbo].[Supplier] s " +
            "JOIN [class_do].[dbo].[Product] p ON s.supplierId =p.supplierId " +
            "GROUP BY s.supplierId, s.companyName")
    List<Map<String, Object>> getTotalAmountBySupplier();


    //统计各运货商承接的订单数量
    @Select("SELECT s.companyName, COUNT(od.orderId) AS orderCount " +
            "FROM [class_do].[dbo].[Supplier] s " +
            "JOIN [class_do].[dbo].[Product] p ON s.supplierId = p.supplierId " +
            "JOIN [class_do].[dbo].[OrderDetail] od ON p.productId = od.productId " +
            "GROUP BY s.supplierId, s.companyName")
    List<Map<String, Object>> getOrderCountBySupplier();


    //统计同一类别下不同供应商供应的产品数量
    @Select("SELECT p.category,s.companyName AS supplierName, COUNT(p.productId) AS productCount " +
            "FROM [class_do].[dbo].[Product] p " +
            "JOIN [class_do].[dbo].[Supplier] s ON p.supplierId = s.supplierId " +
            "WHERE p.category = #{category} " +
            "GROUP BY p.category, p.supplierId, s.companyName")
    List<Map<String, Object>> getProductCountByCategoryAndSupplier(@Param("category") String category);


}
