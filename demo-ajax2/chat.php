<?php

$text = $_POST['chat'];

file_put_contents ("./chat.txt", $text."\r\n", FILE_APPEND) ; 



?>