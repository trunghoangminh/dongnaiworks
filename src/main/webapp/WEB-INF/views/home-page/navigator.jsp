<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<nav class="navbar navbar-default">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="${slash}">dongnai<b>works</b></a>
		</div>
		<ul class="nav navbar-nav">
			<c:forEach var="navigator" items="${navigators}">
				<li><a href="${navigator.link}">${navigator.value}</a></li>
			</c:forEach>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="${login}"><span
					class="glyphicon glyphicon-user"></span> Đăng nhập</a></li>
			<li><a href="${register}"><span
					class="glyphicon glyphicon-log-in"></span> Đăng ký</a></li>
		</ul>
	</div>
</nav>