DROP TABLE IF EXISTS employees;

CREATE TABLE employees (
  id SERIAL NOT NULL,
  name VARCHAR(15),
  surname VARCHAR(25),
  department VARCHAR(20),
  salary INTEGER,
  PRIMARY KEY (id)
);