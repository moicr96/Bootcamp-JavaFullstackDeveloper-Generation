-- selecciona el esquema o base de datos llamada world
USE world;

-- selecciona y muestra la tabla de las ciudades en la base world
SELECT*FROM world.city; 
-- se limita la cantidad de resultados a 1000 normalmente, depende de la configuración que tengamos
-- lo que pasa es que si son demasiados resultados el proceso puede tardar mucho y no puede ser cancelado ese proceso una vez que empiece 


-- nos da el numero real de resultados 
SELECT COUNT(*) FROM world.city; 
SELECT COUNT(*) FROM world.country; 
SELECT COUNT(*) FROM world.countrylanguage; 

-- nos da la población de cada ciudad
SELECT Name, Population FROM world.city;
-- también puede mostrarse al revés:
SELECT Population, `Name` FROM world.city;

-- muestra la población de la ciudad y la ciudad para los casos donde la población sea menor o igual a 1millón
SELECT Population, `Name` 
FROM world.city 
WHERE Population<=1000000;

-- ahora más complejo muestra los datos asociados a la ciudad donde la población sea menor a mil o mayor a 1millón que NO sean de México
SELECT *
FROM world.city
WHERE (Population<=1000 OR Population>=1000000) AND CountryCode<>'MEX';
-- el simbolo no es igual a se escribe <> o también !=

-- muestra los distintos continentes que hay 
-- distinct es como una función, por eso se tiene que usar paréntesis, similar a COUNT()
SELECT DISTINCT(Continent)
FROM world.country;
-- muestra los todos y cada uno de los continentes que hay ingresados en la base de datos, son muchos porque son uno por cada dato
SELECT (Continent)
FROM world.country;

-- ahora muestra los paises donde el continente y la región tengan la palabra America al final en su dato de continente o region
-- LIKE busca campo por campo, le cuesta mucho más trabajo al servidor y hacer que el proceso sea tardado
SELECT *
FROM world.country
WHERE Continent LIKE '%America' AND Region LIKE '%America';
-- el % es como un comodin, 
-- si quiero buscar la palabra america al principio del dato sería escribirir Continent LIKE 'America%'
-- si quiero buscar la palabra america al final del dato sería escribirir Continent LIKE '%America'
-- si quiero buscar la palabra america en cualquier lugar del dato continente sería escribir Continent LIKE '%America%' esta es la modalidad que tarda más

-- muestra los datos de los paises ordenados primero por continente luego por región luego por nombre
SELECT *
FROM world.country
ORDER BY Continent, Region, `Name`;

SELECT *
FROM world.country
ORDER BY `Code`;