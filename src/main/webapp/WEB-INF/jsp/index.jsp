<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
            <spring:message code="index.title" text="Welcome to Spring Web MVC project" />
        </title>
    </head>

    <body>
        <c:import url="/WEB-INF/jsp/includes/header.jsp" />
        
        <h3>Menu</h3>
        <spring:message code="index.student" text="Student" /> -->  
            <a href="<c:url value="/student/student"/>"/> 
            <spring:message code="index.student" text="Student--" /> 
            </a>
            <br/>
            <br/>

        <spring:message code="index.course" text="Course" /> -->     
            <a href="<c:url value="/course/course"/>"/>
            <spring:message code="index.course" text="Course" /> 
            </a>
            <br/>
            <br/>
        <spring:message code="index.admin" text="Administration" /> -->     
            <a href="<c:url value="/admin/administration"/>"/> 
            <spring:message code="index.admin" text="Administration" />
            </a>
            <br/>
            <br/>
        
        <c:import url="/WEB-INF/jsp/includes/footer.jsp" />
    
        
        
    </body>
</html>
