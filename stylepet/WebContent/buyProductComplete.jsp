<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>

<title>購入完了画面</title>

<style type="text/css">

	</style>

</head>
<body>
	<header>
		<jsp:include page="header.jsp" />
	</header>
	
	
	<h2><s:property value="#session.userName"/> さん</h2>

	<h3>ご購入ありがとうございました！！</h3>
	
	<p><a href='<s:url action="ProductAction"/>'>商品一覧に戻る</a></p>

	<br>
</body>
</html>