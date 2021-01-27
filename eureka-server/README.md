# Spring Cloud Eureka Server

To build you own server use the ```spring-cloud-starter-netflix-eureka-server``` dependency and ```@EnableEurekaServer```.

## Configuration

```application.yml``` file with the following configuration.
```bash
server:
  port: 8761
eureka:
  client:
    registerWithEureka: false
    fetchRegistry: false
```

## Execution

Execute the following command:

```bash
mvn spring-boot:run
```