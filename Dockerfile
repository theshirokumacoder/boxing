FROM openjdk:17-jdk

COPY target/shirokuma-boxing.jar .
EXPOSE 8080
ENTRYPOINT ["java" ,"-jar", "shirokuma-boxing.jar"]
