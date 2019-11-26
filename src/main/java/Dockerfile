FROM openjdk:8-jdk-alpine
#FROM openjdk:8
#ADD target/com.kozinets.music-1.0-SNAPSHOT-exec.jar com.kozinets.music-1.0-SNAPSHOT-exec.jar
EXPOSE 8080
#ENTRYPOINT ["java", "-jar", "com.kozinets.music-1.0-SNAPSHOT-exec.jar"]
VOLUME /tmp
ARG JAR_FILE=target/com.kozinets.music-1.0-SNAPSHOT-exec.jar
ADD ${JAR_FILE} music-demo.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/music-demo.jar"]