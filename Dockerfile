FROM openjdk:latest
ADD target/learn-docker.jar learn-docker.jar
ENTRYPOINT ["java","-jar","/learn-docker.jar"]
