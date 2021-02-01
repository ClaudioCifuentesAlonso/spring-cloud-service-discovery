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

## Usage

```
mvn spring-boot:run
```

Additionally, if you want to create the corresponding docker image you can execute (inside the eureka-server folder where we have the
```Dockerfile```):

```
docker build -t claudio/eureka-server:latest .
```

To run the application using the image:

```
docker run -p 8761:8761 claudio/eureka-server:latest