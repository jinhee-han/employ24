# Dockerfile
FROM openjdk:11
ARG JAR_FILE=./*.jar
COPY ${JAR_FILE} employ.jar
ENTRYPOINT ["java","-jar","/employ.jar"]
