<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
</head>
<body>
<h3>${member.name}님 환영합니다!</h3>

<p> 아이디 : ${member.id}</p>
<p> 비밀번호 : ${member.pw}</p>
<p> 이름 : ${member.name}</p>
<p> 핸드폰 : ${member.phone}</p>
<p> 이메일 : ${member.email}</p>
<p> 가입일 : ${member.joinDate}</p>
<p> 회원유형 : ${member.type}</p>
<p> 학교ID : ${member.schoolId}</p>
<p> 학급ID : ${member.classId}</p>
<p> 과목코드 : ${member.subjectNo}</p>



</body>
</html>