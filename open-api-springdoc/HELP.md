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

Additionally, if you want to create the corresponding docker image you can execute (inside the open-api-springdoc folder where we hace the
```Dockerfile```):

```
docker build -t claudio/spring-doc-openapi:latest .
```

To run the application using the image:

```
docker run -p 8080:8080 claudio/spring-doc-openapi:latest