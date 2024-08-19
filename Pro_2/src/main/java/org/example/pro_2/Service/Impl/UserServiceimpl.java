package org.example.pro_2.Service.Impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.pro_2.Mapper.UserMapper;
import org.example.pro_2.Utils.MD5Util;
import org.example.pro_2.Utils.ThreadLocalUtil;
import org.example.pro_2.pojo.User_1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User_1 findByUsername(String UserName)
    {
        return userMapper.findByUsername(UserName);
    }

    @Override
    public void register(User_1 user) {
        // 加密
        String encryptedPassword = MD5Util.encryptPassword(user.getPassword());
        user.setPassword(encryptedPassword);

        // 如果用户未设置角色，则将角色默认设置为客户
        if (user.getRole() == null || user.getRole().isEmpty())
        {
            user.setRole("Customer");
        }
        userMapper.add(user);
    }

    @Override
    public void login(User_1 user)
    {
        userMapper.Login(user);
    }

    @Override
    public void updatepass(String newPass) {
        Map<String,Object> map = ThreadLocalUtil.get();
        String username = (String) map.get("UserName");
        userMapper.updatepass(MD5Util.encryptPassword(newPass),username);
    }
}
