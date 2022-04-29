<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String id[] = {"user","admin","root"};
		String pass[] = {"user12","admin12","root12"};
		
		for(int i=0; i<3; i++){
			if(id[i].equals(request.getParameter("id"))&&pass[i].equals(request.getParameter("pass"))){
				session.setAttribute("userid", request.getParameter("id"));
				response.sendRedirect("welcome.jsp");
			}}
			%>
			
			아이디와 비밀번호를 확인해주세요.
			<br><br>
			<a href="login.jsp">돌아가기</a>
		
</body>
</html>