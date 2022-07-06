FROM openjdk:11
ADD target/*.jar ms4.jar
ENTRYPOINT ["java","-jar","ms4.jar"]