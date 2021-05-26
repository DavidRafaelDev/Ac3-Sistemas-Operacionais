FROM amazoncorretto:11
COPY target/projeto-tela-java-1.0-SNAPSHOT-jar-with-dependencies.jar 
EXPOSE 8080
# set the startup command to execute the jar
CMD ["java", "-jar", "projeto-tela-java-1.0-SNAPSHOT-jar-with-dependencies.jar"]
 