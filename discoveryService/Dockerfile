FROM openjdk:8
ADD target/discoveryService.jar discoveryService.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "discoveryService.jar"]