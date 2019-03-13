FROM hub.c.163.com/public/centos:7.2.1511

RUN mkdir /opt/project/ -p
WORKDIR  /opt/project
EXPOSE 9091

ADD  ./build/libs/FirstSpringBoot-0.0.1-SNAPSHOT.jar /opt/project

ENTRYPOINT ["java", "-jar", "FirstSpringBoot-0.0.1-SNAPSHOT.jar"] 


