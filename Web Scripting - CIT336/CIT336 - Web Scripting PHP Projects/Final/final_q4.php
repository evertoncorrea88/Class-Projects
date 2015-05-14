<?php

$cookie_name = "count";
$cookie_value = 1;

//If the cookie exists, increment the counter
if (isset($_COOKIE[$cookie_name])) {
    $cookie_value = $_COOKIE[$cookie_name];
    $cookie_value++;
}
setcookie($cookie_name, $cookie_value, time() + (86400 * 30)); // 86400 = 1 day

print("Number of views: $cookie_value");
?>