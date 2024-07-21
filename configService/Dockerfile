FROM openjdk:8
ADD target/configService.jar configService.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","configService.jar"]