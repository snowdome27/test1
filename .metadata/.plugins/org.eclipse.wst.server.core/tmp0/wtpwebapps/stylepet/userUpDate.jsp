<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />

<title>新規ユーザー登録画面</title>
<style type="text/css">

body {
	margin:0;
	padding:0;
	line-height:1.6;
	letter-spacing:1px;
	font-family:Verdana, Helvetica, sans-serif;
	font-size:12px;
	color:#333;
	background:#fff;
}

table {
	text-align:center;
	margin:0 auto;
}
/* ========ID LAYOUT======== */

#top {
	width:780px;
	margin:30px auto;
	border:1px solid #333;
}

#header {
	width: 100%;
	height: 80px;
	background-color: black;
}

#main {
	width: 100%;
	height:650px;
	text-align: center;
}

#footer {
	width: 100%;
	height: 0px;
	background-color: black;
	clear:both;
}

</style>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>

	<div id="main">
		<div id="top">
			<p>登録内容変更</p>
		</div>
		<div>
			<table>
			<s:form action="">
				<tr>
					<td>
						<label>ユーザー名 (氏名):</label>
					</td>
					<td>
						<input type="text" name="userName" value="" />
					</td>
				</tr>
				<tr>
					<td>
						<label>性別：</label>
					</td>
					<td>
						<input type="radio" name="userSex" value="男" checked="checked">男
						<input type="radio" name="userSex" value="女">女
					</td>
				</tr>
				<tr>
					<td>
						<br>
					</td>
				</tr>
				<tr>
					<td>
						<label>住所</label>
					</td>
				</tr>
				<tr>
					<td>
						<label>都道府県：</label>
					</td>
					<td>
						<input type="text" name="userAddress1" value="" />
					</td>
				</tr>
				<tr>
					<td>
						<label>市町村：</label>
					</td>
					<td>
						<input type="text" name="userAddress2" value="" />
					</td>
				</tr>
				<tr>
					<td>
						<label>番地、マンション名：</label>
					</td>
					<td>
						<input type="text" name="userAddress3" value="" />
					</td>
				</tr>
				<tr>
					<td>
						<br>
					</td>
				</tr>
				<tr>
					<td>
						<label>電話番号：</label>
					</td>
					<td>
						<input type="text" name="userTell" value="" />
					</td>
				</tr>
				<tr>
					<td>
						<br>
					</td>
				</tr>
				<s:submit value="登録"/>
			</s:form>
			</table>
			<div>
				<span>前画面に戻る場合は</span>
				<a href='<s:url action="GoLoginAction" />'>こちら</a>
			</div>
			<div>
			<br>
			<br>
			</div>
		</div>
</div>

	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>