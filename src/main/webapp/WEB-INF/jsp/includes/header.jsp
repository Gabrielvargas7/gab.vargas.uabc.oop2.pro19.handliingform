<%-- 
    Document   : header
    Created on : Aug 4, 2011, 4:14:20 PM
    Author     : gvargas
--%>

    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    

      <!-- Header -->
     <span><a href="<c:url value="/index?language=en"/>">English</a></span>
     <span><a href="<c:url value="/index?language=es"/>">Espa<span>&ntilde</span>ol</a></span>


      <h3>
          <spring:message code="header.today" text="Today is" />
          <fmt:formatDate value="${today}" pattern="yyyy-MM-dd" /><br/><br/>
      </h3>
      <h4> Home -->
          
          <a href="<c:url value="/index"/>"/> index </a></h4>
      <br/>
      <br/>
      <br/>
      <span>
            <spring:message code="header.university.name" text="UABC University--" />
      </span>
      <br/>
      <span>
            <spring:message code="header.university.deparment" text="Software Engineer Department--" />                            
      </span>  
      <br/>
      <span>  
        <spring:message code="header.welcome.title" text="Welcome--" />                            
      </span>
       
        <!-- End Header -->
                