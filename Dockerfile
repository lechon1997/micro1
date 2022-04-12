FROM openjdk:11
COPY "./target/demo-0.0.1-SNAPSHOT.jar" "sumar.jar"
EXPOSE 8081
ENTRYPOINT ["java","-jar","sumar.jar"]