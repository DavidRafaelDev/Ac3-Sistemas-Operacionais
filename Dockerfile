FROM openjdk:11-jre-slim
COPY target/projeto-tela-java-1.0-SNAPSHOT-jar-with-dependencies.jar /app/app.jar

EXPOSE 8080
CMD ["java", "-jar", "/app/app.jar"]