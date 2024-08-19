package org.example.pro_2.Service.Impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.pro_2.Mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
@Data
@AllArgsConstructor
public class EmplyeeServiceImpl {

    @Autowired
    private EmployeeMapper employeeMapper;
    public List<Map<String, Object>> getOrderQuantityByRegion() {
        try {
            List<Map<String, Object>> orderQuantities = employeeMapper.getOrderQuantityByRegion();
            if (orderQuantities == null || orderQuantities.isEmpty()) {
                // 如果查询结果为空，则返回一个空列表
                return Collections.emptyList();
            }
            return orderQuantities;
        } catch (Exception e) {
            // 如果发生异常，则记录错误并返回一个空列表
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    public List<Map<String, Object>> getOrderQuantityBySeason(){
        try {
            List<Map<String, Object>> shippingQuantityBySeason = employeeMapper.getShippingQuantityBySeason();
            if(shippingQuantityBySeason==null||shippingQuantityBySeason.isEmpty()){
                return Collections.emptyList();
            }
            return shippingQuantityBySeason;
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }

    }

    public List<Map<String, Object>> getTotalAmountBySupplier(){
        try {
            List<Map<String, Object>> totalAmountBySupplier = employeeMapper.getTotalAmountBySupplier();
            if(totalAmountBySupplier==null||totalAmountBySupplier.isEmpty()){
                return Collections.emptyList();
            }
            return totalAmountBySupplier;
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }


    public List<Map<String, Object>> getOrderCountBySupplier(){
        try {
            List<Map<String, Object>> orderCountBySupplier = employeeMapper.getOrderCountBySupplier();
            if(orderCountBySupplier==null||orderCountBySupplier.isEmpty()){
                return Collections.emptyList();
            }
            return orderCountBySupplier;
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    public List<Map<String, Object>> getProductCountByCategoryAndSupplier(String category){
        try {
            List<Map<String, Object>> productCountByCategoryAndSupplier = employeeMapper.getProductCountByCategoryAndSupplier(category);
            if(productCountByCategoryAndSupplier==null||productCountByCategoryAndSupplier.isEmpty()){
                return Collections.emptyList();
            }
            return productCountByCategoryAndSupplier;
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}
