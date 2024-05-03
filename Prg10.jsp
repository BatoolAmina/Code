//Design program for JSP by using JSP Exception and JSP Action Elements. 

//JSP file ('calculator.jsp'):
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculator</title>
</head>
<body>
    <h1>Simple Calculator</h1>
    <form action="calculator.jsp" method="post">
        <label for="numerator">Numerator:</label>
        <input type="text" id="numerator" name="numerator">
        <br>
        <label for="denominator">Denominator:</label>
        <input type="text" id="denominator" name="denominator">
        <br>
        <input type="submit" value="Calculate">
    </form>
    
    <hr>
    
    <h2>Result:</h2>
    <%
        try {
            int numerator = Integer.parseInt(request.getParameter("numerator"));
            int denominator = Integer.parseInt(request.getParameter("denominator"));
            int result = numerator / denominator;
            out.println("<p>" + numerator + " / " + denominator + " = " + result + "</p>");
        } catch (NumberFormatException e) {
            out.println("<p>Error: Please enter valid integers.</p>");
        } catch (ArithmeticException e) {
            out.println("<p>Error: Division by zero is not allowed.</p>");
        } catch (Exception e) {
            out.println("<p>Error: An unexpected error occurred.</p>");
        }
    %>
</body>
</html>
