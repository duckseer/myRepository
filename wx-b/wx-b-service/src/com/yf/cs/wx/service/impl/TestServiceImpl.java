package com.yf.cs.wx.service.impl;

import com.yf.cs.wx.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class TestServiceImpl implements TestService {

    @Override
    public String helloWorld() {
        return "Hello World";
    }
}
