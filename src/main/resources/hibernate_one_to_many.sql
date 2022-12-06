DROP TABLE IF EXISTS employees;
DROP TABLE IF EXISTS departments;

CREATE TABLE departments (
    id SERIAL NOT NULL,
    name VARCHAR(15),
    max_salary INTEGER,
    min_salary INTEGER,
    PRIMARY KEY (id)
);

CREATE TABLE employees (
    id SERIAL NOT NULL,
    name VARCHAR(15),
    surname VARCHAR(25),
    salary INTEGER,
    department_id INTEGER,
    PRIMARY KEY (id),
    FOREIGN KEY (department_id) REFERENCES departments(id) ON DELETE RESTRICT
);
