package com.claudio.openapi.openapi.client;

import com.claudio.openapi.model.Vehicle;
import com.claudio.openapi.openapi.client.feign.ApiClientInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@EnableFeignClients
@RestController
public class RestClientUsingSwaggerCodegenPluginApplication {
	@Autowired
	private ApiClientInt apiClientInt;

	public static void main(String[] args) {
		SpringApplication.run(RestClientUsingSwaggerCodegenPluginApplication.class, args);
	}

	@RequestMapping("/get-vehicles/")
	public List<Vehicle> findAllVehicles() {
		return apiClientInt.findAll();
	}
}
