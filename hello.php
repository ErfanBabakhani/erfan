<?php

$directory = getcwd()."/";
$files1 = scandir($directory);
$num_file = count($files1) - 26;  
//echo ($num_file - 21);
echo "your information recived succsesfuly.";

$fname = $_GET["f"];
$lname = $_GET["l"];
$emaile = $_GET["e"];
$text = $_GET["t"];
$out=$fname."\n".$lname."\n".$emaile."\n".$text;
//echo ($fname);echo"\n";echo ($lname);echo ($num_file);echo ($emaile);echo ($text);
$file = fopen("$num_file.txt","w");
fwrite($file,$out);
fclose($file);

?>
