<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
<title>로그인 페이지(/member/login.jsp)</title>
</head>

<body>

<form name="frmLogin" method="post" action="${contextPath}/member/login.do" encType="utf-8">
	<fieldset>
	<legend>로그인</legend>
		Email : <input type="text" name="member_email"/> 
		PW : <input type="password" name="member_pw"/>
		<input type="submit" value="로그인"/>
	</fieldset>

	<c:if test="${result=='loginFailed'}">
		<h4>로그인 실패 : 이메일주소 및 비밀번호가 일치하지 않습니다.</h4>
	</c:if>	
	
<a href="${contextPath}/member/findEmail">계정 찾기</a>
<a href="${contextPath}/member/findPw">비밀번호 찾기</a>
<a href="${contextPath}/member/register_0">회원가입</a>
	
</form>

</body>
</html>