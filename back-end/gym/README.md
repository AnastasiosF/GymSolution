## SpringBoot RestApi in Kotlin

This is an example for a Rest Api with spring Boot.

Implements MVC pattern
#### In ``` application.properties ``` file you can change the connection credentials of the application

### How to run

1. Create an PostgreSQL database (dbName: gym_db) and run the below SQL script 
2. Build and Run
3. Hit http://localhost:8080/api/v1/findAll
##### SQL SCRIPT to create table 
``` 
CREATE TABLE CLIENTS(
       ID INT PRIMARY KEY     NOT NULL,
       NAME           text    NOT NULL,
       SURNAME		  text ,
       BIRTH          DATE     NOT NULL,
       ADDRESS        text
    );
    
    insert into clients (id,name,surname,birth,address) values (1,'John','Smith','10-10-1989','Johnson 8');
    insert into clients (id,name,surname,birth,address) values (2,'John','Smith','10-10-1989','Johnson 8');
    insert into clients (id,name,surname,birth,address) values (3,'John','Smith','10-10-1989','Johnson 8');
    insert into clients (id,name,surname,birth,address) values (4,'John','Smith','10-10-1989','Johnson 8');
    insert into clients (id,name,surname,birth,address) values (5,'John','Smith','10-10-1989','Johnson 8');
    insert into clients (id,name,surname,birth,address) values (6,'John','Smith','10-10-1989','Johnson 8');
    
 ```

 