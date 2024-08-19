package org.example.pro_2.Mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.example.pro_2.pojo.User_1;
@Mapper
public interface UserMapper
{
    @Select("select * from User_1 where UserName=#{UserName}")
    User_1 findByUsername(String UserName);

    @Insert("insert into User_1(UserName, Password, LoginTime, LogoutTime,Role) " +
            "values(#{UserName}, #{Password}, GETDATE(), GETDATE(),#{Role})")
    void add(User_1 user);

    @Insert("insert into Session(ID,CheckinDate,UserName) values (#{ID},GETDATE(),#{UserName})")
    void Login(User_1 user);

    @Update("update dbo.User_1 set Password=#{new_pass}, LoginTime=GETDATE() where UserName=#{UserName} ")
    void updatepass(String new_pass, String UserName);


}
