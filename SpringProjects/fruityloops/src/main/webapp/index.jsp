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
	<div class="container">
		<h1 class="text-primary">Fruit Store</h1>
		<div class="row">
			<div class="col1">
				<table class="table">
          <thead class ="table-warning">
						<tr>
							<th scope="col">Fruit</th>
							<th scope="col">Price</th>
						</tr>
					</thead>
					<tbody>
            <c:forEach var="oneFruit" items="${fruitylist}">
              <tr>
                  <td><c:out value="${oneFruit.name}"></c:out></td>
                  <td><c:out value="${oneFruit.price}"></c:out></td>
              </tr>
            </c:forEach>
					</tbody>
				</table>	
			</div>	
		</div>
	</div>	
</body>
</html>
