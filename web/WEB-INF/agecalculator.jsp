<%-- 
    Document   : agecalculator
    Created on : May 27, 2021, 4:59:09 PM
    Author     : 854276
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age" >
            <label>Enter your age:</label>
            <input type="text" name="age" value="${age_entered}"  >
            <br>

            <input type="submit" value="Age next birthday">
            <br>

        </form>

        <p> ${invalidmessage}</p>
    
        <a href="http://localhost:8084/Lab3_Calculators/arithmetic">Arithmetic Calculator</a>
    </body>
</html>
