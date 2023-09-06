let divEmployees = document.getElementById("divEmployees"); //guarda en una variable el lugar donde se va a generar cada tarjeta, en este caso es un div del html

class Person { //representa una persona y su informacion, consta de un constructor,un generador de tarjeta
    
    name = ""; /**class @property {string} name -identifica el nombre de la persona */
    email = ""; /**class @property {string} email -identifica el email de la persona */
    age = 0; /**class @property {number} age -identifica la edad de la persona */
    resume = ""; /**class @static {string} resume -identifica el resume de la persona */ 
    id = 0; /**class @static {number} id  -identifica el id de la persona */
    
    static total = 0; //variable de iniciación total, más adelante se usa para ponerle un id a la persona
    /**
     * 
     * @param {*} name 
     * @param {*} email 
     * @param {*} age 
     * @param {*} resume 
     */
    constructor(name, email, age, resume) {
        this.name = name;
        this.email = email.toLowerCase();
        this.age = (age < 18) ? 18 : age;
        this.resume = resume;
        Person.total++; 
        this.id = Person.total;
    } //un constructur es una estructura de un objeto, como un molde, establece las propiedades que tendrá cada persona en este caso
    
    static printTotal() {
        console.log(Person.total);
    }

    printInfo(div) {
        div.insertAdjacentHTML("beforeend", `
        <div id="card_${this.id}" class="card text-bg-primary mb-3" style="max-width: 18rem;">  
        <div class="card-header">${this.name}</div>
        <div class="card-body">
            <h5 class="card-title">${this.email}</h5>
            <p class="card-text">${this.resume}.</p>
            <p class="card-text"><strong>${this.age}.</p>
        </div>
        </div>
        `)//aquí se le inserta a la card los datos del constructor, es decir, de la persona: id, nombre, email, resume, edad
    }
}

// let john=new Person();
// john.name="John Doe";
// john.age=40;
// john.email="jdoe@gmail.com";
// john.printInfo();

class Employee extends Person { //aquí es otra clase que representa a un empleado, extiende de Person porque un empleado también es una persona, aquí Employee adquiere las características de Person
    department = ""; //como es un empleado requiere dos nuevas propiedades: departamento y salario
    salary = 0.0;       //los cuales se inicializan aquí
    constructor(name, email, age, resume, department, salary) { //aquí se crea su respectvo constructor para CONSTRUIRLO, al empleado, que se le pone las propiedades de Person y se le adiciona las nuevas dos
        super(name, email, age, resume); //se le dice que jale esas 4 propiedades de la clase superior, es decir, de Person
        this.department = department;
        this.salary = salary;
    }
    calculateSalary() { //función que calcula el salario de cada empleado
        return ((this.salary * 30) * 1.16).toFixed(2);
    }
    printInfo(div) {
        super.printInfo(div);
        let cardBody = document.getElementById(`card_${this.id}`).getElementsByClassName("card-body")[0]; //identifica el cuerpo de la tarjeta indicada
        cardBody.insertAdjacentHTML("beforeend", `
            <p class="card-text">${this.department}</p>
            <p class="card-text text-end"><strong>${this.calculateSalary()}</strong></p>
        `); //aquí se le meten los nuevos datos a la card previamente generada de la Persona indicada
        // console.log(this.department, this.salary, this.calculateSalary());
    }
}

// let maritere = new Employee("Maritere", "maritere@gmail.com", 21, "Java developer", "IT", 1255.20);
// let dora = new Employee("Dora García", "dora.garcia@gmail.com", 21, "Fullstack developer", "IT", 1115.25);
// // let jane=new Person("Jane Doe", "jane.doe@gmail.com", 40, "Jane");
// // john.resume="otra cosa";
// // jane.printInfo();
// // john.printInfo();

// let vale = new Employee("Valeria", "valeria.arquietagmail.com", 21, "Fullstack java developer", "development", 1205.12);
// maritere.printInfo(divEmployees);
// dora.printInfo(divEmployees);
// vale.printInfo(divEmployees);
// Person.printTotal();

let employees = [];
employees.push(
    new Employee("Maritere", "maritere@gmail.com", 21, "Java developer", "IT", 1255.20),
    new Employee("Dora García", "dora.garcia@gmail.com", 21, "Fullstack developer", "IT", 1115.25),
    new Employee("Valeria", "valeria.arquieta@gmail.com", 21, "Fullstack java developer", "development", 1205.12),
    new Employee("Carolina", "caro@gmail.com", 21, "Fullstack java developer", "development", 1225.12)
); //introduce al array de employees unos cuantos empleados

employees.forEach(e => e.printInfo(divEmployees));