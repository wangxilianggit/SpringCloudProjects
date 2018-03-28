package com.example.demo.busi.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 * 1.对外提供hi服务；
 * @author wangx
 *
 */
@RestController
public class HiController {

	@Value("${server.port}")
    String port;
	
    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }
    
}
