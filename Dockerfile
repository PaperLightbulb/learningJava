FROM maven:3-openjdk-17 AS build
COPY . ./a
WORKDIR /a
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
WORKDIR /
COPY --from=build /a/target/Webst2-0.1.0.jar Webst2.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar", "Webst2.jar"]