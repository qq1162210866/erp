# Usage: FROM [image name]
#fabric8/java-jboss-openjdk8-jdk
FROM java:8
# Usage: MAINTAINER [name]
MAINTAINER yanyu
VOLUME /tmp
ADD erp1.0.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]
# Usage: EXPOSE [port]
EXPOSE 8090