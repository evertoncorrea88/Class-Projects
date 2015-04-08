<?php

if (isset($_POST['register'])) {
    setcookie($_POST['name'], $_POST['password'], time() + 60 * 60 * 24 * 365); //60*60*24*365 = 1 year
    echo 'You are registered.';
    
} else if (isset($_POST['login'])) {
    if (isset($_COOKIE[$_POST['name']])) {
        $pass = $_COOKIE[$_POST['name']];
        if ($pass == $_POST['password']) {
            echo 'You are logged in.';
        } else {
            echo 'Wrong password.';
        }
    } else {
        echo 'You are not registered.';
    }
}
?>
