<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Outer page</title>
</head>
<body>
	<h2>외부 파일 2</h2>
	<%
	String newVAr2 = "백제 온조왕";
	%>
	<ul>
		<li>page 영역 속성 : <%=pageContext.getAttribute("pAttr")%>
		<li>request 영역 속성 : <%=request.getAttribute("rA`ttr")%>
	</ul>
</body>
</html>