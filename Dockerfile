# 1. Imagen base con Maven y Java 21 para compilar
FROM maven:3.9.4-eclipse-temurin-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean package

# 2. Imagen final más ligera solo con Java para ejecutar
FROM eclipse-temurin:21
WORKDIR /app
COPY --from=build /app/target/ProyectoMavenFinal-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
