<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
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
<title>UserCreateConfirm画面</title>
<style type="text/css">


/* ========TAG LAYOUT======== */

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
		height: 500px;
		text-align: center;
}

#footer {
		width: 100%;
		height: 80px;
		background-color: black;
		clear:both;
}

</style>
</head>

<body>

	<header>
		<jsp:include page="header.jsp"/>
	</header>
	

	<div id="main">
		<div id="top">
			<p>ユーザー情報</p>
		</div>

		<div>
			<table>
					<s:form action="UserUpDateConfirmAction">
				
						<tr id="box">
							<td>
								<label>ログインID：</label>
							</td>
							<td>
								<s:property value="session.loginId" escape="false" />
							</td>
						</tr>
						<tr id="box">
							<td>
								<label>ユーザー名：</label>
							</td>
							<td>
								<s:property value="#session.userName" escape="false" />
							</td>
						</tr>
						<tr id="box">
							<td>
								<label>性別：</label>
							</td>
							<td>
								<s:property value="#session.userSex" escape="false"/>
							</td>
						</tr>
						<tr id="box">
							<td>
								<label>都道府県：</label>
							</td>
							<td>
								<s:property value="#session.userAddress1" escape="false"/>
							</td>
						</tr>
						<tr id="box">
							<td>
								<label>市町村：</label>
							</td>
							<td>
								<s:property value="#session.userAddress2" escape="false"/>
							</td>
						</tr>
						<tr id="box">
							<td>
								<label>マンション名・番地：</label>
							</td>
							<td>
								<s:property value="#session.userAddress3" escape="false"/>
							</td>
						</tr>
						<tr>
							<td>
								<label>電話番号：</label>
							</td>
							<td>
								<s:property value="#session.userTell" escape="false"/>
							</td>
						</tr>
						<s:submit value="変更" />
					</s:form>
			</table>
		</div>
	</div>

	<div id="footer">
		<div id="pr">
		</div>
	</div>


</body>
</html>