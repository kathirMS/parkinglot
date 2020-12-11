FROM adoptopenjdk/openjdk11:latest
COPY ./target/parkinglotproblem-0.0.1-SNAPSHOT.jar /home/ubuntu/

#default Jarname 
ARG jarname=parkinglotproblem-0.0.1-SNAPSHOT.jar
ENV JAR_NAME=$jarname

#default profile name
ARG profile=testh2db
ENV PROFILE=$profile

#Working dirctory
WORKDIR /home/ubuntu/


CMD ["sh","-c","java -jar $JAR_NAME  --spring.profiles.active=$PROFILE"]
