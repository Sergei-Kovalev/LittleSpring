DROP TABLE IF EXISTS mtm_child_section;
DROP TABLE IF EXISTS mtm_children;
DROP TABLE IF EXISTS mtm_section;

CREATE TABLE mtm_children (
    id SERIAL NOT NULL,
    name VARCHAR(15),
    age INTEGER NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE mtm_section (
    id SERIAL NOT NULL,
    name VARCHAR(15),
    PRIMARY KEY (id)
);

CREATE TABLE mtm_child_section (
    child_id INTEGER,
    section_id INTEGER,
    PRIMARY KEY (child_id, section_id),
    FOREIGN KEY (child_id) REFERENCES mtm_children(id),
    FOREIGN KEY (section_id) REFERENCES mtm_section
)
