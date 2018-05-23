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

<title>商品詳細画面</title>
</head>

<body>

	<header>
		<jsp:include page="header.jsp" />
	</header>
	
	<div>
		<p>商品内容</p>
		
			<s:form action="AddressConfirmation">
				<table>
					<tr>
						<td>
							<span>商品名</span>
						</td>
						<td>
							<s:property value="#session.itemName"/>
						</td>
					</tr>				
					<tr>
						<td>
							<img alt="" src='<s:property value="#session.imageFilePath"/>' width="400">
						</td>
					</tr>					
					<tr>
						<td>
							<span>値段</span>
						</td>
						<td>
							<span>&yen;</span>
							<s:property value="#session.itemPrice"/>
							
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
</body>
</html>