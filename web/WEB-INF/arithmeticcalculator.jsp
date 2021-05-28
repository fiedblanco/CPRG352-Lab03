<%-- 
    Document   : arithmeticcalculator
    Created on : May 27, 2021, 9:16:57 PM
    Author     : 854276
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
                <form method="post" action="arithmetic" >
            <label>First: </label>
            <input type="text" name="first" value="${first}">
            <br>
            <label>Second: </label>
            <input type="text" name="second" value="${second}">
            <br>

            <input type="submit" name="buttons" value="+">
            <input type="submit"  name="buttons" value="-">
            <input type="submit" name="buttons" value="*">
            <input type="submit" name="buttons" value="%">
            <br>

        </form>

        <p>Results: ${resultmessage}</p>
        <p>${invalidmessage}</p>
        <a href="http://localhost:8084/Lab3_Calculators/age">Age Calculator</a>
    </body>
</html>
