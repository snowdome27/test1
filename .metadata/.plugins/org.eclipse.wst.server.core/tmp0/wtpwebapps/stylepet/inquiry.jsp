<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />


<style type="text/css">

.inquiry{
	background-color:white;
	boder:3px;

}

img{
	float:right;
	}
</style>

<title>お問い合わせフォーム</title>
</head>
<body>

	<header>
		<jsp:include page="header.jsp" />
	</header>

	<div class="inquiry">
		<s:form method="post" action="InquiryCompleteAction">
			<div class="a"></div>
			名前:<input type="text" name="name" size="" placeholder="名前を入力"/>
			<br>
			<br>
			お問い合わせの種類:	<select name="qtype" >
									<option value="company">会社について</option>
									<option value="product">製品について</option>
									<option value="support">アフターサポートについて</option>
								</select>
				<br>
				<br>

			お問い合わせ内容:
				<s:textarea name="body" rows="10" cols="40" placeholder="問い合わせ内容を入力"/>
				<br>
				<s:submit value="登録"/>
		</s:form>
	</div>

	<img src="./image/dog6.jpg" width="300px">
</body>
</html>