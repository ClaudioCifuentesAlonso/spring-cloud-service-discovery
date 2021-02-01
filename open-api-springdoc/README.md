# Demo for springdoc-openapi library

In this application we created a simple vehicle API to use springdoc-openapi-ui library to demonstrate the use of the Swagger UI and the OpenAPI specification.

## Configuration

```application.yml``` file:

```
spring:
  application:
    name: open-api-springdoc
eureka:
  client:
    serviceUrl:
      defaultZone: http://localhost:8761/eureka
```

```application.properties``` file:
```
springdoc.api-docs.path=/api-docs
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