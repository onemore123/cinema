FROM openjdk:14-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY manager /usr/src/cinema
WORKDIR /usr/src/cinema
RUN ./mvnw clean package
CMD ["java", "-jar", "target/manager-0.0.1-SNAPSHOT.jar"]