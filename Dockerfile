FROM openjdk:17-jre-slim

WORKDIR /app
COPY target/sentiment-app-jar-with-dependencies.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
