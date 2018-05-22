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

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>



<title>マイページ</title>

<style type="text/css">



header{
    width: 100%;
    height: 110px;
    background-color: black;
    color: white;
}

header h1{
    margin: 10px;
}

header li{
    float: right;
    margin: 20px;
    font-size: 20px;

}

div.abc{
	text-align: center;
	background-color:black;
	}

footer{
    width: 100%;
    height: 100px;
    background-color: black;
}

#main{

	clear:both;
	
	}

</style>


</head>
<body>
	<header>
		<jsp:include page="header.jsp"/>
	</header>
	
	<div id="main">
		<a href='<s:url action="BuyHistoryAction"/>'>購入履歴</a>
	</div>
	
	<div>
		<s:form action="MyPageAction">
			<input type="hidden"name="deleteFlg" value="1">
			<s:submit value="削除" method="delete"/>
		</s:form>
	</div>
	


</body>
</html>