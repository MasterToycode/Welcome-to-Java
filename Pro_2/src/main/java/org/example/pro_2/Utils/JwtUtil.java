package org.example.pro_2.Utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import java.util.Date;
import java.util.Map;

public class JwtUtil {

    private static final String KEY="Skywalker";

    public static String genToken(Map<String,Object> claims)
    {
        return JWT.create().
                withClaim("claims",claims)//添加载荷
                .withExpiresAt(new Date(System.currentTimeMillis()+1000*60*60*12))//过期时间
                .sign(Algorithm.HMAC256("Skywalker"));//指定加密算法
    }


    public static Map<String,Object> parseToken(String token){
        return JWT.require(Algorithm.HMAC256(KEY))
                .build()
                .verify(token)
                .getClaim("claims")
                .asMap();
    }
}
