console.log('****************for****************'); //muestra los múltiplos de 5 antes del número 100 con un ciclo for
for (let cont =0; cont<100; cont+=5){
    console.log(cont);
}

console.log('****************while****************'); //muestra los múltiplos de 5 antes del número 100 con un ciclo while
cont=0;
while (cont<100) {
    console.log(cont);
    cont+=5;
}

console.log('****************do while****************'); //muestra los múltiplos de 5 antes del número 100 con un ciclo do while
cont=0;
do {
    console.log(cont);
    cont+=5;
} while (cont<100);


console.log('****************libros for****************'); //muestra en la consola uno por uno los elementos de un arreglo con un ciclo for
let libros = ["Cien Años de Soledad","Rayuela","La Catedral del Mar", 
"El Carrousel","Memorias de una Geisha","1984","El Hobbit"];
for (let index=0; index<libros.length; index++) {
    console.log(libros[index]);
}

console.log('****************libros while****************'); //muestra en la consola uno por uno los elementos de un arreglo con un ciclo while
cont=0;
while (cont<libros.length) {
    console.log(libros[cont]);
    cont+=1;
}

console.log('****************libros do while****************'); //muestra en la consola uno por uno los elementos de un arreglo con un ciclo do while
index=0;
do {
    console.log(libros[index]);
    index+=1;
} while (index<libros.length);

console.log('****************libros for reverse****************'); //muestra en la consola uno por uno los elementos de un arreglo con un ciclo for solo que empezando desde el final 
for (index=libros.length-1; index>=0; index--) {
    console.log(libros[index]);
}
