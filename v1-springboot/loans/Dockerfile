FROM openjdk:21-jdk-slim
WORKDIR /usr/src/app
COPY . .

RUN chmod +x ./mvnw

RUN ./mvnw package
ENTRYPOINT ["java", "-jar", "./target/loans-0.0.1-SNAPSHOT.jar"