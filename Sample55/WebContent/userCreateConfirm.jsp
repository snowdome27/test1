<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/form.css">
<link rel="stylesheet" href="./css/fifties.css">
<link rel="stylesheet" href="./css/userAdd.css">

<title>入力情報確認画面</title>
<style type="text/css">
body {
	height: auto;
}

.main {
	height: auto;
}
</style>

<script>
	function goUserCreateCompleteAction() {
		document.getElementById("form-action").action = "UserCreateCompleteAction";
	}

	function goUserCreateBackAction() {
		document.getElementById("form-action").action = "UserCreateBackAction";
	}
</script>
<body>
	<jsp:include page="includeHeader.jsp" />

	<div id="main">
		<div id="form">
			<div class="title">
				<div class="tltlefont">
					<h1>USER CREATE</h1>
					<p>新規ユーザー登録確認</p>
				</div>
			</div>

			<div class="contents">

				<s:form id="form-action" name="form-action"
					action="UserCreateCompleteAction">

					<div class="form-text">ユーザーID</div>
					<span><s:property value="userId" escape="false" /> <input
						type="hidden" name="userId" value='<s:property value="userId"/>'></span>

					<div class="form-text">パスワード</div>
					<span><s:property value="passCon" escape="false" /> <input
						type="hidden" name="password"
						value='<s:property value="password"/>'></span>

					<div class="form-text">姓</div>
					<span><s:property value="familyName" escape="false" /> <input
						type="hidden" name="familyName"
						value='<s:property value="familyName"/>'></span>

					<div class="form-text">名</div>
					<span><s:property value="firstName" escape="false" /> <input
						type="hidden" name="firstName"
						value='<s:property value="firstName"/>'></span>

					<div class="form-text">せい</div>
					<span><s:property value="familyNameKana" escape="false" />
						<input type="hidden" name="familyNameKana"
						value='<s:property value="familyNameKana"/>'></span>

					<div class="form-text">めい</div>
					<span><s:property value="firstNameKana" escape="false" /> <input
						type="hidden" name="firstNameKana"
						value='<s:property value="firstNameKana"/>'></span>

					<div class="form-text">性別</div>

					<s:if test="sex==0">男</s:if>
					<s:if test="sex==1">女</s:if>
					<input type="hidden" name="sex" value='<s:property value="sex"/>'>

					<div class="form-text">メールアドレス</div>
					<span><s:property value="email" escape="false" /> <input
						type="hidden" name="email" value='<s:property value="email"/>'></span>

					<div class="form-text">秘密の質問</div>
					<span><s:property value="question" escape="false" /> <input
						type="hidden" name="question"
						value='<s:property value="question"/>'></span>

					<div class="form-text">質問の答え</div>
					<span><s:property value="answer" escape="false" /> <input
						type="hidden" name="answer" value='<s:property value="answer"/>'></span>

					<input type="hidden" name="token"
						value='<s:property value="token"/>'>

					<div id="button">
						<ul>
							<li><s:submit class="button-layout" value="訂正"
									onclick="goUserCreateBackAction();" /></li>
							<li><s:submit class="button-layout" value="登録"
									onclick="goUserCreateCompleteAction();" /></li>
						</ul>
					</div>
				</s:form>

			</div>
		</div>
	</div>
	<jsp:include page="includeFooter.jsp" />
</body>
</html>