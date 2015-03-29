<!--Question 1 (Exercise 2, lecture 7): Write a PHP script that generates a random number within the range of 1 to 10 for the variable $n and use a switch such that:
If the value of $n is 2 then the web page displays Pace web site such that when the user clicks on it the web page of the Pace university web site shows up.
If the value of $n is 4 then the web page displays Yahoo web site such that when the user clicks on it the web page of the Yahoo web site shows up.
If the value of $n is 6 then the web page displays Monster web site such that when the user clicks on it the web page of the Monster web site shows up.
If the value of $n is 8 then the web page displays Microsoft web site such that when the user clicks on it the web page of the Yahoo Hot Jobs web site shows up.
Finally if the value of $n is not 2, 4, 6, or 8 then the web page displays Google web site such that when the user clicks on it the web page of the Google web site shows up.-->

<?php

$n = rand(1, 10);

switch ($n) {
    case '2':
        print("<a href='http://www.pace.edu/'>Pace web site</a>");
        break;
    case '4':
        print("<a href='https://www.yahoo.com/'>Yahoo web site</a>");
        break;
    case '6':
        print("<a href='http://www.monster.com/'>Monster web site</a>");
        break;
    case '8':
        print("<a href='http://www.microsoft.com/en-us/default.aspx'>Microsoft web site</a>");
        break;

    default:
        print("<a href='http://www.google.com/'>Google web site</a>");
        break;
}
?>