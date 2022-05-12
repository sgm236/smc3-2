<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>장바구니</h3>
<br>
선택한 상품 목록<br>
<strong><%= session.getAttribute("sess")%>의 장바구니</strong>
<hr>
<%
	ArrayList<String> item_Li = (ArrayList) session.getAttribute("item");
	if(item_Li == null){
		out.print("<script>alert(\"장바구니가 비어있습니다. 음식을 선택해주세요.\"); history.back();</script>");
	}
	else{
		for(int i=0; i<item_Li.size(); i++){
			out.print((i+1)+". ");
			out.println(item_Li.get(i) + "<br>");
		}
	}
%>
<br>
<input type="button" onclick = "history.back()" value = "뒤로가기">
<form method= post action = "Login.jsp">
	<input type="submit" value = "로그아웃">
</form>


</body>
</html>