let data = document.getElementById("txtData");
let btnCalcular = document.getElementById("btnCalcular");
let resultado = document.getElementById("resultado");


btnCalcular.addEventListener("click", function (event) {
    event.preventDefault();
    console.log(data.value);
    resultado.innerHTML = "resultado" + calculatePaying(data.value);
})

function calculatePaying(transaction){
    let Paying=transaction*.01+3
    return Paying;
}

//const calculaEdad= (yearOfBirth)=> (new Date()).getFullYear()-yearOfBirth; funcion tipo flecha para calcular edad

// var fechaInicio = new Date('1996-04-24').getTime();
// var fechaFin = new Date('2023-03-21').getTime();

// var diff = fechaFin - fechaInicio;

// console.log(diff / (1000 * 60 * 60 * 24) / 365);