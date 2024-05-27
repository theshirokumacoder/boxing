FROM openjdk:17-jdk

COPY target/shirokuma-boxing.jar .
ENTRYPOINT ["java" ,"-jar", "shirokuma-boxing.jar"]
