FROM openjdk:21-jdk-slim
WORKDIR /user/src/app
COPY . .

RUN ./mvnw package

ENTRYPOINT ["java", "-jar", "./target/accounts-0.0.1-SNAPSHOT.jar"]