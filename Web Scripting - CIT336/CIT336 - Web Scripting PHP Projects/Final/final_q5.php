<?php

$img = imagecreate(600, 600);
imagecolorallocate($img, 176, 196, 222);

$lineColor = imagecolorallocate($img, 0, 0, 0);

imageellipse($img, 300, 300, 200, 200, $lineColor);

imagearc($img, 75, 300, 250, 250, 270, 90, $lineColor);

imagearc($img, 300, 75, 250, 250, 0, 180, $lineColor);

imagearc($img, 525, 300, 250, 250, 90, 270, $lineColor);

imagearc($img, 300, 525, 250, 250, 180, 0, $lineColor);

imagefilledellipse($img, 300, 300, 100, 100, $lineColor);

header("Content-type: image/png");
imagepng($img);
imagedestroy($img);
?>