<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>��ٱ���</h3>
<br>
������ ��ǰ ���<br>
<strong><%= session.getAttribute("sess")%>�� ��ٱ���</strong>
<hr>
<%
	ArrayList<String> item_Li = (ArrayList) session.getAttribute("item");
	if(item_Li == null){
		out.print("<script>alert(\"��ٱ��ϰ� ����ֽ��ϴ�. ������ �������ּ���.\"); history.back();</script>");
	}
	else{
		for(int i=0; i<item_Li.size(); i++){
			out.print((i+1)+". ");
			out.println(item_Li.get(i) + "<br>");
		}
	}
%>
<br>
<input type="button" onclick = "history.back()" value = "�ڷΰ���">
<form method= post action = "Login.jsp">
	<input type="submit" value = "�α׾ƿ�">
</form>


</body>
</html>