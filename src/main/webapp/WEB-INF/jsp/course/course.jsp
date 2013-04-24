<%-- 
    Document   : course
    Created on : Oct 26, 2012, 1:31:10 PM
    Author     : gvargas
--%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
   
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Course</title>
    </head>
    <body>
       <c:import url="/WEB-INF/jsp/includes/header.jsp" />
        
                <table>
                <tr>
                    <th>Select</th>
                    <th>Course Id</th>
                    <th>Course Name</th>
                    <th>Course Code</th>
                </tr>

                <c:forEach var="course" items="${courseList}" >
                    <tr>
                        <td><input type="radio" name="courseid" value="<c:out value="${course.courseId}"/>"/></td>
                        <td><c:out value="${course.courseId}"/></td>
                        <td><c:out value="${course.courseName}"/></td>
                        <td><c:out value="${course.courseCode}"/></td>
                    </tr>
                </c:forEach>
                </table>
       
    
    <c:import url="/WEB-INF/jsp/includes/footer.jsp" />
    
        
    </body>
</html>
