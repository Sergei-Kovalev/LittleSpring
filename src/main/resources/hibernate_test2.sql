DROP TABLE IF EXISTS employees;
DROP TABLE IF EXISTS details;

CREATE TABLE details (
    id SERIAL NOT NULL,
    city VARCHAR(15),
    phone_number VARCHAR(25),
    email VARCHAR(30),
    PRIMARY KEY (id)
);

CREATE TABLE employees (
    id SERIAL NOT NULL,
    name VARCHAR(15),
    surname VARCHAR(25),
    department VARCHAR(20),
    salary INTEGER,
    details_id INTEGER NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (details_id) REFERENCES details(id) ON DELETE RESTRICT
);
