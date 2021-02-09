<%--
  Created by IntelliJ IDEA.
  User: efsam
  Date: 2/9/2021
  Time: 10:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Detail ticket</title>
    <link rel="stylesheet" type="text/css" href="detailTicket.css" />
</head>
<body>

<table id="table">
        <tr>
            <th colspan="4">
                Bus ticket
            </th>
        </tr>
        <tr>
            <th>Ticket id:</th>
            <td><c:out value="${detail.ticketId}" /></td>
        </tr>
        <tr>
            <th>Name:</th>
            <td><c:out value="${detail.passengerName}" /></td>
        </tr>
        <tr>
            <th>Gender:</th>
            <td><c:out value="${detail.gender}" /></td>
        </tr>
        <tr>
            <th>Origin:</th>
            <td><c:out value="${detail.origin}" /></td>
        </tr>
        <tr>
            <th>Destination:</th>
            <td><c:out value="${detail.destination}" /></td>
        </tr>
        <tr>
            <th>Departure date:</th>
            <td><c:out value="${detail.departureDate}" /></td>
        </tr>
        <tr>
            <th>Departure time:</th>
            <td><c:out value="${detail.departureTime}" /></td>
        </tr>
        <tr>
            <th>Travel id:</th>
            <td><c:out value="${detail.travelId}" /></td>
        </tr>
        <tr>
            <th colspan="4"><a href="cancel?value=${detail.ticketId}">Cancel ticket</a></th>
        </tr>

</table>

</body>
</html>
