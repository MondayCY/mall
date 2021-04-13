package com.xiaocheng.clothesmall.clothesmall.config;

import org.springframework.stereotype.Component;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.Date;
import java.util.Map;

@Component
public class JwtTokenUtil {

    //密钥
    private final static String SCRENT = "!Qq123456";
    //有效期 12小时
    private final static long TOKEN_EXPIRATION = 12*3600*1000L;
    //用户名
    private static String userName = "test";
    //密码
    private static String password = "test123456";

    /**
     * 生成token
     *
     *
     *
     * @return token
     */
    public static String generateToken(Map<String,Object> m){
        //加密类型
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        SecretKey secretKey = generalKey();
        Date date = new Date(System.currentTimeMillis()+TOKEN_EXPIRATION);
        JwtBuilder jwtBuilder = Jwts.builder()
                //head的作用主要是表明Signature使用的加密算法和token的类型
                .setHeaderParam("typ","JWT").setHeaderParam("alg","HS256")
                //添加键值对
                .addClaims(m)
                //.claim("password",password)
                //签名 保证内容和签名的东西一致
                .signWith(signatureAlgorithm,secretKey)
                //过期时间
                .setExpiration(date);
        return jwtBuilder.compact();
    }


    /**
     * 加密盐  SecretKey是一个密钥类
     *
     *
     */
    private static SecretKey generalKey(){
        byte[] encodeKey = Base64.getDecoder().decode(SCRENT);
        SecretKey key = new SecretKeySpec(encodeKey,0,encodeKey.length,"AES");
        return key;
    }

    /**
     * 解密token 返回payload的信息主体对象claims
     * @param jwtToken token
     * @return Claims
     */
    public static Claims validateJWT(String jwtToken){
        Claims claims = Jwts.parser()
                .setSigningKey(generalKey())
                .parseClaimsJws(jwtToken).getBody();
        return claims;
    }

    /**
     * 从token中获取key的值
     * @param jwtToken token
     * @param key key
     * @return value
     */
    public static Object get(String jwtToken,String key){
        Claims claims = validateJWT(jwtToken);
        String value = claims.get(key,String.class);
        return value;
    }

}
