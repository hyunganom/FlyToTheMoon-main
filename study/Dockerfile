# 1. 베이스 이미지로 OpenJDK 17 (platform 명시)
FROM --platform=linux/amd64 openjdk:17-jdk-alpine

# 2. 애플리케이션 JAR 파일을 컨테이너로 복사
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# 3. 컨테이너 시작 시 실행할 명령어
ENTRYPOINT ["java", "-jar", "/app.jar"]
