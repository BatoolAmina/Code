/*Introduction to JSP:
1. JSP Syntax:
JSP files typically have a ".jsp" extension.
JSP syntax allows mixing HTML and Java code within the same file.
Java code in JSP is enclosed within <% %> tags.
JSP directives, actions, and expressions provide additional functionality.
2. JSP Lifecycle:
JSP lifecycle includes translation, compilation, and execution phases.
JSP files are first translated into servlets by the JSP container.
Servlets are then compiled into bytecode and executed by the server.
3. Implicit Objects:
JSP provides several implicit objects (request, response, session, etc.) that can be used in JSP pages without explicit declaration.
4.JSP Standard Actions:
JSP standard actions are XML-like tags used to perform common tasks such as including files, forwarding requests, and looping through collections.*/

// Sample Programs:

//Hello World Example:
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Hello World</title>
</head>
<body>
    <h1>Hello, World!</h1>
</body>
</html>
//This is a simple JSP file that displays "Hello, World!" in the browser.

//Using Scriptlet:
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Using Scriptlet</title>
</head>
<body>
    <% 
        String name = "John";
        out.println("Hello, " + name);
    %>
</body>
</html>
//This JSP file uses a scriptlet to print "Hello, John" in the browser.

//Using Expression:
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Using Expression</title>
</head>
<body>
    <% 
        String message = "Welcome to JSP!";
    %>
    <h1><%= message %></h1>
</body>
</html>

// JSP file uses an expression <%= %> to display the value of the message variable.

//Using JSP Directive:
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Using Directive</title>
</head>
<body>
    <%@ include file="header.jsp" %>
    <p>Main Content Goes Here</p>
    <%@ include file="footer.jsp" %>
</body>
</html>
This JSP file includes header and footer files using the include directive.
