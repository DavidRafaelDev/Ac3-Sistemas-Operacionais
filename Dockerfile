FROM amazoncorretto:11
COPY target/ projeto-tela-java-1.0-SNAPSHOT-jar-with-dependencies.jar 
EXPOSE 8080
ENTRYPOINT ["bash","java", "-jar", "target/projeto-tela-java-1.0-SNAPSHOT-jar-with-dependencies.jar"]