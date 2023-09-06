let libros = ["Cien Años de Soledad","Rayuela","La Catedral del Mar",
"El Carrousel","Memorias de una Geisha","1984","El Hobbit"]; //así se declara un arreglo
libros.unshift("La Biblia"); //mete al inicio del array un elemento
// console.log(libros.pop());
console.log(libros);
console.log(libros.length); //muestra en al consola la longitud del arreglo

let divAlert=document.getElementById("divAlert");

// divAlert.innerHTML=libros.length+" libros<ul>";

// divAlert.innerHTML+="<li>"+libros[0]+"</li>";
// divAlert.innerHTML+="<li>"+libros[1]+"</li>";
// divAlert.innerHTML+="<li>"+libros[2]+"</li>";
// divAlert.innerHTML+="<li>"+libros[3]+"</li>";
// divAlert.innerHTML+="<li>"+libros[4]+"</li>";
// divAlert.innerHTML+="<li>"+libros[5]+"</li>";
// divAlert.innerHTML+="<li>"+libros[6]+"</li></ul>";

// libros[7]="Farenheit 451";

libros.push("Farenheit 451"); //push agrega un elemento al final del arreglo 

// console.log(libros.pop());
// libros.unshift("Farenheit 451")

libros.sort(); //ordena el arreglo en orden alfabético
divAlert.innerHTML=libros.length+" libros"; //mete al divAlert la cantidad de libros del arreglo

divAlert.innerHTML+=    "<ol><li>"+libros[0]+"</li>"  //mete al divAlert una lista enlistada con los elementos del arreglo
                        +"<li>"+libros[1]+"</li>"
                        +"<li>"+libros[2]+"</li>"
                        +"<li>"+libros[3]+"</li>"
                        +"<li>"+libros[4]+"</li>"
                        +"<li>"+libros[5]+"</li>"
                        +"<li>"+libros[6]+"</li>"
                        +"<li>"+libros[7]+"</li></ol>";

let strLibros=libros.join(", ").toUpperCase(); //los elementos del arreglo los pone en mayúsculas, los combina y ordena separados por una coma y los vuelve un string, y los mete a la variable llamada strLibros
console.log(strLibros); 

let arreglolibros=strLibros.split(", "); //al strLibros los vuelve a separar y lo convierte a un arreglo de nuevo
console.log(arreglolibros); 
console.log(arreglolibros.length); //muestra la cantidad de elemento del arreglo arreglolibros
console.log(arreglolibros[0]); //muestra el primer elemento del arreglo
console.log(arreglolibros[1]); //muestra el segundo elemento del arreglo

let nums =[1, 30, 4, 21, 100000]; //un arreglo de números
console.log(nums.sort()); //ordena los números en orden alfabético, primero los que empiezan en 1, luego los que empiezan en 2, etc.

console.log(nums.sort(compareNumbers)); //ordena los números de menor a mayor
function compareNumbers(a,b){
    return a-b;
}
console.log(compareNumbers(1,5));