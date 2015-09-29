<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%--
  User: try
  Date: 2015/9/19
  Time: 16:29
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                    <li><a href="#">Home</a></li>
                    <li><a href="<c:url value="/spittles"/>">Spittles</a></li>
                    <li class="active"><a href="<c:url value="/spitter/register"/>">Register</a></li>
                    <li><a href="#">About</a></li>
                </ul>
            </div>
        </div>
    </nav>


    <div class="container well col-md-8 col-md-offset-1">

    <div class="row ">
    <h1 class="lead col-md-8 col-md-offset-1">注册成为新用户</h1>
    </div>
    <sf:form role="form" class="form-horizontal" id="register" commandName="spitter" method="post">
        <div class="form-group row">
            <label class="col-md-2 control-label">用户名</label>
            <div class="col-md-3">
                <sf:input path="username" class="form-control" placeholder="username" name="username"/>
            </div>
            <div class="col-md-3">
                <sf:errors path="username" class="text-danger"/>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-md-2 control-label">密码</label>
            <div class="col-md-3">
                <sf:password path="password" class="form-control" placeholder="password" name="password"/>
            </div>
            <div class="col-md-3">
                <sf:errors path="password" class="text-danger"/>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-md-2 control-label">名</label>
            <div class="col-md-3">
                <sf:input path="firstName" class="form-control" placeholder="firstName" name="firstName"/>
            </div>
            <div class="col-md-3">
                <sf:errors path="firstName" class="text-danger"/>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-md-2 control-label">姓</label>
            <div class="col-md-3">
                <sf:input path="lastName" class="form-control" placeholder="lastName" name="lastName"/>
            </div>
            <div class="col-md-3">
                <sf:errors path="lastName" class="text-danger"/>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-md-2 control-label">邮件</label>
            <div class="col-md-3">
                <sf:input path="email" type="email" class="form-control" placeholder="email" name="email"/>
            </div>
            <div class="col-md-3">
                <sf:errors path="email" class="text-danger"/>
            </div>
        </div>
        <div class="form-group row">
            <div class="col-md-offset-2 col-md-2">
                <button type="submit" class="btn btn-default">注册</button>
            </div>
        </div>
    </sf:form>


    </div>
</body>
</html>
