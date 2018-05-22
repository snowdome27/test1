<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- ホーム画面に10秒後遷移 content="秒数" -->
<meta http-equiv="refresh" content="10;URL=GoHomeAction">

<title>宛先情報登録完了</title>


<link rel="stylesheet" href="./css/fifties.css">
<link rel="stylesheet" href="./css/complete.css">

</head>

<body>
	<jsp:include page="includeHeader.jsp" />
	<div class="main">
		<div class="form">
			<div class="form-heading">
				<h2>【宛先情報登録完了】</h2>
			</div>

				<h2>宛先情報登録が完了しました。</h2>
				決済画面へ戻るには<a href='<s:url action="BuyItemConfirmAction"/>'>こちら</a>
				<p>10秒後に自動的にホーム画面へ遷移します。</p>
				<p>ジャンプしない場合は、以下のリンクをクリックしてください。</p>
				<a href='<s:url action="GoHomeAction" />'>ホーム画面へ</a>

			</div>
		</div>
	<jsp:include page="includeFooter.jsp" />
</body>
</html>