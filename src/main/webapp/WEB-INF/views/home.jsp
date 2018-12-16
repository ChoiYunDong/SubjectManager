<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Subject Manager CYD!!</h1>

	
		<!-- 학기별 이수학점 조회 -->
		<P><a href="${pageContext.request.contextPath}/semesterPoints ">
			학기 별 이수학점 조회</a></P>
		
		<!-- 이수 구분별 학점 조회 -->	
		<P><a href="${pageContext.request.contextPath}/typePoints ">
			이수 구분별 학점 조회</a></P>
			
		<!-- 수강 신청 -->	
		<P><a href="${pageContext.request.contextPath}/register ">
			 수강 신청</a></P>
			
		<!-- 수강 신청 목록 조회 -->	
		<P><a href="${pageContext.request.contextPath}/registerList ">
			수강 신청 목록 조회</a></P>
</body>
</html>
