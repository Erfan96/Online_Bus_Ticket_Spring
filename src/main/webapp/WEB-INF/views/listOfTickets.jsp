<%--
  Created by IntelliJ IDEA.
  User: efsam
  Date: 2/9/2021
  Time: 9:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List of tickets</title>

</head>
<body>
<table id="table">
    <tr>
        <th align="center" colspan="3">
            List of purchased tickets
        </th>
    </tr>
    <tr>
        <th align="center">Select</th>
        <th align="center">Ticket id</th>
        <th align="center">Date</th>
    </tr>
    <c:forEach var="ticket" items="${ticketList}">
        <tr>
            <td align="center"><a href="detail?value=${ticket.ticketId}">Show ticket</a></td>
            <td align="center"><c:out value="${ticket.ticketId}" /></td>
            <td align="center"><c:out value="${ticket.departureDate}" /></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
