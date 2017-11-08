Spring-boot Web Application with Hibernate
================================================================================== 
Testing how to combine several technologies to the new Spring framework

## Project Dependencies
- Java 8
- Spring Boot (https://projects.spring.io/spring-boot/)
- Maven (https://maven.apache.org/) software project management tool
- Hibernate (http://hibernate.org/) ORM
- Hibrenate Search by Lucene Search Engine (https://lucene.apache.org/core/) a full-text search engine
- WildFly (http://wildfly.org/about/) a runtime service
- Thymeleaf (http://www.thymeleaf.org/) a template engine for UI
- HSQLDB (http://hsqldb.org/) an embedded java db


## Prepare your system
- Have java sdk bin in your classpath
- Install Apache Maven. Have the bin in your classpath
- Install Spring Boot CLI (https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#getting-started-installing-the-cli). Have the bin in your classpath.
- have a fast Internet connection


## Installation
- download the project in zip
- unzip it to find directory "spring-boot-test".
- In command line, cd to "spring-boot-test". Find pom.xml there. All following commands should be issued from there.
- Download all missing library files and package the project into a .war file by this command:
- mvn package
- the first time packaging will need a while of waiting for many MBs of files to download
- When it is done without error, a new directory "target" will be created


## Deploying the project
- inside the "target" directory there should be a .war file created, for deploying to tomcat, jboss, websphere or any servlet container
- This war file can even run by itself without deploy - because it has a built-in servlet container
- For testing purpose, the built-in runtime service is set to run in localhost:9000
- In command line, in the root of the project (where you find pom.xml), type in:
- mvn spring-boot:run
- Spring will test the project for correctness, and then startup the built-in server.
- When you see "Started WildflySpringBootApplication in xx seconds", it is ready to use.


## Trying out the web App
- In a browser, open localhost:9000
- The default interface is a textbox. The Web App is to do text search from an embedded database
- Try searching for "gb"
- Try searching for "black"
- Try searching for "used"
- shut down the server by command: Ctrl-C



