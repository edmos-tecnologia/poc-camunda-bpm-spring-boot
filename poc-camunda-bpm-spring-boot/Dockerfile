FROM maven

LABEL Description="Imagem Docker para build e execução de aplicação SpringBoot via Maven"

VOLUME /usr/src
WORKDIR .
COPY src/ /var/shared/src
EXPOSE 8080

RUN mvn clean install spring-boot:run



