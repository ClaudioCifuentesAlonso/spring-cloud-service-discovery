# Demo for Feign client

In this application we created a simple Feign Client to use API calls through service discovery.

## Configuration
Because we want to register this service with the Eureka server we need the following configuration:

```
spring:
  application:
    name: open-api-feign-client
```

## Usage

```
mvn spring-boot:run
```

Additionally, if you want to create the corresponding docker image you can execute (inside the open-api-client folder where we have the
```Dockerfile```):

```
docker build -t claudio/open-api-client:latest .
```

To run the application using the image:

```
docker run -p 8088:8088 claudio/open-api-client:latest