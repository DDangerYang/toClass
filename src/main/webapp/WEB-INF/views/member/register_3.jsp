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
<title>회원가입 페이지_3단계(/member/register_3.jsp)</title>
</head>
<body>
<h2>확인용</h2>
<h4>회원타입 : ${type}</h4>
<!-- 
<h4>개인정보 : ${personal}</h4>
<h4>약관 : ${policy}</h4>
 -->
</body>
</html>