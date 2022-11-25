FROM openjdk:17-alpine
EXPOSE 443
WORKDIR /app
ADD target/fer-0.0.1-SNAPSHOT.jar fer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","fer-0.0.1-SNAPSHOT.jar"]