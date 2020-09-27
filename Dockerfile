FROM openjdk:8
EXPOSE 8080
ADD target/srpingdemo-docker.jar srpingdemo-docker.jar
ENTRYPOINT ["java","-jar","springdemo-docker.jar"]