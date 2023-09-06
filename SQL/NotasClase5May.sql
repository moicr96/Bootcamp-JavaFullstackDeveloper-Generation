
-- te muestra los paises dentro de los continentes de asia, africa y europa
SELECT*
FROM world.country
WHERE Continent='Asia'
OR Continent='Africa'
OR Continent='Europa';

-- otra forma tal vez mejor:
SELECT*
FROM world.country
WHERE Continent IN ('Asia', 'Africa', 'Europa');

-- te muestra todos los registros de la tabla country de la database world donde no tiene el dato de su año de independecia
SELECT*
FROM world.country
WHERE IndepYear IS NULL; 

-- te muestra todos los registros de la tabla country de la database world donde si tiene el dato de su año de independecia y además de los ordena por el año de indepencia de menor a mayor
SELECT*
FROM world.country
WHERE IndepYear IS NOT NULL
ORDER BY IndepYear;

-- selecciona y muestra todos los registros de la tabla city de la base de datos world donde la población no cumple cierta condición (Population<=1000000)
SELECT*
FROM world.city
WHERE NOT Population<=1000000;

-- selecciona y muestra todos los registros de la tabla city de la base de datos world donde el dato de Population esté entre mil y 1millón y los ordena de menor a mayor con base a ese mismo dato
SELECT*
FROM world.city
WHERE NOT Population BETWEEN 1000 AND 1000000
order by Population;

-- selecciona y muestra de la tabla city dentro de la database world, las columnas Code, Name y GNP pero renombrándolas respectivamente como Código, Nombre y PIB
SELECT `Code` AS `Código`, `Name` AS Nombre, GNP AS PIB 
FROM world.country;