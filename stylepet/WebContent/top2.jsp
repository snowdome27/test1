<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />


	<link rel="stylesheet" type="text/css" href="./style.css">
	
	
<style type="text/css">

header{
	margin:0px;
	width:400;
	height:80px;
	background-color:#A9A9A9;
	}
	
header li{
	float:right;
	margin:30px;
	list-style:non;
	}
	
.image{
	max-width: 50%;
	margin: 0 auto;
	background-color:#A9A9A9;
}

footer{
	margin-top:0px;
	padding-top:0;
	width:400;
	height:80px;
	background-color:#A9A9A9;
	}

	



</style>
	
</head>

<body>

	<header>
		<div>
			 <ul>
            	<li><a href='<s:url action="InquiryAction"/>'>INQUIRY</a></li>
                <li><a href='<s:url action="GoLoginAction" />'>LOGIN</a></li>
                <li><a href='<s:url action="ProductAction"/>'>PRODUCT</a></li>
                <li><a href='<s:url action="GoHomeAction"/>'>HOME</a></li>
            </ul>
		</div>
	</header>
	
	<div class="main">
	
		<div class="image">
			<img alt="" src="./image/home.jpg" width="">
		</div>

		
	</div>
	<footer>
		<p></p>
	</footer>








</body>
</html>