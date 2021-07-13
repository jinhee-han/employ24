# Dockerfile
FROM openjdk:11-jdk-slim
ARG JAR_FILE=build/libs/employ-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} employ.jar
ENTRYPOINT ["java","-jar","/employ.jar"]
