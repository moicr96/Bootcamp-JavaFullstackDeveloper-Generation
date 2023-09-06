const suma=require("./main.js"); //trae a la función suma del archivo main.js

test("sumar dos nums 2+2", //función de prueba que prueba la otra función de suma, 
    ()=>{
        expect(suma(2,2)).toBe(4); //suma los números 2 y 2 y espera que el resultado sea 4 
    }
);
test("sumar dos nums 20+20", 
    ()=>{
        expect(suma(20,20)).toBe(40);
    }
);