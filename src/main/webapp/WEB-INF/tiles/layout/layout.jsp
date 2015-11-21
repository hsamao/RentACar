<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%--
  Created by IntelliJ IDEA.
  User: hsamao
  Date: 11/20/15
  Time: 7:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>

    <link href="<spring:url value="/static/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">
    <script src="<spring:url value="/static/jquery/jquery-2.1.4.min.js"/> "></script>
</head>
<body>
Layout page
<div class="container">
    <div class="row">
        <div class="col-md-4">
            <tiles:insertAttribute name="menu"/>
        </div>
        <div class="col-md-8">
            <tiles:insertAttribute name="body"/>
        </div>
    </div>
</div>

</body>
<tiles:insertAttribute name="footer"/>
</html>
