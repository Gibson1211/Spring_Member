<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	input {
		display : blodck;
		}
</style>
</head>
<body>
	<h2>회원가입 페이지</h2>
	<form action="save" method="post">
		아이디: <input type="text" name="m_id"><br>
		패스워드: <input type="password" name="m_password"><br>
		이름: <input type="text" name="m_name"><br>
		이메일: <input type="text" name="m_email"><br>
		전화번호: <input type="text" name="m_phone"><br>
			<input type="submit" value="회원가입"><br>
	</form>

</body>
</html>