#!/bin/bash
#定义执行jar文件名称
JAR_FILE=FirstSpringBoot-0.0.1-SNAPSHOT.jar
backdate=`date +%m%d_%H%M`
JAR_FILE_BACK=back/$JAR_FILE'.'$backdate 

cd /home/program/service

#获取正在运行的项目进程号
pid=`ps -ef |grep $JAR_FILE |grep -v grep |awk '{print $2}'`
echo '>>> oldVersion run pid is '$pid 

#如果存在pid则kill掉相关进程
if [ -n "$pid" ];then
    kill -9 $pid
    echo '>>> success to kill oldVersion pid : '$pid
fi

#如果jar文件存在则备份文件


#调用java命令运行springboot项目
source /etc/profile
nohup java -jar $JAR_FILE  > boot-service.log  2>&1 &

echo '>>> start success'
