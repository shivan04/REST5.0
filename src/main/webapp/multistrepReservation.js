let url = "http://localhost:8081/REST5_0_war/api/klant"
let url1 = "http://localhost:8081/REST5_0_war/api/reservation"
let url2 = "http://localhost:8081/REST5_0_war/api/location"


function addKlant() {

    let klanten = {
        "achternaam": document.getElementById("achternaam").value,
        "voornaam": document.getElementById("voornaam").value,
        "idNummer": document.getElementById("idNummer").value,
        "adress": document.getElementById("adress").value,
        "telefoonNummer": document.getElementById("telefoonNummer").value
    };
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.open('POST', url + '/add', true);
    xmlhttp.onreadystatechange = function () {
        if (xmlhttp.readyState > 3 && xmlhttp.status === 204) {
            clearInputFields();
        }
    };
    xmlhttp.setRequestHeader('Content-Type', 'application/json');
    xmlhttp.send(JSON.stringify(klanten));
}

function addReservation() {

    let reservation = {
        // "klant_id": document.getElementById("klant_id").value,
        // "Location_id": document.getElementById("restaurant").value,
        // "Table_id": document.getElementById("table").value,
        "reservation_date": document.getElementById("reservationDate").value,
        "reservation_time": document.getElementById("reservationTime").value,
        "number_of_guest": document.getElementById("numberOfGuest").value,
        "special_requests": document.getElementById("specialRequest").value,

    };
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.open('POST', url1 + '/add', true);
    xmlhttp.onreadystatechange = function () {
        if (xmlhttp.readyState > 3 && xmlhttp.status === 204) {
            clearInputFields();
        }
    };
    xmlhttp.setRequestHeader('Content-Type', 'application/json');
    xmlhttp.send(JSON.stringify(reservation));
}



function clearInputFields() {
    document.getElementById("achternaam").value = "";
    document.getElementById("voornaam").value = "";
    document.getElementById("idNummer").value = "";
    document.getElementById("adress").value = "";
    document.getElementById("telefoonNummer").value = "";


}

fetch('http://localhost:8081/REST5_0_war/api/location/list')
    .then(response => response.json())
    .then(data => {
        const dropdown = document.getElementById('my-dropdown');
        data.forEach(item => {
            const option = document.createElement('option');
            option.text = item.naam;
            option.value = item.location_id;
            dropdown.add(option);
        });
    });