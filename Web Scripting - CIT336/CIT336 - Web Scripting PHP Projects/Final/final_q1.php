<?php

print("<html>
    <head>
        <title>Temperature</title>
    </head>
    <body>
        <table border='1'> 
            <tr>
                <th>Fahrenheit</th>
                <th>Celsius</th>
            </tr>");

for ($f = -100; $f <= 100; $f += 10) {

    $c = number_format((10 * ($f - 32) / 18), 2);

    print("<tr>
                <td>$f</td>
                <td>$c</td>
            </tr>");
}

print("</table> </body> </html>");
?>