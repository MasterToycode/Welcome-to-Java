package org.example.pro_2.Controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.example.pro_2.Service.Impl.EmplyeeServiceImpl;
import org.example.pro_2.pojo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/employee/products")
public class Employee_Fun_Controller {
    @Autowired
    private EmplyeeServiceImpl emplyeeService;

    @RequestMapping("/quantity/customer")
    public Result<List<Map<String,Object>>> getOrderQuantity()
    {
        List<Map<String, Object>> orderQuantityByRegion = emplyeeService.getOrderQuantityByRegion();
        try
        {
            if (orderQuantityByRegion!=null&&!orderQuantityByRegion.isEmpty())
            {
                return Result.success(orderQuantityByRegion);
            }
            else return Result.error("查询失败");
        }
        catch (Exception e)
        {
            return Result.error(e.getMessage());
        }
    }


    @RequestMapping("/quantity/season")
    public Result<List<Map<String,Object>>> getOrderQuantityBySeason()
    {
        try
        {
            List<Map<String, Object>> orderQuantityBySeason = emplyeeService.getOrderQuantityBySeason();
            if (orderQuantityBySeason!=null&&!orderQuantityBySeason.isEmpty())
            {
                return Result.success(orderQuantityBySeason);
            }
            else return Result.error("查询失败");
        }
        catch (Exception e)
        {
            return Result.error(e.getMessage());
        }
    }


    @RequestMapping("/supplier/amount")
    public Result<List<Map<String,Object>>> getTotalAmountBySupplier()
    {
        try
        {
            List<Map<String, Object>> totalAmountBySupplier = emplyeeService.getTotalAmountBySupplier();
            if (totalAmountBySupplier!=null&&!totalAmountBySupplier.isEmpty())
            {
                return Result.success(totalAmountBySupplier);
            }
            else return Result.error("查询失败");
        }
        catch (Exception e)
        {
            return Result.error(e.getMessage());
        }
    }


    @RequestMapping("/supplier/order_amount")
    public Result<List<Map<String,Object>>> getOrderCountBySupplier()
    {
        try
        {
            List<Map<String, Object>> orderCountBySupplier = emplyeeService.getOrderCountBySupplier();
            if (orderCountBySupplier!=null&&!orderCountBySupplier.isEmpty())
            {
                return Result.success(orderCountBySupplier);
            }
            else return Result.error("查询失败");
        }
        catch (Exception e)
        {
            return Result.error(e.getMessage());
        }
    }


    @RequestMapping("/supplier/product_amount")
    public Result<List<Map<String,Object>>> getProductCountByCategoryAndSupplier(@Param("category") String category)
    {
        try
        {
            List<Map<String, Object>> productCountByCategoryAndSupplier = emplyeeService.getProductCountByCategoryAndSupplier(category);
            if (productCountByCategoryAndSupplier!=null&&!productCountByCategoryAndSupplier.isEmpty())
            {
                return Result.success(productCountByCategoryAndSupplier);
            }
            else return Result.error("查询失败");
        }
        catch (Exception e)
        {
            return Result.error(e.getMessage());
        }
    }


}
