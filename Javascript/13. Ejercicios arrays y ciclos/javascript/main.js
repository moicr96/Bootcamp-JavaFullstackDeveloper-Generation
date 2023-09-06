let libros = ["Sofia","David","Juan"];

// divAlert.innerHTML+="<li>"+libros[0]+"</li>";
// divAlert.innerHTML+="<li>"+libros[1]+"</li>";
// divAlert.innerHTML+="<li>"+libros[2]+"</li>";

divAlert.innerHTML+="Parte 1<ol><li>"+libros[0]+"</li>"
+"<li>"+libros[1]+"</li>"
+"<li>"+libros[2]+"</li></ol><br>"   

libros.push("Sara");
libros.push("Agustin");
libros.shift("Sofia");

divAlert.innerHTML+="Parte 2<li>"+libros[0]+"</li>";
divAlert.innerHTML+="<li>"+libros[1]+"</li>";
divAlert.innerHTML+="<li>"+libros[2]+"</li>";
divAlert.innerHTML+="<li>"+libros[3]+"</li> <br>";

libros.push("Elena");
libros.splice(1, 0, 'Renata');

divAlert.innerHTML+="Parte 3<li>"+libros[0]+"</li>";
divAlert.innerHTML+="<li>"+libros[1]+"</li>";
divAlert.innerHTML+="<li>"+libros[2]+"</li>";
divAlert.innerHTML+="<li>"+libros[3]+"</li>";
divAlert.innerHTML+="<li>"+libros[4]+"</li>";