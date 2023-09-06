-- selecciona y muestra de la tabla employees y a su vez de la database employees la(s) fila(s) donde el emp_no coincide con el dato 10010
SELECT*FROM employees.employees
WHERE emp_no=10010;

-- selecciona y muestra de la tabla dept_emp y a su vez de la database employees la(s) fila(s) donde el emp_no coincide con el dato 10010
SELECT*FROM employees.dept_emp
WHERE emp_no=10010;

-- selecciona y muestra de la tabla departments y a su vez de la database employees las filas de datos donde su  dept_no coincida con el dato D005
SELECT*FROM employees.departments
WHERE dept_no='D005';

-- selecciona unos datos y los apoda
-- hace inner joins tomando como dato común el emp_no mientras sea menor a 10010
SELECT e.emp_no, e.first_name, e.last_name, d.dept_name,de.dept_no, de.from_date, de.to_date
FROM employees.employees AS e 
INNER JOIN employees.dept_emp AS de
ON e.emp_no=de.emp_no
INNER JOIN employees.departments AS d
ON de.dept_no=d.dept_no
WHERE e.emp_no<=10010;

-- selecciona y muestra todos los registros de la tabla departments de la base de datos employees y los ordena por dept_no de menor a mayor
SELECT*FROM employees.departments
ORDER BY dept_no;

-- selecciona y muestra  las columnas d.dept_no y d.dept_name de la tabla departments de la database employees 

-- tomando como dato común el dept_no 
-- hace un left join entre y 
-- y los ordena por dept_no
SELECT d.dept_no, d.dept_name
FROM employees.departments AS d
LEFT JOIN employees.dept_emp AS de
ON d.dept_no=de.dept_no
ORDER BY d.dept_no;

-- selecciona y muestra ciertas columnas 
-- hace un right join 
-- tomando como dato común de enlace el e.emp_no
-- usando como ayuda los apodos
-- con la condición de e.emp_no>499995 y ordenado de mayor a menor por el e.emp_no
SELECT s.emp_no, e.first_name, e.last_name,
s.salary, s.from_date, s.to_date
FROM employees.salaries AS s
RIGHT JOIN employees.employees AS e
ON s.emp_no=e.emp_no
WHERE e.emp_no>499995
ORDER BY  e.emp_no DESC;

-- se insertan ciertos datos en cierta tabla, luego se muestran y se ordenan
INSERT INTO `employees`.`employees` (`emp_no`, `birth_date`, `first_name`, `last_name`, `gender`, `hire_date`) VALUES ('500000', '1980/01/01', 'Jane', 'Doe', 'F', '2000/01/01');
SELECT*FROM employees.employees
ORDER BY emp_no DESC;
