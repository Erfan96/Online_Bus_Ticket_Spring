<%--
  Created by IntelliJ IDEA.
  User: efsam
  Date: 2/8/2021
  Time: 6:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Buy</title>

</head>
<body>
<div align="center">
<table id="ticket" border="1">
    <tr>
        <td colspan="2"><lable>Direction : ${origin.name}-${destination.name}</lable></td>
        <td><lable>Departure date :<br><c:out value="${date}" /></lable></td>
    </tr>

    <tr>
        <th>Departure time</th>
        <th>Travel id</th>
        <th>Select</th>
    </tr>
    <c:forEach var="travel" items="${travels}">
        <tr>
            <td align="center"><c:out value="${travel.departureTime}" /></td>
            <td align="center"><c:out value="${travel.travelId}" /></td>
            <form action="buy">
                <td align="center" ><input id="but" name="${travel.travelId}" type="submit" value="buy"></td>
            </form>
        </tr>
    </c:forEach>
</table>
</div>
</body>
</html>
