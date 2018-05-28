<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />

<!-- CSSとSCRIPTの読み込み -->
	<link rel="stylesheet" type="text/css" href="./css/basis_style.css">
	<link rel="stylesheet" type="text/css" href="./css/table_style.css">

<!-- ファビコン -->
	<link rel="shortcut icon" href="http://www.iconj.com/icon.php?pid=eh53o8d8gl" type="image/x-icon" />
	<link rel="shortcut icon" href="http://www.iconj.com/gif_icon.php?pid=eh53o8d8gl" type="image/gif" />
	<!-- end of iconj.com favicon code -->

<title>BuyItem画面</title>
</head>


<body>

<!-- フッター固定の為のdiv(container) -->
<div class="container">

<!-- ヘッダー部分 -->
<header>
	<div id="header">
		<div class="header-logo">ONLINE SHOP</div>

		<div class="top-menu">

			<div class="left-list">
			<ul class="top-li">
			<li><a href='<s:url action="GoHomeAction"/>'>TOP</a></li>
			<li><a href='<s:url action="ProductPageAction"/>'>PRODUCT</a></li>
			<li><a href='<s:url action="UserCreateAction"/>'>SIGNUP</a></li>
			</ul>
			</div>

			<div class="right-list">
			<ul>
			<li><a href='<s:url action="GoLoginAction"/>'>LOGIN</a></li>
			<li><a href='<s:url action="MyPageAction"/>'>MYPAGE</a></li>
			<li><a href='<s:url action="LogoutAction"/>'>LOGOUT</a></li>
			<li><a href='<s:url action="InquiryAction"/>'>MAIL</a></li>
			</ul>
			</div>
		</div>

	</div>
</header>

<div class="main-push"></div>

<!-- メイン部分 -->
<div id="main">
	<h3>BUY ITEM</h3>

	<div class="push"></div>

	<img src="./image/cupcake.png" style="width:40px;">

	<div class="icon-push"></div>

	<div class="main-content">
		<!-- カテゴリ表示機能 -->
		<s:form action="CategorySearchAction">
		<tr>
		<td>
			<select name="sortCategory" onchange="submit(this.form)">
			<option value="0" selected="selected">カテゴリ選択</option>
			<option value="cake">ケーキ</option>
			<option value="bake">焼き菓子</option>
			<option value="wagashi">和菓子</option>
			</select>
		</td>
		</tr>
		</s:form>

		<p><a href='<s:url action="ProductPageAction"/>'>検索のリセット</a></p>

		<!-- 商品検索機能 -->
		<s:form action="SearchAction">
		<tr>
		<td><s:textfield name="searchWord" value=""/></td>
		<td><s:submit class="button" value="検索"/></td>
		</tr>
		</s:form>

		<!-- エラーーメッセージ -->
		<s:if test="searchMessage != null ">
		<p class="error-message"><s:property value="searchMessage" escape="false"/></p>
		</s:if>

		<div class="push"></div>

		<!-- 商品テーブル -->
		<div class="item-table">

		<table>
		<s:form action="BuyItemAction">


		<!-- カテゴリソート① -->
		<s:if test="session.sortCategory=='cake'">
		<s:iterator value="#session.buyItemDTOList">
			<dl class="dl-list">
				<dd class="dd-list">

				<div class="item_description">
				<a href="#">

				<span class="remark"><s:property value="item_description"/></span>
				<img class="image" style="width:150px; height:100px;" src="<s:property value='image_file_path'/>" >

				<br><br>

				<s:property value="itemName" /><br>

				<span>値段:</span>
				<s:property value="itemPrice" /><span>円</span><br>

				<span>在庫:</span>
				<s:if test="item_stock>0">
					<s:property value="item_stock"/>
				</s:if>
				<s:else>
					<span class="error-message">品切れ</span>
				</s:else>

				</a>
				</div>

				</dd>
			</dl>
		</s:iterator>
		</s:if>

		<!-- カテゴリソート② -->
			<s:elseif test="session.sortCategory=='bake'">
		<s:iterator value="#session.buyItemDTOList">
			<dl class="dl-list">
				<dd class="dd-list">

				<div class="item_description">
				<a href="#">

				<span class="remark"><s:property value="item_description"/></span>
				<img class="image" style="width:150px; height:100px;" src="<s:property value='image_file_path'/>" >

				<br><br>

				<s:property value="itemName" /><br>

				<span>値段:</span>
				<s:property value="itemPrice" /><span>円</span><br>

				<span>在庫:</span>
				<s:if test="item_stock>0">
					<s:property value="item_stock"/>
				</s:if>
				<s:else>
					<span class="error-message">品切れ</span>
				</s:else>

				</a>
				</div>

				</dd>
			</dl>
		</s:iterator>
			</s:elseif>


		<!-- カテゴリソート③ -->
		<s:elseif test="session.sortCategory=='wagashi'">
		<s:iterator value="#session.buyItemDTOList">
			<dl class="dl-list">
				<dd class="dd-list">

				<div class="item_description">
				<a href="#">

				<span class="remark"><s:property value="item_description"/></span>
				<img class="image" style="width:150px; height:100px;" src="<s:property value='image_file_path'/>" >

				<br><br>

				<s:property value="itemName" /><br>

				<span>値段:</span>
				<s:property value="itemPrice" /><span>円</span><br>

				<span>在庫:</span>
				<s:if test="item_stock>0">
					<s:property value="item_stock"/>
				</s:if>
				<s:else>
					<span class="error-message">品切れ</span>
				</s:else>

				</a>
				</div>

				</dd>
			</dl>
		</s:iterator>
		</s:elseif>


		<!-- カテゴリソートしない時の表示 -->
		<s:else>
		<s:iterator value="#session.buyItemDTOList">

			<dl class="dl-list">
				<dd class="dd-list">

				<div class="item_description">
				<a href="#">

				<span class="remark"><s:property value="item_description"/></span>
				<img class="image" style="width:150px; height:100px;" src="<s:property value='image_file_path'/>" >

				<br><br>

				<s:property value="itemName" /><br>

				<span>値段:</span>
				<s:property value="itemPrice" /><span>円</span><br>

				<span>在庫:</span>
				<s:if test="item_stock>0">
					<s:property value="item_stock"/>
				</s:if>
				<s:else>
					<span class="error-message">品切れ</span>
				</s:else>

				</a>
				</div>

				</dd>
			</dl>

		</s:iterator>
		</s:else>

		<!-- 繰り返し処理ここまで -->

		<div class="clear"></div>

		</s:form>
		</table>
		</div>

	</div>

	<div class="buyItemDown-push"></div>

	<div id="text-link">
		<p><a href='<s:url action="GoLoginAction" />'>商品を購入する場合はこちらからログインしてください。</a></p>
		<p><a href='<s:url action="GoHomeAction" />'>Homeへ戻る場合はこちら</a></p>
	</div>

</div>

<!-- メインとフッターの間隔調整用div -->
<div class="footer-push"></div>

<!-- フッター部分 -->
<footer>

	<div class="footer-height"></div>

	<div class="footer-message">
		Copyright©2018 SWEETOPIA. All Rights Reserved.
	</div>

</footer>
</div>


</body>
</html>