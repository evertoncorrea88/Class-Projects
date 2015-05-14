<?php

//Connect to the local server
mysql_connect("localhost", "root", "") or die(mysql_error());

//Create the database if does not exist
mysql_query("CREATE DATABASE IF NOT EXISTS myDatabase");

//Use the database
mysql_query("USE myDatabase");

//Create the table if does not exist
mysql_query("CREATE TABLE IF NOT EXISTS myTable (book VARCHAR(40), author VARCHAR(40), language VARCHAR(40))");

//Check the number of rows in the table
$num_rows = mysql_num_rows(mysql_query("SELECT * FROM myTable"));

//If the table is empty load the file with the books
if ($num_rows == 0) {
    mysql_query("LOAD DATA LOCAL INFILE 'http://localhost/CIT336/Final/books.txt' INTO TABLE myTable")
            or die(mysql_error());
}

$book = $_POST["book"];
$author = $_POST["author"];
$language = $_POST["language"];

if (isset($_POST['add'])) {
    if (empty($book) || empty($author) || empty($language)) {
        echo 'You must enter all fields.';
    } else {
        $result = mysql_query("SELECT * FROM myTable where book='$book' AND author='$author' AND language='$language' ");

//      If there is no entry with the same valeu we can add the new entry
        if (mysql_num_rows($result) == 0) {
            mysql_query("INSERT INTO myTable (book , author , language) VALUES ('$book' , '$author' , '$language')");
            echo 'The entry was saved in the table.';
        } else {
            echo 'The entry already exists in the table.';
        }
    }
} else if (isset($_POST['list'])) {
    if (empty($language)) {
        echo 'You must enter the language.';
    } else {
        $table_content = mysql_query("SELECT * FROM myTable where language='$language' ORDER BY language");

        $rows = mysql_numrows($table_content);

        if ($rows > 0) {
            print " <pre>" . str_pad("Book", 41, " ") . str_pad("Author", 41, " ") . "Language\n<hr></pre>";

            for ($i = 0; $i < $rows; $i++) {
                $book = str_pad(mysql_result($table_content, $i, "book"), 41, " ");
                $author = str_pad(mysql_result($table_content, $i, "author"), 41, " ");
                $language = mysql_result($table_content, $i, "language");
                print " <pre>" . $book . $author . $language . "\n</pre>";
            }
        } else {
            echo 'There are no books in this language.';
        }
    }
}

mysql_close();
?>
