# Struts Spring JPA Example

This project is an example of using Struts 2, JPA, and Spring for 
basic CRUD operations.



## Run the Tests
To run the tests use mvn -e clean test

For testing the application uses an in-memory (embedded) database. 

## Project Build and Deployment Guidelines
Use Maven to build the project's .war file - mvn -e clean package

Copy the strutsspringjpaexample.war file to your Servlet container

Visit http://localhost:8080/strutsspringjpaexample/index.jsp in 
your web browser (if your Servlet container is using a different port
change the 8080 to that port)


*   For deploying look at [Deploy Portlets and Servlets](https://spaces.ku.edu/display/IT/Deploy+Portlets+and+Servlets)

## Logging
As the application runs, the log messages are written to the standard out
