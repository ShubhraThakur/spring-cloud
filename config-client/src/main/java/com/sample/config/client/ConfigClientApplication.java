package com.sample.config.client;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class ConfigClientApplication {

	@Value("${appname:Config Server is not working. Please check...}")
	private String	appname;
	@Value("${version:Config Server is not working. Please check...}")
	private String	version;

	public static void main(String[] args) {

		SpringApplication.run(ConfigClientApplication.class, args);
	}

	@GetMapping("/home")
	public Map<String, Object> home() {

		Map<String, Object> responseObj = new HashMap<>();
		responseObj.put("appName", appname);
		responseObj.put("version", version);
		return responseObj;
	}

}
