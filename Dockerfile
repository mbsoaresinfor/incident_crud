FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/incident_crud-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} incident_crud-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/incident_crud-0.0.1-SNAPSHOT.jar"]