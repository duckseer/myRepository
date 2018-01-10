package com.yf.cs.wx.app.controller;

//import com.yf.cs.wx.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
//    private TestService testService;

    @RequestMapping("/say")
    public String helloWorld(){
        return "";
//        return testService.helloWorld();
    }

}
