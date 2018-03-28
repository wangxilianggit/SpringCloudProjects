package com.example.demo.busi.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.busi.service.impl.SchedualServiceHiHystric;

@FeignClient(value="service-hi",fallback=SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

	@RequestMapping(value="/hi",method = RequestMethod.GET)
	String sayHiFromClientOne(@RequestParam(value = "name") String name);
	
}
