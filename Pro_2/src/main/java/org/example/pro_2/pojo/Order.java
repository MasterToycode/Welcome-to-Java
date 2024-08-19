package org.example.pro_2.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {
    private int orderId; // 订单ID
    private String customerId; // 客户ID
    private int employeeId; // 雇员ID
    private LocalDateTime orderDate; // 订单日期
    private LocalDateTime arrivalDate; // 到货日期
    private LocalDateTime paymentConfirmationDate; // 货款确认日期
    private double freight; // 运费
    private String shipperName; // 货主名称
    private String shipperAddress; // 货主地址
    private String shipperCity; // 货主城市
    private String shipperRegion; // 货主地区
    private String shipperPostalCode; // 货主邮政编码
    private String shipperCountry; // 货主国家
    private LocalDateTime lastModifiedTime; // 最后修改时间
    private int productId;
    private int quantity;
}
