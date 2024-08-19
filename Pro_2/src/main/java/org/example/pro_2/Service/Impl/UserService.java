package org.example.pro_2.Service.Impl;

import org.example.pro_2.pojo.User_1;

public interface UserService {
    User_1 findByUsername(String UserName);
    void register(User_1 user);
    void login(User_1 user);
    void updatepass(String newPass);
}
