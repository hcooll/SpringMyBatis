package com.hc.web.test;

import com.hc.web.core.cache.CacheUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/redis")
public class RedisTest {

    @RequestMapping("/redis")
    public String redisTest() {
        try {
            boolean b = CacheUtil.setString("123", "redis");//向redis里存字符串 key-value
            System.out.println(b);//true成功，
            System.out.println(CacheUtil.getString("123"));//从radis里取数据 key
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return "hello";
    }
}
