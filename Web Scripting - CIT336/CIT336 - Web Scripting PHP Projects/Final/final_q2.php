<?php

$title = array(
    "Don Quixote",
    "A Tale Of Two Cities",
    "The Lord of the Rings",
    "Le Petit Prince",
    "Harry Potter and the Philosopher's Stone",
    "And Then There Were None",
    "Dream of the Red Chamber",
    "The Hobbit",
    "She: A History of Adventure",
    "The Lion, the Witch and the Wardrobe"
);

$author = array(
    "Miguel de Cervantes",
    "Charles Dickens",
    "J. R. R. Tolkien",
    "Antoine de Saint-Exupéry",
    "J. K. Rowling",
    "Agatha Christie",
    "Cao Xueqin",
    "J. R. R. Tolkien",
    "H. Rider Haggard",
    "C. S. Lewis"
);

$language = array(
    "Spanish",
    "English",
    "English",
    "French",
    "English",
    "English",
    "Chinese",
    "English",
    "English",
    "English"
);

if (isset($_POST['English'])) {
    $lang = "English";
} elseif (isset($_POST['Spanish'])) {
    $lang = "Spanish";
} elseif (isset($_POST['French'])) {
    $lang = "French";
} else {
    $lang = "Chinese";
}

print " <pre>" . str_pad("Title", 41, " ") . str_pad("Author", 41, " ") . "Language\n<hr></pre>";

for ($i = 0; $i < count($language); $i++) {
    if ($language[$i] == $lang) {
        print " <pre>" . str_pad($title[$i], 41, " ") . str_pad($author[$i], 41, " ") . $language[$i] . "\n</pre>";
    }
}