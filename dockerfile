FROM openjdk:17-jdk-alpine

COPY target/musica-0.0.1-SNAPSHOT.jar musica-1.0.0.jar

ENTRYPOINT [ "java", "-jar", "musica-1.0.0.jar" ]