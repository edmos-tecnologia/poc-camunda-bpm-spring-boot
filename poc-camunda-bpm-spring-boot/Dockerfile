FROM maven:latest

VOLUME /usr/src
COPY src/ /var/shared/src
EXPOSE 8080

RUN mvn clean install spring-boot:run



