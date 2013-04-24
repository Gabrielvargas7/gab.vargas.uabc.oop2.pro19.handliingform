<%-- 
    Document   : studentshow
    Created on : Oct 26, 2012, 10:27:30 AM
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
        <title>Student</title>
    </head>
    <body>
     <c:import url="/WEB-INF/jsp/includes/header.jsp" />
     
     <h6>
     ****************************************************
     </h6>
     <h3>Student</h3>
     <ul>
        <li><a href="#">Add</a></li>
        <li><a href="#">Remove</a></li>
        <li><a href="#">Change</a></li>
    </ul>
     <h6>
     ****************************************************
     </h6>
     
                <table>
                <tr>
                    <th>Select</th>
                    <th>Student Id</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Phone Home</th>
                    <th>Phone Mobile</th>
                </tr>

                <c:forEach var="student" items="${studentList}">
                    <tr>
                        <td><c:out value="${student.studentId}"/></td>
                        <td><c:out value="${student.firstName}"/></td>
                        <td><c:out value="${student.lastName}"/></td>
                        <td><c:out value="${student.phoneHome}"/></td>
                        <td><c:out value="${student.phoneMobile}"/></td>
                    </tr>
                </c:forEach>
                </table>
    
           
     
      
    <c:import url="/WEB-INF/jsp/includes/footer.jsp" />
      
    </body>
</html>
