FROM openjdk:8
ADD target/com.kozinets.music-1.0-SNAPSHOT-exec.jar com.kozinets.music-1.0-SNAPSHOT-exec.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "com.kozinets.music-1.0-SNAPSHOT-exec.jar"]docker build -f src\main\java\Dockerfile -t docker-app-music