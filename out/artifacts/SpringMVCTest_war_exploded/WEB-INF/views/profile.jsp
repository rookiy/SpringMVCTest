<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  User: try
  Date: 2015/9/20
  Time: 19:09
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/CSS/bootstrap.min.css"/>" />
    <link rel="stylesheet" type="text/css" href="<c:url value="/CSS/style.css" />" >
    <style>
        body{
            padding: 50px;
            margin: 50px;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <a href="#" class="navbar-brand">Spittr</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li><a href="#">Home</a></li>
                <li><a href="<c:url value="/spittles"/>">Spittles</a></li>
                <li class="active"><a href="<c:url value="/spitter/register"/>">Register</a></li>
                <li><a href="#">About</a></li>
            </ul>
        </div>
    </div>

    <div class="well well-lg">
        <h1 class="lead">Your Profile</h1>
        <c:out value="${spitter.username}" /><br/>
        <c:out value="${spitter.firstName}" /> <c:out value="${spitter.lastName}" /><br/>
        <c:out value="${spitter.email}" />
    </div>
</nav>
</body>
</html>
