package org.example.pro_2;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class Jwttest {
    @Test
    public void testGen(){
        Map<String,Object> claims=new HashMap<>();
        claims.put("ID","1");
        claims.put("UserName","wangba");

        String token=JWT.create().
                withClaim("user",claims)//添加载荷
                .withExpiresAt(new Date(System.currentTimeMillis()+1000*60*60*12))//过期时间
                .sign(Algorithm.HMAC256("Skywalker"));//指定加密算法
        System.out.println(token);
    }


    @Test
    public void tsetParse(){
        String token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7IlVzZXJOYW1lIjoid2FuZ2JhIiwiSUQiOiIxIn0sImV4cCI6MTcxMTk0NDE2MX0.XmFL2sjvMbWUMfzxvTmvwvcegNtnyh8pyJIREnVu9No";
        JWTVerifier skywalker = JWT.require(Algorithm.HMAC256("Skywalker")).build();

        DecodedJWT verify = skywalker.verify(token);
        Map<String, Claim> claims = verify.getClaims();
        System.out.println(claims.get("user"));
    }
}
