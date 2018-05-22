<?php

function totalPrice($fruitprice,$tax=1.08,$haiso=350){
    return($fruitprice*$tax)+$haiso;
}

$mikan=totalprice(300);
echo $mikan."<br>";
$rigo=totalprice(450);
echo$ringo."<br>";
$ichigo=totalprice(550);
echo $ichigo.("<br>");
$nashi=tptalprice(350);
echo $nashi;

?>