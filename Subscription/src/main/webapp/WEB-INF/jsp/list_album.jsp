<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Albums Details</title>
</head>
<body>
	<p>List of Albums Details</p>
	<c:if test="${not empty view_album}">
      <table border="1">
      <tr>
      <td>User id</td>
      <td>id</td>
      <td>User Title</td>
      </tr>
		<ul>
			<c:forEach var="listValue" items="${view_album}">
				<tr>
				<td>${listValue.userId}</td>
				<td>${listValue.id}</td>
				<td>${listValue.title}</td>
				</tr>
								
			</c:forEach>
		</ul>

	</c:if>
	</table>
</body>
</html>