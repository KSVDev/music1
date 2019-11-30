FROM openjdk:8u232-jre
ADD target/com.kozinets.music-1.0-SNAPSHOT-exec.jar com.kozinets.music-1.0-SNAPSHOT-exec.jar
ENTRYPOINT ["java", "-jar", "com.kozinets.music-1.0-SNAPSHOT-exec.jar", "  --trace"]