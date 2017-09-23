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

<title>Việc làm Đồng Nai | Đăng nhập</title>
</head>
<body>
	<!-- Include header -->
	<jsp:include page="${resourcePage}/header.jsp" />

	<!-- Include navigator -->
	<jsp:include page="${resourcePage}/navigator.jsp" />

	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="container">
				<h2>Đồng Nai Works đăng nhập</h2>
				<form class="form-horizontal" action="/dang-nhap">
					<div class="form-group">
						<label class="control-label col-sm-2" for="email">Tên tài
							khoản hoặc email:</label>
						<div class="col-sm-10">
							<input type="email" class="form-control" id="email"
								placeholder="Enter email" name="email">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="pwd">Mật khẩu:</label>
						<div class="col-sm-10">
							<input type="password" class="form-control" id="pwd"
								placeholder="Enter password" name="pwd">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<div class="checkbox">
								<label><input type="checkbox" name="remember">
									Remember me</label>
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-default">Submit</button>
						</div>
					</div>
				</form>
			</div>
		</div>
		<div class="col-md-2"></div>
	</div>

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

