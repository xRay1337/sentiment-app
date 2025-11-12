# Используем официальный образ Java 22
FROM eclipse-temurin:22-jre-jammy

WORKDIR /app

# Копируем fat JAR с зависимостями
COPY target/sentiment-app-jar-with-dependencies.jar app.jar

# Открываем порт
EXPOSE 8080

# Запускаем приложение
ENTRYPOINT ["java", "-jar", "app.jar"]
