FROM openjdk:11
EXPOSE 8082
ADD target/spring-image-push-demo.jar spring-image-push-demo.jar
ENTRYPOINT ["java", "-jar", "/spring-image-push-demo.jar"]