package org.example.pro_2.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.pro_2.pojo.Customer;

import java.util.List;

@Mapper
public interface CustomerMapper {
    @Select("SELECT [customerId], [name], [companyName], [contactName], [contactTitle], [address], [city], [region], [postalCode], [country], [phone], [fax] FROM [class_do].[dbo].[Customer]")
    List<Customer> getAllCustomers();
}
