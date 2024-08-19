package org.example.pro_2.Controller;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.example.pro_2.Service.Impl.Create_orderlmp;
import org.example.pro_2.Service.Impl.CustomerService;
import org.example.pro_2.Service.Impl.OrderService;
import org.example.pro_2.Service.Impl.ProductService;
import org.example.pro_2.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/user/products")
public class User_Function_Controller {
    @Autowired
    private ProductService productService; // 产品服务
    @Autowired
    private OrderService orderService; // 订单服务
    @Autowired
    private Create_orderlmp create_order;
    @Autowired
    private CustomerService customerService;


    // 1.1 按照类别查询浏览可供货产品、单位数量、单价、库存量
    @RequestMapping ("/category")
    public Result<List<Product>> getProductsByCategory(@Param("category") String category)
    {
        List<Product> products = productService.getProductsByCategory(category);
        if (products != null && !products.isEmpty())
        {return Result.success(products);}
        else
        {return Result.error("未找到符合条件的产品");}
    }


    // 1.2 查询浏览同一类别下不同产品
    @RequestMapping("/distinct/category")
    public Result<List<Product>> getDistinctProductsByCategory(@Param("category") String category)
    {
        List<Product> products = productService.selectDistinctProductsByCategory(category);
        if (products != null && !products.isEmpty()) {
            return Result.success(products);
        } else {
            return Result.error("未找到符合条件的产品");
        }
    }



    // 1.3 根据用户请求制订相应订单的明细
    @RequestMapping("/order_details")
    public Result<Map<String,Object>> getOrderDetails(@Param("orderNumber") int orderId)
    {
        List<Map<String, Object>> orderDetails = orderService.getOrderDetails(orderId);
        // 如果订单详情和订单摘要都为空，则表示没有找到对应的订单
        if (orderDetails.isEmpty() )
        {
            return Result.error("没有找到订单号为 " + orderId + " 的订单");
        }
        // 创建一个新的 Map 对象用于存储订单详情和订单摘要
        Map<String, Object> mergedOrder = new HashMap<>();
        // 将订单详情和订单摘要分别作为键值对添加到新的 Map 中
        mergedOrder.put("orderDetails", orderDetails);
        return Result.success(mergedOrder);
    }



    @RequestMapping("/create_order")
    public Result createOrder(String productName,  Order order)
    {
        // 根据产品名字查询产品信息
        Product product = create_order.findByProductname(productName);
        if (product == null)
        {
            return Result.error("找不到对应的产品信息");
        }
        // 创建订单
        create_order.insertOrder(order);
        create_order.insertOrderProductId(order.getOrderId(),product.getProductId());

        // 创建订单明细
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrderId(order.getOrderId());
        orderDetail.setProductId(product.getProductId());
        orderDetail.setQuantity(order.getQuantity());
        create_order.insertOrderDetail(orderDetail);

        // 返回成功消息，提示客户订单已创建
        return Result.success("订单已创建,您的订单ID是"+order.getOrderId());
    }



    //客户接受订单
    @RequestMapping("/accept_order")
    public Result accept_order(String confirm,int orderId)
    {
        if (confirm.equals("Y")&&confirm!=null)
        {
            create_order.Confirm(orderId);
            double payment = create_order.confirmOrderPayment(orderId);
            create_order.Confrim_money(orderId,payment);
            return Result.success("订单接受成功，您需要支付："+payment);
        }

        else return Result.error("订单接受失败");
    }



    //展示所有客户的信息
    @RequestMapping("/showall")
    public Result<List<Customer>> getallcustpmer(){
        List<Customer> allCustomers = customerService.getAllCustomers();
        if (!allCustomers.isEmpty())
        {
            return Result.success(allCustomers);
        }

        else return Result.error("查询失败");
    }



}
