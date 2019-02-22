package com.tries.fly.controller;

import com.alibaba.fastjson.JSONObject;
import com.tries.fly.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: hxy
 * @description: 登录相关Controller
 * @date: 2017/10/24 10:33
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService loginTestService;


    @PostMapping("/test")
    public JSONObject test(){
        return loginTestService.test();
    }
}
