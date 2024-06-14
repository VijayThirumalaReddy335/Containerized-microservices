# Dockerfile for FirstApplication
FROM openjdk:17
WORKDIR /app
COPY target/myservice.jar /app/myservice.jar
ENTRYPOINT ["java", "-jar", "myservice.jar"]
EXPOSE 8080
