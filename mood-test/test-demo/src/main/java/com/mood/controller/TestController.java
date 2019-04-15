package com.mood.controller;

import com.mood.app.service.AppService;
import com.mood.entity.app.App;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 *
 * @author chaiwei
 * @create 2019-03-13 5:09 PM
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private AppService appService;

    @GetMapping("")
    public App select() {
        return appService.selectById("1");
    }
}
