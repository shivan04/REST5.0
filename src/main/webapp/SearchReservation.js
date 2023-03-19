


loadKlantenList()

function loadKlantenList() {
    let xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            let menuDataList = JSON.parse(this.responseText);
            let menuList = ' <ul class="w3-ul w3-card-4"> ';

            menuDataList.reverse();

            for (let index = 0; index < menuDataList.length; index++) {
                menuList +=
                    ' <li class="w3-bar"> ' +

                    ' <button id= ' + menuDataList[index].id + ' onclick="editMenu(this.id)" ' +
                    ' class="w3-bar-item w3-button w3-small w3-right">Edit</button> ' +

                    ' <button id=' + menuDataList[index].id + ' onclick="removeMenu(this.id)" ' +
                    ' class="w3-bar-item w3-button w3-small w3-right">Remove</button> ' +


                    ' <img src="pics/menu.png" class="w3-bar-item w3-circle w3-hide-small" style="width:85px"> ' +
                    ' <div class="w3-bar-item"> ' +
                    ' <span> Breakfast: ' +  menuDataList[index].klant_id  + ' </span><br> ' +
                    ' <span> Lunch: ' +  menuDataList[index].voornaam  + ' </span> <br>' +
                    ' <span> Dinner: ' +  menuDataList[index].achternaam  + ' </span> <br>' +
                    ' <span> Specials: ' +  menuDataList[index].special_requests  + ' </span> <br>' +
                    ' <span> Description: ' +  menuDataList[index].idNummer  + ' </span> ' +
                    ' </div> ';
            }
            menuList += "</ul>";
            document.getElementById("menuData").innerHTML = menuList;
        }
    };
    xhttp.open("GET", "http://localhost:8081/REST5_0_war/api/klant/add", true);
    xhttp.send();
}


//
// function deletePatient(klantId)
// {
//     let patient = {  "id" : klantId,
//         "voornaam" : document.getElementById("voornaam").value,
//         "achternaam" : document.getElementById("achternaam").value,
//         "adress" : document.getElementById("adress").value,
//         "district" : document.getElementById("district").value,
//         "identification" : {
//             "idNummer" : document.getElementById("idNummer").value,
//             "telefoonNummer" : document.getElementById("telefoonNummer").value}}
//     var xhttp = new XMLHttpRequest();
//     xhttp.open("DELETE", "http://localhost:8081/REST5_0_war/api/klant/remove", true);
//     xhttp.onreadystatechange = function() {
//         if (xhttp.readyState>3 && xhttp.status==200) {
//             displayKlantenTable(); }
//     };
//     xhttp.setRequestHeader("Content-Type", "application/json");
//     xhttp.send(JSON.stringify(patient));
// }
