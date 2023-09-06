function businessHours(dayNumber,hourNumber){
    let res;e
    if (day<=0){
        res=false;
    } else {
        res=true;
    }
    return res
}


btnCalcular.addEventListener("click", function (event) {
    event.preventDefault();
    console.log(data.value);

    let day=parseInt(dia.value);
    let hour=parseInt(hora.value);
    let day=parseInt(dia.value);
    
//     if (day==0){
//         message="es fin de semana";
//     } else if(day==6){
//         message="es fin de semana";
//     } else {
//         message="es dia habil";
// }

//     if (hour<9){
//         message+="no es horario habil";
//     } else if (hour<18){
//         message+="si es horario habil";
//     } else {
//         message+="no es horario habil";
//     }
    if (businessHours(dA))
})