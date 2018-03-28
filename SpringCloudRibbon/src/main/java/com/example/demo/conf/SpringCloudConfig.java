package com.example.demo.conf;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableEurekaClient
@EnableHystrix
@EnableHystrixDashboard
public class SpringCloudConfig {

}
