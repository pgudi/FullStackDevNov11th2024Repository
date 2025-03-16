FROM eclipse-temurin:17
LABEL mentainer="gentechacademy@gmail.com"
WORKDIR /app
ENV port=9090
EXPOSE 9090
COPY target/springboot-department-docker-0.0.1-SNAPSHOT.jar /app/dept.jar
ENTRYPOINT ["java","-jar","dept.jar"]