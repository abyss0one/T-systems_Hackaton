let nombrePais = document.getElementById("nombrePais");
let contenedorImagen = document.getElementById("div1");

const paises = [{"espanya":"images/españa.png"},{"japon":"images/japon.png"}];

/*Fetch*/



/*comparamos*/
nombrePais.textContent = "España";

let imagen = document.createElement("img");
imagen.src = "images/españa.png";
imagen.style.width = "300px";
imagen.style.width = "300px";
document.getElementById("div1").appendChild(imagen);