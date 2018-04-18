package com.mood.module.consumer;

import com.mood.entity.user.User;
import com.mood.redis.CacheService;
import com.mood.user.service.UserService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * 内容
 *
 * @author chaiwei
 * @time 2018-01-14 10:17
 */
@Component
public class Consumer {

    @Autowired
    private UserService userService;

    @Autowired
    private CacheService cacheService;

    @JmsListener(destination = "sample.queue")
    public void updateUser(String id) {
        User user = userService.selectById(id);
        JSONObject json = JSONObject.fromObject(user);
        String userStr = json.toString();
        cacheService.set(id,  userStr, 10000000);
    }

}
