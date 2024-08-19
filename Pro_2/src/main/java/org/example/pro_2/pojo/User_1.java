package org.example.pro_2.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User_1 {
    private int ID;
    @NonNull
    private String UserName;

    @JsonIgnore
    private String Password;
    private LocalDateTime loginTime;//命名错误，其实是指注册日期
    private LocalDateTime logoutTime;//命名有问题，其实是指更新时间。
    private String Role;

    public boolean isValidPassword(String password) {
        return password.matches("^[a-zA-Z0-9_]{6,20}$");
    }

    public boolean isValidUserName(String username) {
        return username.matches("^\\S{5,16}$");
    }
}
