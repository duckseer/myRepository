package com.yf.cs.wx.app;

import com.yf.cs.wx.service.ServiceScanPackage;
import com.yf.cs.wx.web.controller.ControllerScanPackage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {ControllerScanPackage.class,ServiceScanPackage.class})
public class WxApplication {

	public static void main(String[] args) {
		SpringApplication.run(WxApplication.class, args);
	}
}
