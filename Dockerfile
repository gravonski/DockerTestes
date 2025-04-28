FROM eclipse-temurin:17
LABEL maintaner="gravonskia@gmail.com"
WORKDIR /app
COPY DockerTestes10x/target/DockerTestes10x-0.0.1-SNAPSHOT.jar /app/aula-docker.jar
ENTRYPOINT ["java", "-jar", "aula-docker.jar"]