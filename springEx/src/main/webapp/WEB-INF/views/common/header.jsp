<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
  request.setCharacterEncoding("UTF-8");
%> 
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />

<!doctype html>
<html lang="en">
  <head>
  	<title>nav</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<link href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,700' rel='stylesheet' type='text/css'>

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" href="${contextPath}/css/bootstrap.min.css">
	<link rel="stylesheet" href="${contextPath}/css/style.css">

	</head>
<body>


	<section class="ftco-section">
		<div class="container">
			<nav class="navbar navbar-expand-lg ftco_navbar ftco-navbar-light" id="ftco-navbar">
		    <div class="container">
		    	<a class="navbar-brand" href="index.html">to.Class</a>
		      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
		        <span class="fa fa-bars"></span> Menu
		      </button>
		      <div class="collapse navbar-collapse" id="ftco-nav">
		        <ul class="navbar-nav ml-auto mr-md-3">
		        	<li class="nav-item active"><a href="#" class="nav-link"></a></li>
		        	<li class="nav-item"><a href="#" class="nav-link">Accessories</a></li>
		        	<li class="nav-item"><a href="#" class="nav-link">Shop</a></li>
		        	<li class="nav-item"><a href="#" class="nav-link">Products</a></li>
		          <li class="nav-item"><a href="#" class="nav-link">Contact</a></li>
		          <li class="dropdown nav-item d-md-flex align-items-center">
                <a href="#" class="dropdown-toggle nav-link d-flex align-items-center justify-content-center icon-cart p-0" id="dropdown04" data-toggle="dropdown" aria-expanded="false">
                  <i class="fa fa-shopping-cart"></i>
                  <b class="caret"></b>
                </a>
                <div class="dropdown-menu dropdown-menu-right" aria-labelledby="dropdown04">
                  <a href="#" class="dropdown-item">Action</a>
                  <a href="#" class="dropdown-item">Another action</a>
                  <a href="#" class="dropdown-item">Something else here</a>
                  <div class="dropdown-divider"></div>
                  <a href="#" class="dropdown-item">Separated link</a>
                  <div class="dropdown-divider"></div>
                  <a href="#" class="dropdown-item">One more separated link</a>
                </div>
              </li>
		        </ul>
		      </div>
		    </div>
		  </nav>
    <!-- END nav -->
  </div>

	</section>

	<script src="${contextPath}/js/jquery.min.js"></script>
  <script src="${contextPath}/js/popper.js"></script>
  <script src="${contextPath}/js/bootstrap.min.js"></script>
  <script src="${contextPath}/js/nav.js"></script>
<!--
<table border=0  width="100%">
  <tr>
     <td width="15%">
		<a href="${contextPath}/main.do">
			<img src="${contextPath}/resources/images/flower.jpg" width="150" height="150"   />
			<img src="https://upload.wikimedia.org/wikipedia/commons/f/fd/Pink_flower.jpg" width="150" height="150"   />
		</a>
     </td>
     <td>
       <h1><font size=30>실습</font></h1>
     </td>
     
     <td>
       <!-- <a href="#"><h3>로그인</h3></a> 
       <c:choose>
          <c:when test="${isLogOn == true  && member!= null}">
            <h3>환영합니다. ${member.name }님!</h3>
            <a href="${contextPath}/member/logout.do"><h3>로그아웃</h3></a>
          </c:when>
          <c:otherwise>
	        <a href="${contextPath}/member/loginForm.do"><h3>로그인</h3></a>
	      </c:otherwise>
	   </c:choose>     
     </td>
  </tr>
</table>
-->

</body>
</html>