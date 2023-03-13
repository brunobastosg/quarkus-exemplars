CREATE TABLE person(
    id SERIAL NOT NULL PRIMARY KEY,
    name CHARACTER VARYING(60) NOT NULL,
    age SMALLINT NOT NULL
);

INSERT INTO person(name, age) VALUES ('John', 30);
INSERT INTO person(name, age) VALUES ('Jane', 23);
INSERT INTO person(name, age) VALUES ('Sarah', 41);
