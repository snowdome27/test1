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

<title>購入確認</title>
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
	<header>
		<jsp:include page="header.jsp" />
	</header>
	
	<div id="header">
		<div id="pr">
		</div>
	</div>

	<div id="main">
		
		<div id="top">
		<p>宛先確認</p>
		</div>
		<div>
			<s:if test="errorMassage != ''">
				<h3><s:property value="errorMassage" escape="false" /></h3>
			</s:if>
			<div>
			<s:form action="BuyProductCompleteAction">
			
				<table>
					<tr>
						<td>
							<label>ユーザー名 (氏名):</label>
						</td>
						<td>
							<s:property value="#session.userName" escape="false" />
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
						<td>
							<s:property value="#session.userAddress" escape="false"/>
						</td>
					</tr>
					<tr>
						<td>
							<label>都道府県：</label>
						</td>
						<td>
							<s:property value="#session.userAddress1" escape="false"/>
						</td>
					</tr>
					<tr>
						<td>
							<label>市町村：</label>
						</td>
						<td>
							<s:property value="#session.userAddress2" escape="false"/>
						</td>
					</tr>
					<tr>
						<td>
							<label>番地、マンション名：</label>
						</td>
						<td>
							<s:property value="#session.userAddress3" escape="false"/>
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
							<s:property value="#session.userTell" escape="false"/>
						</td>
					</tr>
					<tr>
						<td>
							<br>
						</td>
					</tr>
				</table>
				
				<div id="top">
					<p>商品確認</p>
				</div>
				<table>
					<tr>
						<td>
							<s:property value="#session.itemName"/>
						</td>
					</tr>
					<tr>
						<td>
							<img src='<s:property value="#session.imageFilePath"/>' width="300"/>
						</td>
					</tr>
					<tr>
						<td>
							<span>&yen;</span><s:property value="#session.itemPrice"/>
						</td>
					</tr>
					<tr>
						<td>
							<s:submit value="購入"/>
						</td>
					</tr>
				</table>
			</s:form>
		</div>
		
			
			<div>
				<span>前画面に戻る場合は</span>
				<a href='<s:url action="productAction" />'>こちら</a>
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