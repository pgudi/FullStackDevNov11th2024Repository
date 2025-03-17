FROM eclipse-temurin:17
LABEL mentainer="gentech.academy@gmail.com"
ENV port=9091
EXPOSE 9091
WORKDIR /sample
COPY target/*.jar /sample/samplemar.jar
ENTRYPOINT ["java","-jar","samplemar.jar"]