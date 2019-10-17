<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<link href="/eshop/bootstrap-4.3.1-dist/css/bootstrap.min.css" rel="stylesheet">
 <style><%@include file="/WEB-INF/jsp/style.css"%></style>
<title>Vienas produktas</title>
</head>
<body>
<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Product information</h1>
			</div>
		</div>
	</section>
<section class="container">
		<div class="row">
<c:forEach items="${produktai}" var="elementas">
<div class="col-sm-6 col-md-3">
					<div class="thumbnail">
<h3>${elementas.productId}</h3>
<h3>${elementas.name}</h3>
<img src="<c:url value="/img/${elementas.productId}.jpeg"></c:url>" alt="image" style="width: 50%" />

</div>
</div>


</c:forEach>
</div>
	</section>

<button onclick="window.location.href = 'http://localhost:8080/eshop/market/products/add';">Add product</button>
<button onclick="window.location.href = 'http://localhost:8080/eshop/orders';">Place an order</button>
</body>
</html>