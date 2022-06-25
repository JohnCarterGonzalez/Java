<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<!-- JSP Standard Library Tag -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

</head>
<body>
<p> You have visited
 <a href="/">
 <c:out value="${page}"/> 
 <c:out value="${count}"/> time(s) 	
 </a>
 
 <p><a href="/">Add to count visit?</a></p>
 <p><a href="/reset">Reset Count</a></p>
</body>
</html>