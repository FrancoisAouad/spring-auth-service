FROM java:lts
WORKDIR /usr/src/app
COPY . /usr/src/app
EXPOSE 5001
RUN ./mvnw
CMD ["java", "-jar", "target/spring-app-0.0.1-SNAPSHOT.jar"]