# Build stage
FROM maven AS build

WORKDIR /app

COPY . /app

RUN mvn clean package

# Runtime stage
FROM openjdk:17

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]