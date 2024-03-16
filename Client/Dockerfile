FROM maven:3.8.4-openjdk-17 AS builder
RUN mvn clean install
COPY target/Client-0.0.1-SNAPSHOT.jar client.jar
CMD ["java","-jar","client.jar"]
EXPOSE 8081
