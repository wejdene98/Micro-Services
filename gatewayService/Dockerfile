FROM openjdk:8
ADD target/gatewayService.jar gatewayService.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "gatewayService.jar"]