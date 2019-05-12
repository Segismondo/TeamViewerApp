/*CREATE DATABASE client_db;*/

INSERT INTO employee (id, name)
VALUES
	(1,"John"),
    (2, "Andrew"),
    (3, "Peter"),
    (4, "Mike"),
    (5, "Joseph"),
    (6, "Michael"),
    (7, "Benito Kamelas"),
    (8, "Oskar"),
    (9, "Olaf");


INSERT INTO project (id, end_date, name, start_date)
VALUES
	(1,'2019-05-01', "Pr1", '2019-04-01'),
    (2,'2020-05-01', "Pr2", '2019-04-01'),
    (3,'2021-05-01', "Pr3", '2019-04-01');

INSERT INTO project_employees(project_id, employees_id)
VALUES
	(1, 1),
    (1, 2),
    (1, 3),
    (2, 4),
    (2, 5),
    (3, 6),
    (3, 7),
    (3, 8);
    
INSERT INTO employee_project(employee_id, project_id)
VALUES 
	(1, 1),
    (2, 1),
    (3, 1),
    (4, 2),
    (5, 2),
    (6, 3),
    (7, 3),
    (8, 3);

    





