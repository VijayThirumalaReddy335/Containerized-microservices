# Dockerfile for FirstApplication
FROM openjdk:17
WORKDIR /app
COPY target/firstservice.jar /app/firstservice.jar
ENTRYPOINT ["java", "-jar", "firstservice.jar"]
EXPOSE 8080
