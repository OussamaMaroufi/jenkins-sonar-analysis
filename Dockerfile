FROM openjdk:8
EXPOSE 8080
COPY target/realtime-project-demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
