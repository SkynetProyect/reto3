# for ARM:
# FROM arm64v8/eclipse-temurin:24-jre-alpine

# for x86:
FROM eclipse-temurin:24-jre-alpine

COPY /target/*.jar app-estudiantes.jar

CMD ["java", "-jar", "app-estudiantes.jar"]

EXPOSE 8080

# crear imagen: docker build -t nombre .
# ver imagenes: docker images
# borrar imagen: docker rmi nombre

# ver contenedores: docker ps -a
# detener contenedor: docker stop nombre
# iniciar contenedor: docker start nombre
# borrar contenedor: docker rm nombre
