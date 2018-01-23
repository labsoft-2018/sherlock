FROM java:8
MAINTAINER labsoft-2018

ADD target/sherlock-0.0.1-SNAPSHOT-standalone.jar /srv/sherlock.jar

EXPOSE 8414

CMD ["java", "-jar", "/srv/sherlock.jar"]
