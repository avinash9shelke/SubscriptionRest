<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Post Details</title>
</head>
<body>
	<p>Post Details</p>
	<p>User Id :${view_post.userId}</p>
	<p>Id: ${view_post.id}</p>
	<p>Title :${view_post.title}</p>
	<p>Body :${view_post.body}</p>
</body>
</html>