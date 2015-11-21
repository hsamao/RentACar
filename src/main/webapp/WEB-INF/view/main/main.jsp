<%--
  Created by IntelliJ IDEA.
  User: hsamao
  Date: 11/20/15
  Time: 8:13 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>


<security:authorize access="hasAnyRole('ROLE_SUPER_ADMIN', 'ROLE_ADMIN')">

    <div class="container">
        Main Page
    </div>

</security:authorize>
