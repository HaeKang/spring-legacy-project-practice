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
<title>�ۼ���</title>
</head>
<body>
	<form action="modify" method="post">
		<p><label>�۹�ȣ</label> <input type="text" name ="bno" value ="${boardVO.bno}" readonly="readonly"></p>
		<p><label>����</label ><input type="text" name ="title" value ="${boardVO.title}" ></p>
		<p><label>�ۼ���</label> <input type="text" name="writer" size="15" value = "${boardVO.writer}"></p>
		
		<label>����</label>
		<textarea name=content rows ="10" cols="70" >${boardVO.content}</textarea><br>
		
		<button type ="submit">�Ϸ�</button>
	</form>
</body>
</html>