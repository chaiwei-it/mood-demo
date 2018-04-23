package com.mood.module.api.redis;


import com.mood.entity.app.App;
import com.mood.module.base.BaseApi;
import com.mood.redis.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 应用模块
 * @author chaiwei
 * @time 2018-01-07 下午08:00
 */
@RestController
@RequestMapping("/api/{version}/redis")
public class RedisApi extends BaseApi<App> {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("")
    public String contextLoads() {
        stringRedisTemplate.opsForValue().set("xmz","23");
        String xmz = stringRedisTemplate.opsForValue().get("xmz");
        return xmz;
    }

}
