<?php

$text = $_POST['chat'];

//file_put_contents ("./chat.txt", $text."<br/>\r\n", FILE_APPEND) ; 

$result = file_get_contents("./chat.txt") ;

echo $result ;

?>