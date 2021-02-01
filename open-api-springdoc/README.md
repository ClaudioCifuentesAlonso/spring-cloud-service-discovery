# Demo for springdoc-openapi library

In this application we created a simple vehicle API to use springdoc-openapi-ui library to demostrate the use of the Swagger UI and the OpenAPI specification.

## Configuration
Because we want to register this service with the Eureka server we need the following configuration:

```
spring:
  application:
    name: open-api-springdoc
eureka:
  client:
    serviceUrl:
      defaultZone: http://localhost:8761/eureka
```

## Usage

```
mvn spring-boot:run
```

OpenAPI spec (JSON format):
```
http://localhost:8080/api-docs
```

YAML format:
```
http://localhost:8080/api-docs.yaml
```

Swagger-UI:
```
http://localhost:8080/swagger-ui.html
```

Additionally, if you want to create the corresponding docker image you can execute (inside the open-api-springdoc folder where we have the
```Dockerfile```):

```
docker build -t claudio/spring-doc-openapi:latest .
```