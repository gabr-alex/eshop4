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
		<h1>Products</h1>
		<p>Add products</p>
	</section>


	<section>
		<form:form method="POST" modelAttribute="newProduct" class="form-horizontal" enctype="multipart/form-data"
>
		<fieldset>
		<legend>Add new product:</legend>

		<div>
		<label for="productId">Product Id</label>
		<form:input id="productId" path="productId" type="text" class="form:input-large" />
		</div>

		<div>
		<label for="name">Product name</label>
		<form:input id="name" path="name" type="text" class="form:input-large" />
		</div>

		<div>
		<label for="description">Description</label>
		<form:textarea id="description" path="description" rows="2" />
		</div>

		<div>
		<label for="discontinued">Discontinued</label>
		<form:checkbox id="discontinued" path="discontinued" />
		</div>

		<div class="form-group">
		<label for="condition">Condition</label>
		<div>
		<form:radiobutton path="condition" value="New" />New<form:radiobutton path="condition" value="Old" />
	    Old
	    <form:radiobutton path="condition" value="Refurbished" />Refurbished
	    </div>
	    </div>

	    <form:input id="productImage" path="productImage" type="file" class="form:input-large" />

	    <input type="submit" id="btnAdd" value="Add new product" />
	    </fieldset>

	    </form:form>

	</section>

</body>
</html>