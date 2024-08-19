package org.example.pro_2.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.pro_2.Utils.JwtUtil;
import org.example.pro_2.Utils.ThreadLocalUtil;
import org.example.pro_2.pojo.Result;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import java.util.Map;

@Component
public class LoginIntercepter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
    {
        String token = request.getHeader("Authorization");
       // System.out.println(token);
        if (token == null || token.isEmpty())
        {
            response.setStatus(401);
            return false;
        }

        try
        {
            Map<String, Object> stringObjectMap = JwtUtil.parseToken(token);
            ThreadLocalUtil.set(stringObjectMap);

            return true;
        }

        catch (Exception e) {
            response.setStatus(401);
            System.out.println(Result.error(""));
            return false;
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        ThreadLocalUtil.remove();
    }
}
