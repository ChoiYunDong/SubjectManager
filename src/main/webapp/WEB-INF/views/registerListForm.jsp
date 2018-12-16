<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 5px;
}
</style>
</head>
<body>

	<div class="panel-heading">수강신청 목록</div>
	<table class="table table-striped">
		<tbody>
		<thead>
			<tr align="center">
				<th>과목코드</th>
				<th>과목명</th>
				<th>이수구분</th>
				<th>학점</th>
			</tr>

		</thead>
		<c:forEach var="register" items="${registerList}">
			<tr align="center">
				<td>${register.course_code}</td>
				<td>${register.course_name}</td>
				<td>${register.course_type}</td>
				<td>${register.course_point}</td>
			</tr>
		</c:forEach>
		<tr>
			<td><a href="${pageContext.request.contextPath}/ ">home </a>
		</tr>
		</tbody>
	</table>
</body>
</html>