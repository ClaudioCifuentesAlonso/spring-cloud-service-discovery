# Demo for Feign client

In this application we created a simple Feign Client to use API calls through service discovery.

## Configuration

```application-yml``` file:

```
spring:
  application:
    name: open-api-feign-client
```

```application.properties``` file:
```
server.port=8888
eureka.client.enabled=true
```

## Usage

```
mvn spring-boot:run
```

Additionally, if you want to create the corresponding docker image you can execute (inside the open-api-client folder where we have the
```Dockerfile```):

```
docker build -t claudio/open-api-feing-client:latest .
```

## Code generation config

In ```pom.xml``` file, we have the following section:

```
    <plugin>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-maven-plugin</artifactId>
    </plugin>
    <plugin>
        <groupId>io.swagger.codegen.v3</groupId>
        <artifactId>swagger-codegen-maven-plugin</artifactId>
        <version>3.0.24</version>
        <executions>
            <execution>
                <phase>generate-sources</phase>
                <goals>
                    <goal>generate</goal>
                </goals>
                <configuration>
                    <language>java</language>
                    <inputSpec>${yaml.file}</inputSpec>
                    <modelPackage>${model.package}</modelPackage>
                    <apiPackage>${model.package}</apiPackage>
                    <generateApiTests>false</generateApiTests>
                    <generateApiDocumentation>false</generateApiDocumentation>
                    <generateModelTests>false</generateModelTests>
                    <generateModelDocumentation>false</generateModelDocumentation>
                    <configOptions>
                        <dateLibrary>java11</dateLibrary>
                    </configOptions>
                </configuration>
            </execution>
        </executions>
    </plugin>
```

With this configuration we can generate client code from the OpenAPI specification. 