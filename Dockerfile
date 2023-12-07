FROM 966432988823.dkr.ecr.us-east-1.amazonaws.com/openjdk:11-stable

LABEL maintainer="devops@wakanda.academy"

WORKDIR /app

COPY target/wakacop-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

CMD ["/app/startup.sh", "-jar", "wakacop-0.0.1-SNAPSHOT.jar"]