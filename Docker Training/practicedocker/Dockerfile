FROM openjdk:17

WORKDIR /app

COPY . /app

RUN mvn clean package

EXPOSE 8080

CMD ["java", "-jar", "practicedocker-0.0.1-SNAPSHOT.jar"]