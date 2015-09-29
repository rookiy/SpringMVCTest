<%--
  User: try
  Date: 2015/9/17
  Time: 18:17
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>spittles</title>
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

    <div class="container-fluid">
        <div class="row-fluid">
            <div class="span2"></div>
            <div class="span7">
                <ul>
                    <c:forEach items="${spittleList}" var="spittle" >
                        <div class="well well-lg">
                            <li id="spittle_<c:out value="${spittle.id}" />">
                                <div class="spittleMessage">
                                    <c:out value="${spittle.message}" />
                                </div>
                                <div>
                                    <span class="spittleTime"><c:out value="${spittle.time}" /></span>
                                    <span class="spittleLocation">
                                        (<c:out value="${spittle.latitude}" />, <c:out value="${spittle.longitude}" />)
                                    </span>
                                </div>
                            </li>
                        </div>
                    </c:forEach>
                </ul>
            </div>
            <div class="span3"></div>
        </div>
    </div>

</body>
</html>
