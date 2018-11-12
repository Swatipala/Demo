# Stationery-Management

This application is use for Stationery Request Process

# Overview
The Stationery service is implemented as a microservice that could be deployed/invoked independent of any client application. Spring and Spring Boot are used to implement the service, Spring Boot provides very nice features regarding packaging and deployment, it packages the whole service as a runnable jar file with the support of its embedded tomcat server. JAX-RS is used to expose the service endpoints as REST. MongoDB is used to persist log messages, Log4j is used as the backbone logging framework.

# Technologies :

Spring Boot :Simplify the development, packaging and deployment of spring applications by providing fast and ready environment for development, Packages the complete solution as a runnable jar with an embedded tomcat server.

MongoDB : A NOSQL scalable DB based on document data model which provides handy scalable data model that fits the need to adapt or change the model later as the requirements evolve.

Spring Data : Provides handy features for data mapping and manipulation backed by MongoDB. 

Eureka :Providesmicroservice Registration and Discovery interactions between services and provide reliable and failure-tolerant.

# Architecture and design :

![architecture1](https://user-images.githubusercontent.com/32635250/47918918-f84c0f00-ded3-11e8-85ad-7b5a4de5e644.jpg)

![stationery warehouse](https://user-images.githubusercontent.com/32635250/47913025-83230e80-dec0-11e8-9d07-72a689b24426.png)


# Run application

mvn install

java -jar target/stationery-service-1.0-SNAPSHOT.jar
