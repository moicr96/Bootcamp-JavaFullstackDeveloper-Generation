let btnEjecutar=document.getElementById("btnEjecutar");
// busca el elemento que tenga el  id
let encabezado=document.getElementById("encabezado");
// texto dentro de un elemento se interpreta como texto tal cual
encabezado.innerHTML="<strike>encabezado</strike>"; // html dentro de un elemento se interpreta como html


// encabezado.innerText="<strike>encabezado</strike>";

// selecciona todas las etiquetas dentro de document, regresa unhtml HTMLFormControlsCollection
let lista=document.getElementsByTagName("ul");

console.log(lista.length);

// console.log(lista[0]);

console.log(lista.item(0));

let listGroup=document.getElementsByClassName("list-group-item");
console.log(listGroup.length);

let elemento=document.querySelector("ul>li");
console.log(elemento);

let elementos=document.querySelectorAll("ul>li");
console.log(elementos);

let elementos2=document.querySelectorAll("ul>li:first-child");
console.log(elementos2.length);
console.log(elementos2);

let elementos3=document.querySelectorAll("ul>li:last-child");
console.log(elementos3.length);
console.log(elementos3);

btnEjecutar.addEventListener("click",function(event) {
    event.preventDefault();
    let ul=document.getElementsByClassName("list-group");
    console.log(ul[0]);
    // ul[0].innerHTML=ul[0].innerHTML+"";
    // ul[0].innerHTML+= //esto no es lo optimo si voy a estar creando multiples elementos
    let li6 = document.createElement("li");
    li6.innerText="And a sixth item";
    li6.className="list-group-item";
    console.log(li6);   
    ul[0].append(li6); //ultimo de la lista
    // ul[0].prepend(li6) //principio de la lista
    //ul[0].before(li6); //antes de la lista
    //ul[0].after(li6); //después de la lista

//--------
    // 1.ubicación
    // 1.1 beforebegin
    // 1.2 afterbegin
    // 1.3 beforeend
    // 1.4 afterend
    // 2. html que se insertará

    ul[1].insertAdjacentHTML('beforeend','<li class="list-group-item">AGREGANDING UNO MÁS</li>');
    let li7= document.createElement("li");
    li7.innerText="YA EL ÚLTIMO";
    li7.className="list-group-item";
    ul[1].insertAdjacentElement('beforeend',li7);

})