#Etapa 1 build con gradle 
FROM gradle:8.14-jdk17 AS build
WORKDIR /app
COPY . .
RUN gradle build -x test --no-daemon

# Etapa 2 imagen ligera de runtime 
FROM eclipse-temurin:17-jre
WORKDIR /app

COPY --from=build /app/build/libs/*.jar app.jar

EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "app.jar" ]