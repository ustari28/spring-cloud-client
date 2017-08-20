package com.alan.example.sprincloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@SpringBootApplication
@RestController
public class SprinCloudConfigClientApplication {

	@RequestMapping("/")
	public String home(@Value("${config.values}") String value) {
		return "Hello World! " + value;
	}

	public static void main(String[] args) {
		SpringApplication.run(SprinCloudConfigClientApplication.class, args);
	}
}
