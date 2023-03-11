let url = "http://localhost:8081/REST5_0_war/api/klant"


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
    xmlhttp.onreadystatechange = function() {
        if (xmlhttp.readyState>3 && xmlhttp.status===204) { clearInputFields();}
    };
    xmlhttp.setRequestHeader('Content-Type', 'application/json');
    xmlhttp.send(JSON.stringify(klanten));
}
function clearInputFields() {
    document.getElementById("achternaam").value = "";
    document.getElementById("voornaam").value = "";
    document.getElementById("idNummer").value = "";
    document.getElementById("adress").value = "";
    document.getElementById("telefoonNummer").value = "";
}