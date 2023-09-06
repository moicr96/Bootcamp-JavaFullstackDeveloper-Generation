-- selecciona la base de datos papedb 
use papedb;
-- muestra la lista de tablas de la base de datos actual
show tables;
-- muestra la estructura de la tabla productos
describe  productos;
-- muestra la version en la que estamos ejecutando
select version();
-- muestra el usuario que está ejecutando
select user();

-- crear una nueva base de datos llamada generationdb
create database generationdb;
-- borrar la base de datos llamada generationdb
drop database generationdb;

-- crear una tabla de proveedores
create table proveedores (
	id INT NOT NULL auto_increment,
    nombre VARCHAR(150) NOT NULL,
    RFC CHAR(12) NOT NULL,
    PRIMARY KEY (`id`)
);
-- borrar la tabla de proveedores
drop table proveedores;

-- modificar el campo dirección para que tenga otro valor por defecto
alter table proveedores 
add direccion varchar(200) not null default 'domicilio desconocido '; 

