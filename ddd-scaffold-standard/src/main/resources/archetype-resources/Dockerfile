FROM openjdk:21-slim

MAINTAINER hollowlatte

EXPOSE 8000-9000

# 时区
ENV TZ=PRC
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

WORKDIR /opt

COPY ./start/target/start.jar /opt/start.jar

CMD ["java", "-jar", "start.jar"]