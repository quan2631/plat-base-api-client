package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource({"classpath*:rpc-start-base-client.xml"})
@ComponentScan({"com.wish.plat.base.api.OperService","com.example.demo"})
public class PlatBaseApiClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlatBaseApiClientApplication.class, args);
	}

}
