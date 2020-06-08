INSERT INTO dept
SELECT department_id, department_name
FROM departments;

/*INSERT INTO dept VALUES (10,'Accounts');
INSERT INTO dept VALUES (NULL,'TT');
INSERT INTO dept VALUES (20,'TT');
INSERT INTO dept VALUES ('A1','Accounts');
INSERT INTO dept VALUES (30,'Accounts');
All of them are givingc error because of primary ke constrain(no dublicate),not null
and dept id can only ne in number*/