#define base docker image
FROM openjdk:21
LABEL maintainer="pradeep"
ADD target/InstaChat-0.0.1-SNAPSHOT.jar instachatv2.jar
ENTRYPOINT ["java", "-jar", "instachatv2.jar"]
