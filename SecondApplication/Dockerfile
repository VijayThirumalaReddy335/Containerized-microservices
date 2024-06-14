# Dockerfile for SecondApplication
FROM openjdk:17
WORKDIR /app
COPY target/secondservice.jar /app/secondservice.jar
ENTRYPOINT ["java", "-jar", "/secondservice.jar"]
EXPOSE 8081
