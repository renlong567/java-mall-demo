# 该镜像需要依赖的基础镜像
FROM java:8
# 要想在 FROM 之后使用，必须再次指定
ARG JAR_VERSION
ENV JAR_VERSION=${JAR_VERSION}
# 将当前目录下的jar包复制到docker容器的/目录下
ADD target/javademo-${JAR_VERSION}.jar /javademo-${JAR_VERSION}.jar
# 声明服务运行在8088端口
EXPOSE 8088
# 指定docker容器启动时运行jar包
ENTRYPOINT java -jar /javademo-${JAR_VERSION}.jar
# 指定维护者的名字
MAINTAINER demo
