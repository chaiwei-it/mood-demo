package com.mood.module.api;


import com.mood.base.BaseController;
import com.mood.common.HttpCode;
import com.mood.module.produce.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 应用模块
 * @author chaiwei
 * @time 2018-01-07 下午08:00
 */
@RestController
@RequestMapping("/api/{version}/topic")
public class TopicApi extends BaseController {

    @Autowired
    private Publisher publisher;



    /**
     * 修改
     * @param title
     * @return
     */
    @GetMapping("")
    public ResponseEntity<ModelMap> release(
            @RequestParam(value = "title", required = false, defaultValue = "") String title,
            ModelMap modelMap, HttpServletRequest request){
        publisher.release(title);
        return setModelMap(modelMap, HttpCode.SUCCESS);
    }



}
