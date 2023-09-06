-- borra los datos de la tabla donde la condicion se cumpla (su id es 20)
delete from categorias WHERE id=20;

-- insertar registros en la tabla categorias, primero el nombre y luego la descripcion: 
INSERT INTO categorias (nombre, descripcion)
values ('cuadernos profesionales',
'cuadernos tamaño profesional con arillo de metal');

-- INSERT INTO categorias (id, nombre, descripcion)
-- VALUES (1, 'Cuadernos profesionales', 'Cuadernos tamaño profesional con anillo de metal');

