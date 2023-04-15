<%--
  Created by IntelliJ IDEA.
  User: yuandou
  Date: 2023/4/15
  Time: 9:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="film" items="${requestScope.filmVoList}" begin="0" step="1">
    <div>
<input type="hidden" name="filmId" value="${film.filmId}">
<input type="text" name="name" value="${film.name}">
<input type="text" name="director" value="${film.director}">
<input type="text" name="player" value="${film.player}">
<img src="${pageContext.request.contextPath}${film.imgPath}">
    </div>
</c:forEach>
</body>
</html>
