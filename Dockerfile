FROM maven:3-openjdk-17 AS build
COPY . ./a
WORKDIR /a
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
WORKDIR /
COPY --from=build /a/target/learningJava-0.9.1-SNAPSHOT.jar learningJava.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar", "learningJava.jar"]