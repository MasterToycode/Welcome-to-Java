package org.example.pro_2.Controller;

import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.catalina.connector.Request;
import org.example.pro_2.Service.Impl.UserService;
import org.example.pro_2.Utils.JwtUtil;
import org.example.pro_2.Utils.MD5Util;
import org.example.pro_2.Utils.ThreadLocalUtil;
import org.example.pro_2.pojo.Result;
import org.example.pro_2.pojo.User_1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
@AllArgsConstructor
@Data
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/register")
    public Result register(@Validated User_1 user) {
        // 校验用户名
        if (!(user.isValidUserName(user.getUserName()))) {
            return Result.error("用户名必须是5到6位的");
        }
        // 校验密码
        if (!(user.isValidPassword(user.getPassword()))) {
            return Result.error("密码必须由6到20位的字母、数字或下划线组成");
        }
        // 查询用户
        User_1 u = userService.findByUsername(user.getUserName());
        if (u == null)
        {
            // 注册
            userService.register(user);
            return Result.success();
        }
        else {
            return Result.error("用户名已被占用");
        }
    }



    @RequestMapping("/login")
    public Result <String> Login(@Pattern(regexp ="^\\S{5,16}$") String UserName,
                                 @Pattern(regexp = "^[a-zA-Z0-9_]{6,20}$") String Password,
                                 String Role){
        User_1 byUsername = userService.findByUsername(UserName);
        if (byUsername==null){
            return Result.error("用户名错误");
        }
        if (Role.equals(byUsername.getRole())) {
            if (MD5Util.encryptPassword(Password).equals(byUsername.getPassword())){

                //登录
                userService.login(byUsername);
                //获取检查令牌
                Map<String,Object> claims=new HashMap<>();
                claims.put("ID",byUsername.getUserName());
                claims.put("UserName",byUsername.getUserName());
                String token = JwtUtil.genToken(claims);

                return Result.success(token);
            }

            return Result.error("密码错误");
        }
        else {
            return Result.error("身份错误");
        }

    }



    @RequestMapping ("/Info")
    public Result<User_1> userInfo(){
//        // 解析 token 获取用户名
//        Map<String, Object> stringObjectMap = JwtUtil.parseToken(token);
//        String userName = (String) stringObjectMap.get("UserName");

         Map<String,Object> objectMap =ThreadLocalUtil.get();
         String UserName = (String) objectMap.get("UserName");
        User_1 byUsername = userService.findByUsername(UserName);

        return Result.success(byUsername);
    }


    @PatchMapping("/updatePass")
    public Result updatePass(@RequestBody Map<String,String> params){
        String old_pass = params.get("old_pass");
        String new_pass = params.get("new_pass");
        String re_pass = params.get("re_pass");
        if (!StringUtils.hasLength(old_pass)||!StringUtils.hasLength(new_pass)||!StringUtils.hasLength(re_pass)){
            return Result.error("缺少必要的参数");
        }

        Map<String,Object> map = ThreadLocalUtil.get();
        String username = (String) map.get("UserName");
        User_1 byUsername = userService.findByUsername(username);

        if ( !byUsername.getPassword().equals(MD5Util.encryptPassword(old_pass))) {
            return Result.error("原密码不正确");
        }
        if (!re_pass.equals(new_pass)){
            return Result.error("两次的新密码不一样");
        }

        userService.updatepass(new_pass);
        return Result.success("密码修改成功");
    }
}






