FROM amazoncorretto:8-alpine

COPY target/desafio-spring-primefaces-0.0.1.jar desafio-spring-primefaces.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/desafio-spring-primefaces.jar"]