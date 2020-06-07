
<%--
  Created by IntelliJ IDEA.
  User: javidanhajizada
  Date: 6/7/20
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<html>


<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

    <title>Cars</title>
</head>
<body>
<table>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <h1>TITLE:<spring:message code="car.title"/></h1>
    <tr>
        <th class="column1">CarName</th>
        <th class="column2">CarModel</th>
        <th class="column3">CarType</th>
        <th class="column4">Машины</th>
    </tr>
    <c:forEach var="car" items="${cars}">
       <tr>
           <td class="column1">${car.carName}</td>
           <td class="column2">${car.carModel}</td>
           <td class="column3">${car.carType}</td>
       </tr>
    </c:forEach>
</table>
</body>
</html>
