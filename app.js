const ctx = document.getElementById('myChart').getContext('2d')

const myChart = new Chart(ctx, {
    type: 'bar',
    data: {
        labels: [
            "val1",
            "val2",
            "val3",
            "val4",
        ],
        datasets: [
            {
                label: "chart label",
                data: [12, 14, 13, 19],
                backgroundColor: "rgba(153,205,1,0.6)",
            },
            {
                label: "chart label 2",
                data: [6, 4, 8, 20],
                backgroundColor: "rgba(155,153,10,0.6)",
            },
        ],
    },
});

async function getCountries() {
    const countries = await fetch("localhost:8080")
}