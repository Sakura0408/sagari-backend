package com.xxl.sso.server;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author xuxueli 2018-03-22 23:41:47
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@EnableApolloConfig
public class XxlSsoServerApplication {

	public static void main(String[] args) {
        SpringApplication.run(XxlSsoServerApplication.class, args);
	}

}