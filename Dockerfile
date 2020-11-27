FROM adoptopenjdk/openjdk11:latest
COPY ./target/parkinglotproblem-0.0.1-SNAPSHOT.jar /home/admin-pc/

#default Jarname 
ENV JAR_NAME parkinglotproblem-0.0.1-SNAPSHOT.jar

#default profile name
ENV PROFILE testh2db

#Working dirctory
WORKDIR /home/admin-pc/


CMD ["sh","-c","java -jar $JAR_NAME  --spring.profiles.active=$PROFILE"]
