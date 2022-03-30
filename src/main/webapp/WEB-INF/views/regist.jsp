<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false"%>
<%@ page import = "java.util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>글쓰기</title>
</head>
<body>
	<form method="post">
		<p><label>제목</label> <input type='text' name='title'></p>
		<p><label>작성자</label> <input type='text' name='writer' size='15'></p>
		
		<label>내용</label>
		<p><textarea rows="15" cols="65" name="content"></textarea></p>
		
		<button type='submit'>등록</button>
	</form>	
</body>

</html>