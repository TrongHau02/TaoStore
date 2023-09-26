<%--
  Created by IntelliJ IDEA.
  User: haung
  Date: 7/22/2023
  Time: 11:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
    <meta name="description" content=""/>
    <meta name="author" content=""/>
    <title><decorator:title default="Master-Layout"/></title>
    <!-- Favicon-->
    <link rel="icon" type="image/x-icon" href="<c:url value="/assets/user/apple.ico" />"/>
    <!-- Bootstrap icons-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet"/>
    <!-- Core theme CSS (includes Bootstrap)-->
    <%--<link href="<c:url value="/assets/user/css/styles.css" />" rel="stylesheet"/>--%>
    <link href="<c:url value="/assets/bootstrap@5.2.3/dist/css/bootstrap.css" />" rel="stylesheet"/>
    <link href="<c:url value="/assets/bootstrap@5.2.3/dist/css/bootstrap.min.css" />" rel="stylesheet"/>
</head>
<body>
<%@ include file="/WEB-INF/views/layouts/user/header.jsp"%>

<decorator:body/>

<%@ include file="/WEB-INF/views/layouts/user/footer.jsp"%>

<!-- Bootstrap core JS-->
<%--<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>--%>
<script src="<c:url value="/assets/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"/>"></script>
<!-- Core theme JS-->
<script src="<c:url value="/assets/user/js/scripts.js" />"></script>
</body>
</html>

