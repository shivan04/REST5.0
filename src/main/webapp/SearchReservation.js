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

                    ' <button id= ' + patientDataList[index].id + ' onclick="editPatient(this.id)" ' +
                    ' class="w3-bar-item w3-button w3-small w3-right">Edit</button> ' +

                    ' <button id=' + patientDataList[index].id + ' onclick="removePatient(this.id)" ' +
                    ' class="w3-bar-item w3-button w3-small w3-right">Remove</button> ' +


                    ' <img src="https://cdn.iconscout.com/icon/free/png-256/health-1659502-1410024.png" class="w3-bar-item w3-circle w3-hide-small" style="width:85px"> ' +
                    ' <div class="w3-bar-item"> ' +
                    ' <span class="w3-large"> Firstname: ' +  patientDataList[index].firstname  + ' </span><br> ' +
                    // ' <span> Lastname: ' +  patientDataList[index].lastname  + ' </span> <br>' +
                    // ' <span> Address: ' +  patientDataList[index].adress  + ' </span> <br>' +
                    // ' <span> Contactnumber: ' +  patientDataList[index].contactnumber  + ' </span> <br> ' +
                    // ' <span> Id number: ' +  patientDataList[index].identification.number  + ' </span> <br> ' +
                    // ' <span> Sex: ' +  patientDataList[index].identification.sex  + ' </span> <br> ' +
                    ' </div> ';
            }
            patientList += "</ul>";
            document.getElementById("patientData").innerHTML = patientList;
        }
    };
    xhttp.open("GET", "/healthcentremanagement-front-end/api/patient/list", true);
    xhttp.send();
}