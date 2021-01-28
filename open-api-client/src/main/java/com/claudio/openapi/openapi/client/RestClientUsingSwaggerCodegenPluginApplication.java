package com.claudio.openapi.openapi.client;

import com.claudio.openapi.ApiClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestClientUsingSwaggerCodegenPluginApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestClientUsingSwaggerCodegenPluginApplication.class, args);
		ApiClient apiClient = new ApiClient();
	}

}
