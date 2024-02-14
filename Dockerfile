FROM openjdk:11-jdk
COPY ./target/Scientific_Calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "Scientific_Calculator-1.0-SNAPSHOT.jar","org/example/Scientific_Calculator"]