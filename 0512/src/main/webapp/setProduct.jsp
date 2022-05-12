<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		String sess= "";
		session.setAttribute("sess", request.getParameter("id"));
		if(session.getAttribute("sess") == null){
			out.print("<script>alert(\"아이디가 입력되지 않았습니다. 다시입력해주세요.\"); history.back();</script>");
		}
		else{
			sess = (String) session.getAttribute("sess");
		}
	%>
	<h3>상품선택</h3>
	<hr>
	<% out.print(sess); %>님이 로그인 한 상태입니다.
	<hr>
	<form method=get action="addProduct.jsp">
		<select name="item">
			<option value="햄버거">햄버거</option>
			<option value="떡볶이">떡볶이</option>
			<option value="감자탕">감자탕</option>
			<option value="자장면">자장면</option>
			<option value="김치볶은밥">김치볶은밥</option>
			<option value="샐러드">샐러드</option>
		</select>
		<input type="submit" value="추가">
	</form>
	<a href="Checkout.jsp">장바구니</a>
</body>
</html>