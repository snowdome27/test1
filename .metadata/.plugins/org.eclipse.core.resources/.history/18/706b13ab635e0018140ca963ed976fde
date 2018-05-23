<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>

  <script>
    $(document).ready(function(){
      $('.slider').bxSlider();
    });


      $(document).ready(function(){
          $('.abc').bxSlider({
              auto:true,
              mode:'fade',
              speed:1000,
              slideWidth:800
          });
      });
        </script>


<title>style.PET</title>

<style type="text/css">



header{
    width: 100%;
    height: 110px;
    background-color: black;
    color: white;
}

header h1{
    margin: 10px;
}

header li{
    float: right;
    margin: 20px;
    font-size: 20px;

}

div.abc{
	text-align: center;
	background-color:black;
	}

footer{
    width: 100%;
    height: 100px;
    background-color: black;
}

</style>


</head>

	<header>

            <h1>style.PET</h1>
            
            <ul>
            	<li><a href='<s:url action="InquiryAction"/>'>お問い合わせ</a></li>
            	<li><a href='<s:url action="logoutAction"/>'>ログアウト</a></li>
            	<li><a href='<s:url action="MyPageAction"/>'>マイページ</a></li>
                <li><a href='<s:url action="GoLoginAction" />'>ログイン</a></li>
                <li><a href='<s:url action="ProductAction"/>'>商品一覧</a></li>
                <li><a href='<s:url action="GoHomeAction"/>'>HOME</a></li>
                <li><s:property value="#session.userName"/> さん</li>
            </ul>

        </header>

</html>