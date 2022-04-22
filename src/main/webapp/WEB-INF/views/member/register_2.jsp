<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"/> 
<%
  request.setCharacterEncoding("UTF-8");
%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지_2단계(/member/register_2.jsp)</title>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script>
	
	// 인증번호 생성 및 메일&인증번호 컨트롤러로 전송
	function sendAuth() {
		authCode = String(Math.floor(Math.random()*1000000)).padStart(6,"0");
		email = $("#email").val();
		$("#authCode").text(authCode);
		$("#emailHolder").text(email);
		$('#msg').text("인증번호를 전송하였습니다.");
		$.ajax({ 
			url :'${contextPath}/member/sendAuthCode', 
			type : 'post', 
			dataType : 'json', 
			data : { 
				"authCode" : authCode,
				"email" : email
			}, 
			success: function(data){} 
		});

	}
	
	function checkAuth() {
		if($("#codeInput").val() == authCode) {
			$('#msg').text("인증이 완료되었습니다.");
			$('#next').prop("disabled", false);
		}
		else {
			$('#msg').text("유효하지 않은 인증번호입니다.");
		}
	}
	
</script>

</head>
<body>
<h2>확인용</h2>
<h4>회원타입 : ${type}</h4>
<!-- <h4>14세 : ${fourteen}</h4>-->
<h4>개인정보 : ${personal}</h4>
<h4>약관 : ${policy}</h4>

<br>
<br>
<br>

<input id="email" type="email" placeholder="이메일 주소를 입력하세요"/><button type="button" onclick="sendAuth()">인증번호 발송</button>
<br>
<input id="codeInput" type="text" placeholder="인증번호(6자리 숫자)"/><button type="button" onclick="checkAuth()">인증</button>
<br>
<p id="msg"></p>
<br>
<br>
<form method="post" action="${contextPath}/member/registerForm/3">
<button id="next" type="submit" onclick="checkAuth()" disabled>다음</button>
</form>

</body>
</html>