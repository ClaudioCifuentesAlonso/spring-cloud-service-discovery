package com.claudio.openapi.openapi.springdoc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Vehicle {

    @Id
    private Long id;

    @NotBlank
    @Size(min = 0, max = 20)
    private String vin;

    @NotBlank
    @Size(min = 0, max = 30)
    private String driver;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
}