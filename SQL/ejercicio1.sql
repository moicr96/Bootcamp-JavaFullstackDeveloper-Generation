create database generationdb;
use generationdb;
create table students (
	student_id INT NOT NULL auto_increment,
	first_name VARCHAR(150) NOT NULL,
	last_name VARCHAR(150) NOT NULL,
    `group id` INT NOT NULL,
    PRIMARY KEY (student_id)
);

-- drop table students

create table `groups` (
	`group id` INT NOT NULL auto_increment,
    `name` VARCHAR(150) NOT NULL,
    PRIMARY KEY (`group id`)
);

-- drop table `groups`;

-- mete a la tabla groups en la columna name el valor ch25
INSERT INTO `groups` (name) VALUES ('CH25');

-- se mete a la tabla students en ciertas columnas ciertos datos
INSERT INTO students (first_name, last_name, `group id`)
VALUE ('Valeria', 'Arquieta', '1');

INSERT INTO students (first_name, last_name, `group id`)
VALUE ('Alonso', 'Serrano', '1');

-- se elimina la columna groupid de la tabla students
-- se le reañade la columna groupid con ciertas características
alter table students drop `group id`;
ALTER TABLE students add `group id` int not null default 1; -- aqui se le define un valor por defecto de 1
alter table students modify column `group id`; -- esto está incompleto, arreglar
