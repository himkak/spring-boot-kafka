FROM openjdk:8-jdk-alpine
#VOLUME /tmp
ARG JAR_FILE=target/SampleKafka-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} /tmp
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/tmp/SampleKafka-0.0.1-SNAPSHOT.jar"]