// ===========================una función que suma dos números
function suma(a,b) {
   return(a+b)
} //suma en una funcion normal

let resultado=suma(10,35);
console.log(resultado);
// // ó
// console.log(suma(10,35));

// ===========================definición de una constante con base a una función que suma dos números
// const suma=function(a,b) {
//    return(a+b);
// }

// ===========================definición de una constante con base a una función tipo fecha que suma dos números
//const suma = (a,b)=>(a+b); //funcion tipo flecha

// ===========================lo mismo pero con más argumentos
// const suma = (a, b) => {
//     a = Number(a);
//     b = Numbrer(b);
// }



// ===========================función que a partir de un nombre lo hace mayúsculas o minúsculas o te muestra un caractér o así
function iniciales(nombre) { //nombre tiene que estar entre comillas
    //return nombre.toUpperCase(); 
    //return nombre.toLowerCase(); 
    //return nombre.charAt(0);
    return nombre.charAt(1).toLowerCase(); //aquí se le aplica un comando a otro comando
} //iniciales
let res=iniciales("MIPI");
console.log(res);



// ===========================función que te da el año de una fecha dada
// function currentYear(){
//    let fecha=new Date();
//    return fecha.getFullYear();
// }//current year
// var today = new Date();
// var day = today.getDate();
// console.log(currentYear(day));

// ===========================lo mismo pero en función flecha
const currentYear = () => ((new Date()).getFullYear()); //función que da el año de una fecha
today = new Date(); //se declara un objeto tipo fecha 
var day = today.getDate();  //se obtiene el día del mes actual, get date de una fecha cualquiera da el día del mes actual
console.log(currentYear(day)); //se obtiene el año actual con base al día actual

// func = (palabra) => palabra.split(palabra).length - 1;
func = (palabra) => palabra.split(palabra).length- 1; //a una palabra se le hace split con si misma, entonces v a a dar ["",""], luego se le saca el length cuyo resultado es 2 porque son dos elementos, luego se le resta 1 a ese 2 y el resultado es uno, una función bien rara la verdad
let ejer=func("dos");
console.log(ejer);

x=6+3+"3"
console.log(x); //imprime el número 93, 9 más el texto "3"