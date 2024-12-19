FROM openjdk:21-jdk-slim
WORKDIR /user/src/app
COPY . .
RUN chmod +x ./mvnw
RUN ./mvnw package
ENTRYPOINT ["java", "-jar", "./target/cards-0.0.1-SNAPSHOT.jar"]