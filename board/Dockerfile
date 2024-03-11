FROM openjdk:17-jdk

LABEL maintainer="juintination"

LABEL email="juintin@kakao.com"

ARG JAR_FILE=build/libs/board-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} app.jar

EXPOSE 8080

ENTRYPOINT [ "java" ]

CMD [ "-jar", "app.jar" ]
