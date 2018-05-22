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

.list-item{
	  text-align:none;
	boder:;

}
	
	}
</style>

<title>商品一覧</title>
</head>
<body>
	<header>
		<jsp:include page="header.jsp" />
	</header>

	<div>
		<s:iterator value="#session.ProductDTOList">
			<s:form action="ProductDateAction">
				<br>
				<a href='<s:url action="ProductDateAction">
							<s:param name="itemName" value="%{itemName}"/>
							<s:param name="imageFilePath" value="%{imageFilePath}" />
										
							<s:param name="imageFileName" value="%{imageFileName}" />
							<s:param name="itemPrice" value="%{itemPrice}"/>			
						</s:url>'>
					<img src='<s:property value="%{imageFilePath}"/>' width="200">
				</a>
				<br>
				
				<p><s:property value="itemName"/></p>
				<s:property value="itemPrice"/>
			
			</s:form>
		</s:iterator>
	</div>

  
 

</body>
</html>