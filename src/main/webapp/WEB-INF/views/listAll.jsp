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
<title>�Խ��� ���</title>
</head>

<body>
	<table border='1' width='880'>
		<tr>
	        <td width="77">
	            <p align="center">�۹�ȣ</p>
	        </td>
	
	        <td width="327">
	            <p align="center">����</p>
	        </td>
	        <td width="197">
	            <p align="center">�ۼ���</p>
	        </td>
	
	        <td width="155">
	            <p align="center">�ۼ���</p>
	        </td>
	        <td width="90">
	            <p align="center">��ȸ��</p>
	        </td>
        </tr>
        
        
  		<c:forEach items="${list}" var="boardVO">
			<tr>
				<td>${boardVO.bno}</td>
				<td>${boardVO.title}</td>
				<td>${boardVO.writer}</td>
	        	<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${boardVO.regdate}" /> </td>
	        	<td><span class="badge bg-red">${boardVO.viewcnt}</span></td>
			</tr>
		</c:forEach> 

        
        
        
       	<button type = "submit">�۾���</button>
       	  	
	</table>
	

	
</body>

</html>