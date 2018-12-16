<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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

	<div class="panel-heading">학년/학기별 이수 총 학점</div>
	<table class="table table-striped">
		<tbody>
		<thead>
			<tr align="center">
				<th>수강년도</th>
				<th>학기</th>
				<th>이수학점</th>
				<th>상세보기</th>
			</tr>

		</thead>
		<c:forEach var="semesterPoint" items="${semesterPoints}">
			<tr align="center">
				<td>${semesterPoint.course_year }</td>
				<td>${semesterPoint.course_semester }</td>
				<td>${semesterPoint.course_point }</td>
				<td><a href="${pageContext.request.contextPath }/yearSemesterCourse?course_year=${semesterPoint.course_year }&course_semester=${semesterPoint.course_semester }">링크</a></td>
			</tr>
		</c:forEach>
		<tr>
			<td><a href="${pageContext.request.contextPath}/ ">home </a>
		</tr>
		</tbody>
	</table>
</body>
</html>