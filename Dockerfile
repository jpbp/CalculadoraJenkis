FROM tomcat:8.5.56-jdk11-openjdk
COPY target/index.war /usr/local/tomcat/webapps/index.war