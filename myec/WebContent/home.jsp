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

 	<link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
 	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
 	<script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>

 	<script>
 	  $(document).ready(function(){
 	    $('slider').bxSlider();
 	  });
	 </script>

<!-- ファビコン -->
	<link rel="shortcut icon" href="http://www.iconj.com/icon.php?pid=eh53o8d8gl" type="image/x-icon" />
	<link rel="shortcut icon" href="http://www.iconj.com/gif_icon.php?pid=eh53o8d8gl" type="image/gif" />
	<!-- end of iconj.com favicon code -->



<title>Home画面</title>
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


<!-- メイン部分 -->
<div id="main">
	<div id="home-main">

 		<div class="slider top-image">
   	 		<div><img src="./image/donut.jpg"></div>
    		<div><img src="./image/top2.jpg"></div>
    		<div><img src="./image/top3.jpg"></div>
   			<div><img src="./image/top4.jpg"></div>
  		</div>

		<div class="menu-push"></div>

	<!-- 更新情報（news.htmlに内容を記述してインラインフレームで表示） -->
	<div class="news-box">
		<h3>UPDATE NEWS</h3>
		<iframe src="news.html" width="60%" height="120" style="border:1px solid #a1885d;" scrolling="no"></iframe>
	</div>

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

<script type="text/javascript" src="./script/script.js"></script>

</body>
</html>