var a = document.getElementById("loginBtn");
var b = document.getElementById("registerBtn");
var x = document.getElementById("login");
var y = document.getElementById("register");


function login() {
    x.style.left = "4px";
    y.style.right = "-520px";
    a.className += " white-btn";
    b.className = "btn";
    x.style.opacity = 1;
    y.style.opacity = 0;
}

function register() {
    x.style.left = "-510px";
    y.style.right = "5px";
    a.className = "btn";
    b.className += " white-btn";
    x.style.opacity = 0;
    y.style.opacity = 1;
}

function myMenuFunction() {
    var i = document.getElementById("navMenu");
    if (i.className === "nav-menu") {
        i.className += " responsive";
    } else {
        i.className = "nav-menu";
    }
}
function Register() {
    var user = document.getElementById("userRegisterUsername").value;
    var pass = document.getElementById("userRegisterPassword").value;
    if (user == "" || pass == "") {
        alert("Please fill in all fields");
    }
    else {
        var myHeaders = new Headers();
        myHeaders.append("Content-Type", "application/json");

        var raw = JSON.stringify({
            "username": user,
            "password": pass,
            "role": "admin"
        });

        var requestOptions = {
            method: 'POST',
            headers: myHeaders,
            body: raw,
            redirect: 'follow'
        };

        fetch('http://10.49.36.57:8080/register', requestOptions)
            .then(response => response.json())
            .then(response => console.log(JSON.stringify(response)))
            .catch(error => console.log('error', error));
        
        window.location.href = "index.html";
        alert("User Registered");
    }



}
function Login() {
    var myHeaders = new Headers();
    myHeaders.append("Content-Type", "application/json");
    var user = document.getElementById("loginUsername").value;
    var pass = document.getElementById("loginContraseña").value;

    var raw = JSON.stringify({
        "username": user,
        "password": pass
    });

    var requestOptions = {
        method: 'POST',
        headers: myHeaders,
        body: raw,
        redirect: 'follow'
    };

   fetch("http://10.49.36.57:8080/login", requestOptions)
        .then(response => response.text())
        .then(result => console.log(result))
        .catch(error => console.log('error', error));

}
