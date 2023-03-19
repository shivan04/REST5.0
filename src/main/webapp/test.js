function loadPatientList() {
    let xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            let patientDataList = JSON.parse(this.responseText);
            let patientList = ' <ul class="w3-ul w3-card-4"> ';

            patientDataList.reverse();

            for (let index = 0; index < patientDataList.length; index++) {
                patientList +=
                    ' <li class="w3-bar"> ' +

                    ' <button id= ' + patientDataList[index].klantId + ' onclick="editPatient(this.klantId)" ' +
                    ' class="w3-bar-item w3-button w3-small w3-right">Edit</button> ' +

                    ' <button id=' + patientDataList[index].klantId + ' onclick="removePatient(this.klantId)" ' +
                    ' class="w3-bar-item w3-button w3-small w3-right">Remove</button> ' +


                    ' <img src="https://cdn.iconscout.com/icon/free/png-256/health-1659502-1410024.png" class="w3-bar-item w3-circle w3-hide-small" style="width:85px"> ' +
                    ' <div class="w3-bar-item"> ' +
                    ' <span class="w3-large"> Firstname: ' +  patientDataList[index].achternaam  + ' </span><br> ' +
                    ' <span> Lastname: ' +  patientDataList[index].voornaam  + ' </span> <br>' +
                    // ' <span> Address: ' +  patientDataList[index].adress  + ' </span> <br>' +
                    // ' <span> Contactnumber: ' +  patientDataList[index].  + ' </span> <br> ' +
                    // ' <span> Id number: ' +  patientDataList[index].identification.number  + ' </span> <br> ' +
                    // ' <span> Sex: ' +  patientDataList[index].identification.sex  + ' </span> <br> ' +
                    ' </div> ';
            }
            patientList += "</ul>";
            document.getElementById("patientData").innerHTML = patientList;
        }
    };
    xhttp.open("GET", "http://localhost:8081/REST5_0_war/api/klant/list", true);
    xhttp.send();
}


function updatePatient()
{
    let patient = {  "klantId" : document.getElementById("klantId").value,
        "voornaam" : document.getElementById("voornaam").value,
        "achternaam" : document.getElementById("achternaam").value,
        // "firstname" : document.getElementById("firstName").value,
        // "lastname" : document.getElementById("lastName").value,
        // "identification" : {
        //     "number" : document.getElementById("idNumber").value,
        //     "sex" : document.getElementById("sex").value}
            }
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.open("PUT", "http://localhost:8081/REST5_0_war/api/klant/update", true);
    xmlhttp.onreadystatechange = function() {
        if (xmlhttp.readyState>3 && xmlhttp.status==200) {
            loadPatientList();

            document.getElementById("btnSavePatient").innerHTML = "Add Patient";}
        document.getElementById("idNumber").disabled = false;
    };
    xmlhttp.setRequestHeader("Content-Type", "application/json");
    xmlhttp.send(JSON.stringify(patient));
}

