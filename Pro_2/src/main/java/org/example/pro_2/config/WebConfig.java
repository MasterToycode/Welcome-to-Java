package org.example.pro_2.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.pro_2.interceptors.LoginIntercepter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Data
@NoArgsConstructor
@Component
public class WebConfig implements WebMvcConfigurer
{
    private LoginIntercepter loginIntercepter;

    @Autowired
    public WebConfig(LoginIntercepter loginIntercepter) {
        this.loginIntercepter = loginIntercepter;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
        //登录和注册接口不拦截
        registry.addInterceptor(loginIntercepter).excludePathPatterns("/user/register","/user/login");
    }
}
