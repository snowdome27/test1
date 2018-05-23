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
	boder:double 2px red;
	text-align:left;
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
		<p>購入履歴</p>
		</div>
		
			<div>
				<s:iterator value="#session.buyHistoryDTOList">
				
					<table>
						<tr>
							<td>
								<label>ご購入日</label>
							</td>
							<td>
								<label>商品名</label>
							</td>
							<td>
								<label>金額</label>
							</td>
							<td>
								<label>商品画像</label>
							</td>
						</tr>					
						<tr>
							<td>
								<s:property value="insertDate"/>
							</td>
							<td>
								<s:property value="itemName"/>
							</td>
							<td>
								<s:property value="itemPrice"/>
							</td>
							<td>
								<img src='<s:property value="imageFilePath"/>' width="100"/>
							</td>
						</tr>
					
					</table>
				
						
					
				</s:iterator>
			<br>
			</div>
			<s:form action="BuyHistoryAction">
							<input type="hidden"name="deleteFlg" value="1">
							<s:submit value="削除" method="delete"/>
			</s:form>
			<s:if test="#session.message!=null">
				<s:property value="session.messeage"/>
			</s:if>
			
		
		
			<br>
			<div>
				<span>商品一覧は</span>
				<a href='<s:url action="productAction" />'>こちら</a>
			</div>
			
			
			
			<div>
			<br>
			<br>
			</div>
			
		</div>
		
		

	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>