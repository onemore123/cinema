FROM openjdk:14-jdk-alpine
COPY manager /usr/src/cinema
WORKDIR /usr/src/cinema
RUN ./mvnw clean package
CMD ["java", "-jar", "target/manager-0.0.1-SNAPSHOT.jar"]