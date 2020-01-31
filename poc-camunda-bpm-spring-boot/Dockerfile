FROM maven:latest

LABEL Description="Imagem Docker para build e execução de aplicação SpringBoot via Maven"

VOLUME /usr/src
COPY src/ /var/shared/src
EXPOSE 8080

RUN mvn clean install spring-boot:run



