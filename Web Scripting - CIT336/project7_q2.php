<!--Question 2: Write a php program to implement the following steps:
1. Generate a random integer in the range 1 to 13, inclusive for variable $m.
2. If $m is an even number increment it to make it odd. Hints: Use modulo operation: % to find whether or not $m is even.
3. Make: $n = $m/2.
4. Display the word: Hello in $n lines from the font-size: 1 to $n.
5. Display the word: Hello in $n + 1 lines from the font-size: $n + 1 down to 1.-->



<?php
$m = rand(1, 13);

if ($m % 2 != 0) {
    $m++;
}

$n = $m / 2;

for ($i = 1; $i <= $n; $i++) {
    $f = $i * 5;
    print "<span style=\"font-size: $f;\">Teste</span><br>";
}

for ($i = $n + 1; $i >= 1; $i--) {
    $f = $i * 5;
    print "<span style=\"font-size: $f;\">Teste</span><br>";
}
?>