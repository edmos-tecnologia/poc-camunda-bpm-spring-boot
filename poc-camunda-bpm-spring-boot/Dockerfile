FROM maven:3.6.3-jdk-8

VOLUME /usr/src
COPY . /var/src
EXPOSE 8080

RUN mvn -f /var/shared/src/pom.xml clean install



