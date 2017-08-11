FROM frolvlad/alpine-oraclejdk8:slim

WORKDIR /opt

VOLUME /tmp

RUN mkdir /opt/app

EXPOSE 8080

ADD /build/libs/spring-boot-docker-0.1.0.jar /opt/app/app.jar

ENV JAVA_OPTS="-Xmx1g -XX:+UseConcMarkSweepGC -XX:+UseParNewGC -XX:+CMSConcurrentMTEnabled"

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /opt/app/app.jar" ]