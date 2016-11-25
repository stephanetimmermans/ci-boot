FROM jolokia/alpine-jre-8
WORKDIR /
COPY target/ci-boot-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT [ "java", "-jar", "/app/app.jar"]
EXPOSE 8080