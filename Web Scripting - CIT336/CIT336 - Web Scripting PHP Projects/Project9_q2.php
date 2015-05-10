<?php

$file = fopen("inventory.txt", "r")or die("File does not exist in the current folder.");
$n = fgets($file);
for ($i = 0; $i < $n; $i++) {
    $names[$i] = fgets($file);
}
for ($i = 0; $i < $n; $i++) {
    $price[$i] = fgets($file);
}
for ($i = 0; $i < $n; $i++) {
    $avail[$i] = fgets($file);
}
fclose($file);

for ($i = 0; $i < $n; $i++) {
    $order[$i] = rand(1, 10);
    $avail[$i] = $avail[$i] - $order[$i];
    $total = $order[$i] * $price[$i];
    print($names[$i] . " " . $order[$i] . " " . $price[$i] . " " . $total . "<br>");
}

$file = fopen("inventory.txt", "w")or
        die("You do not have enough space or you have no permission to write here.");

fputs($file, $n);

for ($i = 0; $i < $n; $i++) {
    fputs($file, $names[$i]);
}
for ($i = 0; $i < $n; $i++) {
    fputs($file, $price[$i]);
}
for ($i = 0; $i < $n; $i++) {
    fputs($file, $avail[$i]."\r");
}
fclose($file);
print("OK it is finished. Look at the file inventory.txt on the server.");
?>
