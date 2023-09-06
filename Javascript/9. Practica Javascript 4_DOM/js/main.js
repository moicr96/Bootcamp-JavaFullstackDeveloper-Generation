let nombre1=document.getElementById("Nombre1Data");
let data = document.getElementById("Edad1Data");
let btnCalcular = document.getElementById("btnCalcular1");
let resultado = document.getElementById("resultado1");

btnCalcular.addEventListener("click", function (event) {
    event.preventDefault();
    resultado.innerHTML = "Welcome " +nombre1.value+ " you are "+calculateAge(data.value)+" years old";
})

let nombre2 = document.getElementById("Nombre2Data");
let data2 = document.getElementById("Edad2Data");
let btnCalcular2 = document.getElementById("btnCalcular2");
let resultado2 = document.getElementById("resultado2");

btnCalcular2.addEventListener("click", function (event) {
    event.preventDefault();
    resultado2.innerHTML = "Welcome " +nombre2.value+ " you are "+calculateAge(data2.value)+" years old";
})

let nombre3 = document.getElementById("Nombre3Data");
let data3 = document.getElementById("Edad3Data");
let btnCalcular3 = document.getElementById("btnCalcular3");
let resultado3 = document.getElementById("resultado3");

btnCalcular3.addEventListener("click", function (event) {
    event.preventDefault();
    resultado3.innerHTML = "Welcome " +nombre3.value+ " you are "+calculateAge(data3.value)+" years old";
})

function calculateAge(yearOfBirth){
    let d=new Date();
    let currentYear=d.getFullYear();
    return currentYear-yearOfBirth;
}



//const calculaEdad= (yearOfBirth)=> (new Date()).getFullYear()-yearOfBirth; funcion tipo flecha para calcular edad

// var fechaInicio = new Date('1996-04-24').getTime();
// var fechaFin = new Date('2023-03-21').getTime();

// var diff = fechaFin - fechaInicio;

// console.log(diff / (1000 * 60 * 60 * 24) / 365);