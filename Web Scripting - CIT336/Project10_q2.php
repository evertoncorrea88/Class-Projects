<?php

mysql_connect("localhost", "root", "") or die(mysql_error());

mysql_query("CREATE DATABASE myDatabase");

mysql_query("USE myDatabase");

mysql_query("CREATE TABLE myTable (firstname VARCHAR(20), " .
        "lastname VARCHAR(20), birthdate DATE, dependents INT, ssn VARCHAR(11))");

mysql_query("LOAD DATA LOCAL INFILE 'http://localhost/CIT336/names.txt' INTO TABLE myTable")
        or die(mysql_error());

$first_name = $_POST["firstname"];
$last_name = $_POST["lastname"];
$birthdate = $_POST["birthdate"];
$dependents = $_POST["dependents"];
$ssn = $_POST["ssn"];

$result = mysql_query("SELECT * FROM myTable where firstname='" . $first_name . "' AND lastname='" . $last_name . "'");

if (isset($_POST['add'])) {
    if (mysql_num_rows($result) == 0) {
        mysql_query("INSERT INTO myTable  (firstname , lastname , birthdate , dependents , ssn )
                      VALUES ('" . $first_name . "' , '" . $last_name . "' , '" . $birthdate . "' , '" . $dependents . "', '" . $ssn . "') ");
        echo 'The entry was saved in the data base';
    } else {
        echo 'The entry already exists in the data base';
    }
} else if (isset($_POST['remove'])) {
    if (mysql_num_rows($result) > 0) {
        mysql_query("DELETE FROM myTable WHERE firstname='" . $first_name . "' AND lastname='" . $last_name . "' ");
        echo 'The entry was deleted from the data base';
    } else {
        echo 'The entry does not exist in the data base';
    }
}

$table_content = mysql_query("SELECT * FROM myTable ORDER BY lastname");

$rows = mysql_numrows($table_content);

print "<pre>First Name     Last Name      Birth date        " .
        "Number of Dependents    Social Security Number\n</pre>";

for ($i = 0; $i < $rows; $i++) {
    $first_name = str_pad(mysql_result($table_content, $i, "firstname"), 15, " ");
    $last_name = str_pad(mysql_result($table_content, $i, "lastname"), 15, " ");
    $birthdate = str_pad(mysql_result($table_content, $i, "birthdate"), 25, " ");
    $dependents = str_pad(mysql_result($table_content, $i, "dependents"), 18, " ");
    $ssn = mysql_result($table_content, $i, "ssn");
    print " <pre>" . $first_name . $last_name . $birthdate . $dependents . $ssn . "\n</pre>";
}

mysql_query("DROP DATABASE myDatabase") or die(mysql_error());
mysql_close();
?>
