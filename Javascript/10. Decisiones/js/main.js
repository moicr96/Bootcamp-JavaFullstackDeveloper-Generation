let dia = document.getElementById("txtDia");
let hora = document.getElementById("txtHora");
let btnCalcular = document.getElementById("btnCalcular");
let resultado = document.getElementById("resultado");

btnCalcular.addEventListener("click", function (event) {
    event.preventDefault();
    console.log(dia.value);

    let day=parseInt(dia.value);
    let hour=parseInt(hora.value);
    let message;
    
    if (day==0){
        message="es fin de semana <br/>";
    } else if(day==6){
        message="es fin de semana <br/>";
    } else {
        message="es dia habil <br/>";
}

    if (hour<9){
        message+="no es horario habil";
    } else if (hour>18){
        message+="no es horario habil";
    } else {
        message+="es horario habil";
    }
    resultado.innerHTML=message;
})//btncalcular

// function businessHours(dayNumber,hourNumber){
//     let res;
//     if ((dayNumber<=0)||(dayNumber>=6)||(hourNumber<9)||(hourNumber>18)){
//         res=false;
//     } else {
//         res=true;
//     }
//     return res
// }




// function calculateAge(yearOfBirth){
//     let d=new Date();
//     let currentYear=d.getFullYear();
//     return currentYear-yearOfBirth;
// }

// function businessHours(dayNumber, hourNumber)({
//     if{ 

//     } else {

//     } 
//     return decition
// })

// function calculatehours(yearOfBirth){
//     let d=new Date();
//     let hour = d.getHours();
//     let currentYear=d.getFullYear();
//     return hour;
// }

// const d = new Date();
// let hour = d.getHours();