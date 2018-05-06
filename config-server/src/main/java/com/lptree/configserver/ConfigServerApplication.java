package com.lptree.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigServerApplication {

	public static void main(String[] args) {

		//http://localhost:8888/config-client/dev/master
/*
http请求地址和资源文件映射如下:
/{application}/{profile}[/{label}]
/{application}-{profile}.yml
				/{label}/{application}-{profile}.yml
				/{application}-{profile}.properties
				/{label}/{application}-{profile}.properties
				*/
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
