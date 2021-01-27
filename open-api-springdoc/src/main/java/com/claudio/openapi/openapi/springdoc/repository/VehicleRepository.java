package com.claudio.openapi.openapi.springdoc.repository;

import com.claudio.openapi.openapi.springdoc.model.Vehicle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, Long> {
}
