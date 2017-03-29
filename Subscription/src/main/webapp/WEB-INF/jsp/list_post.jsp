<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Post Details</title>
</head>
<body>
	<p>List of Post Details</p>
	<c:if test="${not empty view_post}">
		<table border="1">
			<tr>
				<td>User id</td>
				<td>id</td>
				<td>User Title</td>
				<td>Body</td>
				
			</tr>
			<ul>
				<c:forEach var="listValue" items="${view_post}">
					<tr>
						<td>${listValue.userId}</td>
						<td>${listValue.id}</td>
						<td>${listValue.title}</td>
						<td>${listValue.body}</td>
					</tr>

				</c:forEach>
			</ul>

			</c:if>
		</table>
</body>
</html>