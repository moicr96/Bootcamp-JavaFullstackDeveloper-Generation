let data = document.getElementById("txtData"); //aquí vinculamos un elemento del html(el input) a una variable del js
let btnCalcular = document.getElementById("btnCalcular"); //aquí vinculamos un elemento del html(el button) a una variable del js
let resultado = document.getElementById("resultado"); //aquí vinculamos un elemento del html(el texto h3) a una variable del js


btnCalcular.addEventListener("click", function (event) { //hace que al dar click al botón de calcular pase lo que queremos que pase
    event.preventDefault();  
    console.log(data.value); //muestra en la consola el valor del dato entrado en el html
    resultado.innerHTML = "Resultado: Tu tienes " + calculateAge(data.value) + " años"; //manda al h3 del html el resultado con base a la función  calculateAge
})


//función que calcula la edad de alguien(en años) con base a su año de nacimiento
function calculateAge(yearOfBirth){     //yearOfBirth es el dato de entrada del html, es decir, el año en el usuario nació 
    let d=new Date();                   //define a la variable d como una de tipo fecha
    let currentYear=d.getFullYear();    //define a la variable currentYear como el año extraido de la fecha d 
    return currentYear-yearOfBirth;     //es la difetencia entre currentYear y  yearOfBirth
}


//const calculaEdad= (yearOfBirth)=> (new Date()).getFullYear()-yearOfBirth; funcion tipo flecha para calcular edad

// var fechaInicio = new Date('1996-04-24').getTime();
// var fechaFin = new Date('2023-03-21').getTime();

// var diff = fechaFin - fechaInicio;

// console.log(diff / (1000 * 60 * 60 * 24) / 365);