# Базовый образ с Java 17
FROM eclipse-temurin:17-jdk-jammy

# Рабочая директория
WORKDIR /app

# Копируем JAR из папки target (Maven)
COPY target/test-project-*.jar test-project.jar

# Открываем порт
EXPOSE 8080

# Запускаем приложение
ENTRYPOINT ["java", "-jar", "test-project.jar"]