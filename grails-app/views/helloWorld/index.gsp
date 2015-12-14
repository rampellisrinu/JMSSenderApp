<%--
  Created by IntelliJ IDEA.
  User: Srinivas.Rampelli
  Date: 12/11/2015
  Time: 6:48 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<g:form action="sendMessage">
    ${message} <br>
    Message:    <input type="text" name="message"/>
    <br>
    <input type="submit" value="Send">

</g:form>
</body>
</html>