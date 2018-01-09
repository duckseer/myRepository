package com.yf.cs.wx.web.controller;

import com.yf.cs.wx.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping(value = "/")
    public String helloWorld(){
        return testService.helloWorld();
    }

}
