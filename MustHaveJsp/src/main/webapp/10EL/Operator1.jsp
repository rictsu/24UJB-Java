<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    int num1 = 3;
    pageContext.setAttribute("num2", 4);
    pageContext.setAttribute("num3", "4");
    pageContext.setAttribute("num4", "8");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>변수 선언 및 할당</h3>
스크립틀릿에서 선언한 변수 : ${ num1 } <br/>
page 영역에 저장된 변수 : ${ num2 } <br/>

</body>
</html>