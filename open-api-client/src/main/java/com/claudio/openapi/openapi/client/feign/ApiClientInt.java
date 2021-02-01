package com.claudio.openapi.openapi.client.feign;

import com.claudio.openapi.model.Vehicle;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("open-api-springdoc")
public interface ApiClientInt {
    @GetMapping("/api/vehicle/")
    public List<Vehicle> findAll();
}