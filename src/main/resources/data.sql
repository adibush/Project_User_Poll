

CREATE TABLE users(
    id int NOT NULL AUTO_INCREMENT,
    first_name varchar(300) NOT NULL DEFAULT '',
    last_name varchar(300) NOT NULL DEFAULT '',
    email varchar(300) NOT NULL DEFAULT '',
    age int NOT NULL DEFAULT '',
    address varchar(300) NOT NULL DEFAULT'',
    date_time  DATE ,
    PRIMARY KEY (id)
);

INSERT INTO users (first_name, last_name, email, age,address,date_time)
VALUES ('a','aa','a@mail.com',18,'ashkelon',CURRENT_DATE()),
        ('b','bb','b@mail.com',20,'tel aviv',CURRENT_DATE()),
        ('c','cc','c@mail.com',29,'ashdod',CURRENT_DATE());


