FROM openjdk:17-jdk-slim AS build
WORKDIR /app
COPY build/libs/my-DataStoreService-App.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "app.jar"]
