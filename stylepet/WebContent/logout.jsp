<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">

<title>LoginError</title>

</head>
<body>

	<header>
		<jsp:include page="header.jsp" />
	</header>
	
	<h3>ログアウトしました。</h3>

	<a href='<s:url action="GoHomeAction"/>'>HOMEに戻る</a>


</body>
</html>