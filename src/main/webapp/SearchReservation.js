

// function displayKlantenTable(apiKlantData) {
//     var table = document.getElementById("breaktime-table");
//     fetch('http://localhost:8081/REST5_0_war/api/klant/list')
//         .then(response => response.json())
//         .then(data1 => {
//             for (var i = 0; i < apiKlantData.length; i++) {
//                 var row = table.insertRow(-1);
//                 var cell1 = row.insertCell(0);
//                 var cell2 = row.insertCell(1);
//                 var cell3 = row.insertCell(2);
//                 var cell4 = row.insertCell(3);
//                 var cell5 = row.insertCell(4);
//                 var cell6 = row.insertCell(5);
//                 var cell7 = row.insertCell(6);
//                 var cell8 = row.insertCell(7);
//                 cell1.innerHTML = apiKlantData[i].klantId;
//                 cell2.innerHTML = apiKlantData[i].achternaam;
//                 cell3.innerHTML = apiKlantData[i].voornaam;
//                 cell4.innerHTML = apiKlantData[i].adress;
//                 cell5.innerHTML = apiKlantData[i].district;
//                 cell6.innerHTML = apiKlantData[i].idNummer;
//                 cell7.innerHTML = apiKlantData[i].telefoonNummer;
//                 // cell8.innerHTML = apiKlantData[i].klantnummer;
//             }
//
//         })
//         .catch(error => console.error(error));
// }




function deletePatient(klantId)
{
    let patient = {  "id" : klantId,
        "voornaam" : document.getElementById("voornaam").value,
        "achternaam" : document.getElementById("achternaam").value,
        "adress" : document.getElementById("adress").value,
        "district" : document.getElementById("district").value,
        "identification" : {
            "idNummer" : document.getElementById("idNummer").value,
            "telefoonNummer" : document.getElementById("telefoonNummer").value}}
    var xhttp = new XMLHttpRequest();
    xhttp.open("DELETE", "http://localhost:8081/REST5_0_war/api/klant/remove", true);
    xhttp.onreadystatechange = function() {
        if (xhttp.readyState>3 && xhttp.status==200) {
            displayKlantenTable(); }
    };
    xhttp.setRequestHeader("Content-Type", "application/json");
    xhttp.send(JSON.stringify(patient));
}
