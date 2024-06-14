# Dockerfile for SecondApplication
FROM openjdk:17
WORKDIR /app
COPY target/myserviceone.jar /app/myserviceone.jar
ENTRYPOINT ["java", "-jar", "/myserviceone.jar"]
EXPOSE 8081
