package com.claudio.openapi.openapi.client.feign;

import com.claudio.openapi.model.Vehicle;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("open-api-springdoc")
public interface ApiClientInt {
    @GetMapping("/api/vehicle/")
    public List<Vehicle> findAll();
}