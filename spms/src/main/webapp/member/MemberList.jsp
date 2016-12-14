<%@page import="cafe.jjdev.spms.vo.Member"%>
<%@page import="java.util.ArrayList"%>
<%@ page 
	language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<title>회원 목록</title>

</head>
<body>
<h1>회원목록</h1>
<jsp:useBean id="member" scope="session" class="cafe.jjdev.spms.vo.Member"/>
<div>
Simple Project Management System
<% if (member.getEmail() != null) { %>
	<span>
		<%=member.getName()%>
		<a href="<%=request.getContextPath()%>/auth/logout">로그아웃</a>
	</span>
<%	} else{
%>
		<a href="<%=request.getContextPath()%>/auth/login">로그인</a>
<%
	}
%>
</div>
<p><a href='add'>신규 회원</a></p>
<%
ArrayList<Member> members = (ArrayList<Member>)request.getAttribute("members");
for(Member m : members) {
%>
	<%=m.getNo()%>,
	<a href='update?no=<%=m.getNo()%>'><%=m.getName()%></a>,
	<%=m.getEmail()%>,
	<%=m.getCreatedDate()%>
	<a href='delete?no=<%=m.getNo()%>'>[삭제]</a><br>
<%} %>

<%= request.getAttribute("test") %>
</body>
</html>