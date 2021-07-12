# Dockerfile
FROM openjdk:11-jdk-slim
VOLUME /tmp
ARG JAR_FILE=build/libs/employ-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} employ.jar
ENTRYPOINT ["java","-Xms1024m","-Xmx1024m","-jar","/employ.jar"]