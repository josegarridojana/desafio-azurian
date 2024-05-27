FROM openjdk:23-ea-11-jdk

WORKDIR /app

COPY ./target/desafio-azurian-1.0.0.jar .

EXPOSE 8088

ENTRYPOINT ["java", "-jar", "desafio-azurian-1.0.0.jar"]