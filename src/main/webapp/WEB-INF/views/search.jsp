<%--
  Created by IntelliJ IDEA.
  User: efsam
  Date: 2/8/2021
  Time: 4:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search</title>

</head>
<body id="back">
<div class="container">
    <form action="show" method="get">

        <label id="org"> Origin </label>
        <label id="des"> Destination </label>
        <label id="dat"> Date</label><br>

        <select id="ori" name="origin">
            <option value="0">Select your origin...</option>
            <c:forEach items="${cities}" var="city">
                <option value="${city.id}">${city.name}</option>
            </c:forEach>
        </select>

        <select id="desti" name="destination">
            <option value="0">Select your destination...</option>
            <c:forEach items="${cities}" var="city">
                <option value="${city.id}">${city.name}</option>
            </c:forEach>
        </select>

        <input id="date" name="date" type="text" placeholder="2021/**/**">

        <input id="sear" type="submit" value="search">

    </form>
</div>

    <p id="title">List of your tickets:</p>
    <form action="tickets">
        <input id="butt" type="submit" name="show" value="show">
    </form>

</body>
</html>
