FROM hub.c.163.com/public/centos:7.2.1511

ARG workdir=/app
VOLUME ${workdir}
WORKDIR ${workdir}
ADD ./build/libs/FirstSpringBoot-0.0.1-SNAPSHOT.jar /opt/project/
ADD ./docker/startup.sh  /opt/project

ENTRYPOINT ["sh", "startup.sh", "firt-spring-boot"] 

