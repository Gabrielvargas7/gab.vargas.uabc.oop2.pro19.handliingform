<%-- 
    Document   : InitializeDataBase
    Created on : Oct 23, 2012, 3:07:03 PM
    Author     : gvargas
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Initialize The DataBase</title>
    </head>
    <body>
        <c:import url="/WEB-INF/jsp/includes/header.jsp" />
            <br/>    
            <br/>    
    
            <h3>Click here to initialize the Data Base
                <a href="<c:url value="initializeDefaultValues"/>"/> Initialize Default Values </a>
            </h3>
            <br/>    
            <br/>    
    
        <c:import url="/WEB-INF/jsp/includes/footer.jsp" />
    
    </body>
</html>
