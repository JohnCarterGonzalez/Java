<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Omikuji</title>

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
	<h2>Send an Omikuji!</h2>
	<form action="#" method="post">
		<div class= "input-group mb-3">
        <label for="number" class="form-label">Pick Any Number between</label>
        <input type="number"name="num" class="form-control">
    </div>
		<div class= "input-group mb-3">
        <label for="city" class="form-label">Enter the name of the city</label>
        <input type="text" name="city" class="form-control">
    </div>
		<div class= "input-group mb-3">
        <label for="person" class="form-label">Enter the name of a real person</label>
        <input type="text"name="person" class="form-control">
    </div>
		<div class= "input-group mb-3">
        <label for="hobby" class="form-label">Enter a Hobby</label>
        <input type="text"name="hobby" class="form-control">
    </div>
		<div class= "input-group mb-3">
        <label for="livingThing" class="form-label">Enter any type of living thing</label>
        <input type="text"name="livingThing" class="form-control">
    </div>
		<div class= "input-group mb-3">
        <label for="niceMessage" class="form-label">Enter a nice message for someone</label>
        <textarea name="niceMessage" cols="30" rows="15"></textarea>
    </div>
    <p> Send to a Friend, to show your appreciation!</p>

    <input type="submit" value="Send"/>
	</form>
</body>
</html>
