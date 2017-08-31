<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<nav class="navbar navbar-default">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="/">dongnai<b>works</b></a>
		</div>
		<ul class="nav navbar-nav">
			<c:forEach var="navigator" items="${navigators}">
				<li><a href="${navigator.link}">${navigator.value}</a></li>
			</c:forEach>
		</ul>
	</div>
</nav>