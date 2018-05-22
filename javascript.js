for(var star=1;star<=5;star++){
    document.write("★");
}

document.write("<br>");




for(var i=1; i<=6; i++){
  
    if(i%2==0){
       document.write("z")
       }document.write
}

document.write("<br>");



for(var a=1; a<=6;a++){
    document.write(a);
}

document.write("<br>");

for(var b=0;b<=6;b++){
  if(b<=2){
    document.write("a");
} else if(b==3){
    document.write("<br>");
}
    else if(b<=6){
    document.write("b");
}
}
document.write("<br>");

for(var g=0;g<2;g++){
    for(var h=0;h<3;h++){
        document.write("★");
    }document.write("<br>");
 }

document.write("<br");

for(var siro=0;siro<=2;siro++){
    for(var m=0;m<5;m++){
        document.write("☆");
    }document.write("<br>");
}


for(var w=0;w<4;w++){
    for(var x=0;x<=4;x++){
        document.write("★");
    }document.write("<br>");
}
document.write("<br>");

for(var t=0;t<4;t++){
    for(var u=0;u<=3;u++){
        document.write("★");
    }document.write("<br>");
}
document.write("<br>");

for(var y=1;y<=3;y++){   
    for(var z=1;z<=3;z++){
    if(z%2==0){
        document.write("☆");
    }else {
        document.write("★");
    }
        }document.write("<br>");
    }

document.write("<br>");


for(var s=0;s<4;s++){
    for(var y=1;y<=5;y++){
        if(y%2==0){
            document.write("☆");
        }else{document.write("★")}
    }document.write("<br>");
}

document.write("<br>");



for(var m=1;m<=3;m++){
    for(var tt=1;tt<=m;tt++){
        document.write("★");
    }document.write("<br>");
}


document.write("<br>");

function menseki(hankei){
return"面積は"+hankei*hankei*3.14+"cmです。";
}

document.write(menseki(5));
document.write(menseki(7));
document.write(menseki(10));

document.write("<br>");


function goukei(o,k){
return "合計金額は"+o*500+k*200+"です。";
}

document.write("Aグループの"+goukei(2,4));
document.write("Bグループの"+goukei(1,5));
document.write("Cグループの"+goukei(3,7));

document.write("<br>");
