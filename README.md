PostgresAndSpringBoot information ->

This Project is build to make use of Postgresql db as database and interact with ui.

Main Package classes ->

App.java contains the code that starts the springboot application . 

RestController1.java contains the code that maps the browser request to the server method . 

Cities.java contains the code that maps to cities table in postgresql and has getter and setters for the table feilds .

CityRepository.java contains the code that use crudRepository dependency to use queries in table .

ICityService.java contains the code that has declaration of business implementation methods . 

ICityServiceImpl.java contains the code that has definition of business implementation methods and interacts with repository. 

Resource Package ->

Application.properties contains the config for postgresql connection and server configuration .

data-postgres.sql contains the queries to insert the data into cities table in database . 

src/main/Resources/Templates folder - >

showCities.html is the ui that is called from RestController1 method and adds the data retrieved from repository to the ui . 

Pom.xml ->

Contains the required dependencies to connect with postgres database and to create web application . 

End PostgresAndSpringBoot .

Thankyou .

Hope you'll understand the implementation of this project . 
