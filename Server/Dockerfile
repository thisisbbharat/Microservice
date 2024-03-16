FROM maven:3.8.4-openjdk-17 AS builder
RUN mvn clean install
COPY target/Server-0.0.1-SNAPSHOT.jar server.jar
CMD ["java","-jar","server.jar"]
EXPOSE 8080
