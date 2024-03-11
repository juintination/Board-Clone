FROM khipu/openjdk17-alpine

LABEL maintainer="juintination"

LABEL email="juintin@kakao.com"

WORKDIR /app

COPY . .

RUN ./gradlew clean build -x test

ARG JAR_FILE=build/libs/board-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} app.jar

EXPOSE 8080

ENTRYPOINT [ "java" ]

CMD [ "-jar", "app.jar" ]
