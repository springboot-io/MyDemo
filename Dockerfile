FROM openjdk:8
ADD target/users-app.jar users-app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "users-app.jar"]