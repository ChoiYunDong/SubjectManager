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

	<div class="panel-heading">상세 이수 과목 조회</div>
	<table class="table table-striped">
		<tbody>
		<thead>
			<tr align="center">
				<th>과목명</th>
			</tr>

		</thead>
		<c:forEach var="course" items="${coursenameList}">
			<tr align="center">
				<td>${course.course_name}</td>
			</tr>
		</c:forEach>
		<tr>
			<td><a href="${pageContext.request.contextPath}/ ">home </a>
		</tr>
		</tbody>
	</table>
</body>
</html>