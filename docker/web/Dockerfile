FROM openjdk:14-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=manager/target/*.jar
COPY ${JAR_FILE} cinema.jar
ENTRYPOINT ["java", "-jar", "cinema.jar"]