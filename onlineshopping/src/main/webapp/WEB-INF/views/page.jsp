<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<!-- Provision to load the favicon icon and eliminate the error we get during inspect html page. This is also supposed to work on html5 -->
<!-- <link rel="shortcut icon" href="favicon.ico"> -->
<link rel="icon" href="data:;base64,iVBORw0KGgo=">

<title>Online Shopping - ${title}</title>

<script>
	window.menu = '${title}';
</script>

<!-- Bootstrap core CSS -->
<!--     <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet"> -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>

	<!-- Navigation -->
	<%@include file="./shared/navbar.jsp"%>

	<!-- Page Content -->
	<!-- Loading the home page here -->
	<c:if test="${userClickHome==true}">
		<%@include file="home.jsp"%>
	</c:if>

	<!--  include only when user click on About -->
	<c:if test="${userClickAbout==true}">
		<%@include file="about.jsp"%>
	</c:if>

	<!--  include only when user click on Contact -->
	<c:if test="${userClickContact==true}">
		<%@include file="contact.jsp"%>
	</c:if>

	<!-- Footer -->
	<%@include file="./shared/footer.jsp"%>

	<!-- Bootstrap core JavaScript -->

	<!--  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script> -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>

	<!--     <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script> -->

	<script src="${js}/jquery.js"></script>

	<!--     <script src="vendor/popper/popper.min.js"></script> -->
	<!-- 	<script src="${js}/popper.js"></script> -->

	<script src="${js}/bootstrap.min.js"></script>

	<!-- self coded java script -->
	<script src="${js}/myapp.js"></script>

</body>

</html>
