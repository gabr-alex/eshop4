<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add product</title>
</head>
<body>
	<section>
		<h1>Orders</h1>
		<p>Add orders</p>
	</section>


	<section>
		<form:form method="POST" modelAttribute="newOrder">

		<fieldset>
		<legend>Place an order:</legend>

		<div>
		<label for="name">NAME</label>
		<form:input path="name" type="text"  />
		</div>

		<div>
		<label for="color">Color</label>
		<form:input path="color" type="text"  />
		</div>

        <div>
		<label for="engine">Color</label>
		<form:input  path="engine" type="text" />
		</div>

	    <input type="submit" value="Add new order" />
	    </fieldset>

	    </form:form>

	</section>

</body>
</html>