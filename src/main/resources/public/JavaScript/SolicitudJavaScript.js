
function calcularSeno() {
    let value = document.getElementById("inputSeno").value;
    const xhttp = new XMLHttpRequest();
    xhttp.onload = function() {
       console.log(this.status);
       if (this.status === 200) {
           document.getElementById("RespuestaSeno").textContent = this.responseText;
       }
    };
    xhttp.open("GET", "/Seno?angle=" + value);
    xhttp.send();
}


function calcularCoseno() {
        let value = document.getElementById("inputCoseno").value;
        const xhttp = new XMLHttpRequest();
        xhttp.onload = function() {
           console.log(this.status);
           if (this.status === 200) {
               document.getElementById("RespuestaCoseno").textContent = this.responseText;
           }
        }
        xhttp.open("GET", "/Coseno?angle="+value);
        xhttp.send();
}

function calcularPalindromo() {
        let value = document.getElementById("inputPalindromo").value;
        const xhttp = new XMLHttpRequest();
        xhttp.onload = function() {
           console.log(this.status);
           if (this.status === 200) {
               document.getElementById("RespuestaPalindromo").textContent = this.responseText;
           }
        };
        xhttp.open("GET", "/Palindromo?PalindromoOK="+value);
        xhttp.send();
}

function Magnitud() {
        let value1 = document.getElementById("numa").value;
        let value2 = document.getElementById("numb").value;
        const xhttp = new XMLHttpRequest();
        xhttp.onload = function() {
           console.log(this.status);
           if (this.status === 200) {
               document.getElementById("RespuestaMagnitud").textContent = this.responseText;
           }
        };
        xhttp.open("GET", "/Magnitud?a="+value1+"&b="+value2);
        xhttp.send();
}