# openjdk:8-jdk-alpine es una imagen de Java 8 muy ligera.
FROM openjdk:8-jdk-alpine
LABEL maintainer="Carlos Camacho <ca.camacho@ce.pucmm.edu.do>"
ENV servidor-eureka = 'localhost'
ENV servidor-config = 'localhost'
EXPOSE 8761
COPY build/libs/*.jar mi_app.jar
ENTRYPOINT ["java", "-jar", "mi_app.jar"]