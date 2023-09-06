/*
localStorage
-almacena información en el navegador, y se mantiene aunque el navegador se cierre

sessionStorage
-almacena información en el navegador y se pierde cuando el navegador se cierra cierra
*/

//primero se linkean en variables los botones del html
let btnGuardar = document.getElementById("btnGuardar");
let btnVer = document.getElementById("btnVer");
let btnBorrar = document.getElementById("btnBorrar");
let txtData = document.getElementById("data");
let alertResultado = document.getElementById("alertResultado");

// luego se agregan funciones para manejo del local/session storage
let key = "info";
btnGuardar.addEventListener("click", function (event) { //función para guardar en la memoria
    event.preventDefault();
    // console.log("Guardar");
    // localStorage.setItem(key, txtData.value);
    sessionStorage.setItem(key, txtData.value);
});
btnVer.addEventListener("click", function (event) { //función para acceder a la memoria y mostrar el valor de la llave dada
    event.preventDefault();
    // console.log("Ver");
    // alertResultado.innerText = localStorage.getItem(key);
    alertResultado.innerText = sessionStorage.getItem(key);
});
btnBorrar.addEventListener("click", function (event) { //función para eliminar un dato de la memoria
    event.preventDefault();
    // localStorage.removeItem(key);
    sessionStorage.removeItem(key);
});