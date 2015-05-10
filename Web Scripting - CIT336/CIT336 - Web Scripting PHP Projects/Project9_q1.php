<?php

$randNumber = rand(5, 20);

$jump = 400 / $randNumber;

$myImage = imagecreate(400, 400);
$myGray = imagecolorallocate($myImage, 204, 204, 204);
$myGreen = imagecolorallocate($myImage, 0, 255, 0);
$myBlue = imagecolorallocate($myImage, 0, 0, 255);

$alternate = 0;

for ($i = 390; $i >= 0; $i = $i - $jump) {
    if ($alternate == 0) {
        imagefilledellipse($myImage, 200, 200, $i, $i, $myGreen);
        $alternate = 1;
    } else {
        imagefilledellipse($myImage, 200, 200, $i, $i, $myBlue);
        $alternate = 0;
    }
}

header("Content-type: image/png");
imagepng($myImage);
imagedestroy($myImage);
?>
