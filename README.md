# spring Boot Rest CRUD
Basic Spring Boot Application Rest API

##### Requirements
1. Java - 1.8.x
2. Maven - 3.x.x

##### Steps to Setup
* Clone the application

```git clone https://github.com/rakib09/springBootRestCRUD.git```

Here in the Resource folder, have 4 files. 
* application-dev.properties for dev environment
* application-qa.properties for qa environment
* application-prod.properties for prod environment
* application.properties is the main properties files where spring.profiles.active=dev for setting developing environment

Build and run the app using maven

mvn spring-boot:run

The app will start running at http://localhost:8081.

##### Explore Rest APIs
The app defines following CRUD APIs.

```
GET /api/contact
POST /api/contact
GET /api/contact/{noteId}
PUT /api/contact/{noteId}
DELETE /api/contact/{noteId}
```
We can test them using postman or any other rest client.
