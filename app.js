async function getCountries() {
    var myHeaders = new Headers();
    myHeaders.append("Authorization", "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJqYWlybyIsImlhdCI6MTY4NTAxOTU5MywiZXhwIjoxNjg1ODgzNTkzfQ.g2lHY4o2GZcmmWX1v94rgXDCbUdf1-Y8HKzpQ8AjRdeAsTkha2BhKgwLjqMgRGgVHvBKbQA8r0eoHmWo5UHknw");
    myHeaders.append("Content-Type", "application/json");

    // var raw = JSON.stringify({
    //     "username": "jairo",
    //     "password": "jairo"
    // });

    var requestOptions = {
        method: 'GET',
        headers: myHeaders,
        redirect: 'follow'
    };
    return countries = await fetch("http://10.49.36.57:8080/api/countries", requestOptions)
        .then(response => response.json())
        .then((cou) => {return cou});
}

const c = getCountries();
console.log(c.then(function(result) {console.log(result[1].country)}))
c.then(function(result) {
    document.getElementById("CompCountry").innerHTML = ""
    for (var i = 0; i < result.length; i++){
        document.getElementById("CompCountry").innerHTML += "<option value='" + result[i].country + "' onClick=''>" + result[i].country + "</option>";
    }
});

async function getStatsSpain() {
    var myHeaders = new Headers();
    myHeaders.append("Authorization", "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJqYWlybyIsImlhdCI6MTY4NTAxOTU5MywiZXhwIjoxNjg1ODgzNTkzfQ.g2lHY4o2GZcmmWX1v94rgXDCbUdf1-Y8HKzpQ8AjRdeAsTkha2BhKgwLjqMgRGgVHvBKbQA8r0eoHmWo5UHknw");
    myHeaders.append("Content-Type", "application/json");

    // var raw = JSON.stringify({
    //     "username": "jairo",
    //     "password": "jairo"
    // });

    var requestOptions = {
        method: 'GET',
        headers: myHeaders,
        redirect: 'follow'
    };

    return spain = await fetch("http://10.49.36.57:8080/api/country/spain", requestOptions)
        .then(response => response.json())
        .then((spa) => {return spa});
}

var data
console.log(getStatsSpain().then(function (spa) {
    data = spa;
}))
console.log()



const ctx = document.getElementById('myChart').getContext('2d')

const myChart = new Chart(ctx, {
    type: 'bar',
    data: {
        labels: Object.keys(data),
        datasets: [
            {label: "spain",
            data : Object.values(data)}
        ],
    },
});