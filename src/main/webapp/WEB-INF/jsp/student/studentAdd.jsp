<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
   

<html>
<head>
<title>Student Add</title>
</head>

<body>
        <c:import url="/WEB-INF/jsp/includes/header.jsp" />
        
            <form action="add" method="post">
                    <h3>Add  Student </h3>
                    First Name:   <input type="text" name="firstName"   value="${firstName}" /> <br/>
                    Last Name:    <input type="text" name="lastName"    value="${lastName}" /><br/>
                    Phone Home:   <input type="text" name="phoneHome"   value="${phoneHome}" /><br/>
                    Phone Mobile: <input type="text" name="phoneMobile" value="${phoneMobile}" /><br/>
                    <input type="submit" value="add" />
            </form>    

        
        
        
        
        <c:import url="/WEB-INF/jsp/includes/footer.jsp" />
</body>
</html>
