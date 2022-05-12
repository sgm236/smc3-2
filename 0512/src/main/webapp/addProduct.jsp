<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		ArrayList<String> item = (ArrayList) session.getAttribute("item");
		String foods = request.getParameter("item");
		if(item == null){
			item = new ArrayList<>();
		}
		session.setAttribute("item", item);
		item.add(foods);
	%>
	
	<script>
		alert("<%=foods%>이 추가되었습니다.");
		history.back();
	</script>
</body>
</html>