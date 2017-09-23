<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap css -->
<link rel="stylesheet"
	href="${resourceStatic}/css/lib/bootstrap-3.3.7.css">
<!-- My application css -->
<link rel="stylesheet" href="${resourceStatic}/css/app/app.css">

<title>Việc làm Đồng Nai</title>
</head>
<body>
	<!-- Include header -->
	<jsp:include page="${resourcePage}/header.jsp" />

	<!-- Include navigator -->
	<jsp:include page="${resourcePage}/navigator.jsp" />

	<!-- Include body -->
	<jsp:include page="${resourcePage}/body.jsp" />

	<!-- Include footer -->
	<jsp:include page="${resourcePage}/footer.jsp" />

	<!-- Bootstrap JavaScript -->
	<script src="${resourceStatic}/js/lib/jquery-3.2.1.js"
		type="text/javascript"></script>
	<script src="${resourceStatic}/js/lib/bootstrap-3.3.7.js"
		type="text/javascript"></script>
	<!-- My application JavaScript -->
	<script src="${resourceStatic}/js/app/app.js" type="text/javascript"></script>
</body>
</html>