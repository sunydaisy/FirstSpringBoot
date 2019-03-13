FROM hub.c.163.com/public/centos:7.2.1511

RUN mkdir /opt/project/ -p
WORKDIR  /opt/project
EXPOSE 9091

ADD  ./build/libs/FirstSpringBoot-0.0.1-SNAPSHOT.jar /opt/project
ADD jdk-8u191-linux-x64.tar.gz /root

ENV JAVA_HOME /root/jdk1.8.0_191
ENV PATH $JAVA_HOME/bin:$PATH

ENTRYPOINT ["java", "-jar", "FirstSpringBoot-0.0.1-SNAPSHOT.jar"] 


