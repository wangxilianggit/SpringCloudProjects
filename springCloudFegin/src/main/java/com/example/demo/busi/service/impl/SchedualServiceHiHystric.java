package com.example.demo.busi.service.impl;

import org.springframework.stereotype.Component;

import com.example.demo.busi.service.SchedualServiceHi;
/**
 * 配置熔断器的回掉函数
 * @author wangxiliang
 *
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

	@Override
	public String sayHiFromClientOne(String name) {
		return name+" sorry,error! this is hystrix fallback. the server down";
	}

}
