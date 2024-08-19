package org.example.pro_2.Service.Impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.pro_2.Mapper.CustomerMapper;
import org.example.pro_2.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerService {
    @Autowired
    private CustomerMapper customerMapper;
    public List<Customer> getAllCustomers(){
        return customerMapper.getAllCustomers();
    }
}
