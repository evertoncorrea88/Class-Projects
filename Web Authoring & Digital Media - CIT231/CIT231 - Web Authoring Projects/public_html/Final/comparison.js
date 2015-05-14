var size = [];
var speed = [];
var time = [];

var fileSize;

function calculate() {
    initialize();

//    Ask the size of the file to the user
    fileSize = parseInt(prompt("Enter the size of the file (in Mb):"));

//    Test is the size entered is a positive number
    if (fileSize > 0) {
        var l = 0;
//        Fill the table with the value calculated
        while (l < 4) {
            time[l].innerHTML = fileSize / parseInt(speed[l].innerHTML);
            size[l].innerHTML = fileSize;
            l++;
        }
        document.getElementById("erro").innerHTML = "";
        document.getElementById("success").innerHTML = "Success! Values calculated with success!";

    } else {
//        Clean the table if the size is not correct
        for (var i = 0; i < 4; i++) {
            time[i].innerHTML = "";
            size[i].innerHTML = "";
        }
        document.getElementById("erro").innerHTML = "Error! Enter the file size again!";
        document.getElementById("success").innerHTML = "";
    }
}

function initialize() {
//    Initialize the values in the array
    var i = 0;
    do {
        size[i] = document.getElementById("usb" + i + "_size");
        speed[i] = document.getElementById("usb" + i + "_speed");
        time[i] = document.getElementById("usb" + i + "_time");
        i++;
    }
    while (i < 4);
}