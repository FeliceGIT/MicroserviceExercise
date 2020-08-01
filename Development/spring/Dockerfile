# Dieses Dockerfile muss nach jedem 'mvn clean install' erneut gebuildet werden
# Java 11 Docker Image
FROM openjdk:11-jdk

# Existierende JAR Datei löschen
RUN rm -rf app.jar

# Neue JAR Datei vom Host zum Docker Container kopieren
COPY target/app.jar app.jar

# JAR Datei im Container ausführen
ENTRYPOINT ["java","-jar","app.jar"]