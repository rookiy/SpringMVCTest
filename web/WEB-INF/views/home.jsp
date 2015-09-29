<%--
  User: try
  Date: 2015/9/16
  Time: 10:48
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="false" %>
<html>
<head>
    <title>Spittr</title>
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
                    <li class="active"><a href="#">Home</a></li>
                    <li><a href="<c:url value="/spittles"/>">Spittles</a></li>
                    <li><a href="<c:url value="/spitter/register"/>">Register</a></li>
                    <li><a href="#">About</a></li>
                </ul>
            </div>
        </div>
    </nav>
</body>
</html>
