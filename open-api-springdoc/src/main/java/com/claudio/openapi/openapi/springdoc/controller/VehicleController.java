package com.claudio.openapi.openapi.springdoc.controller;

import com.claudio.openapi.openapi.springdoc.model.Vehicle;
import com.claudio.openapi.openapi.springdoc.repository.VehicleRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/vehicle")
public class VehicleController {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Operation(summary = "Get a vehicle by its id")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Found the vehicle",
                content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Vehicle.class)) }),
        @ApiResponse(responseCode = "400", description = "Invalid id supplied", content = @Content),
        @ApiResponse(responseCode = "404", description = "Vehicle not found", content = @Content)
    })
    @GetMapping("/{id}")
    public Vehicle findById(@Parameter(description = "id of vehicle to be searched") @PathVariable Long id){
        return vehicleRepository.findById(id).get();
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<Vehicle> findAll(){
        List<Vehicle> vehicles = new ArrayList<>();
        vehicleRepository.findAll().forEach(vehicles::add);
        return vehicles;
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Vehicle createVehicle(@RequestBody Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }

    @PutMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public Vehicle updateVehicle(@RequestBody Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteVehicle(@PathVariable Long id){
        Vehicle vehicle = vehicleRepository.findById(id).get();
        if(vehicle != null){
            vehicleRepository.delete(vehicle);
        }
    }
}
