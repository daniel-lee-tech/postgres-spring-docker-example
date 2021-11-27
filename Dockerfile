# using maven with jdk 17 offical image from docker hub
FROM maven:3.8.4-openjdk-17

# using this directory as the root directory for our application
ENV APP_HOME=/usr/app

# telling docker runtime to run commands in the APP_HOME directory by default
WORKDIR $APP_HOME

# copying source code into container
COPY . .

# exposing port 8080 on host
EXPOSE 8080


# running spring boot project with maven but cleaning first
CMD ["mvn", "spring-boot:run"]