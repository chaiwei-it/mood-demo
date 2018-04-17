package com.mood.module.api.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * 内容
 *
 * @author chaiwei
 * @time 2018-04-08 23:30
 */
public class RedisUtil {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    public static void main(String[] args) {

    }
}
