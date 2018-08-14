<%-- 
    Document   : respuesta
    Created on : 13/08/2018, 12:20:43 PM
    Author     : PCB
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>SUMA</h1>
        <table border="0">
            <thead>
                <tr>
                    <th>DATO</th>
                    <th>VALOR</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Número 1:</td>
                    <td><%= request.getAttribute("n1") %></td>
                </tr>
                <tr>
                    <td>Número 2:</td>
                    <td><%= request.getAttribute("n2") %></td>
                </tr>
                <tr>
                    <td>Suma:</td>
                    <td><%= request.getAttribute("suma") %></td>
                </tr>
            </tbody>
        </table>

    </body>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>RESTA</h1>
        <table border="0">
            <thead>
                <tr>
                    <th>DATO</th>
                    <th>VALOR</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Número 1:</td>
                    <td><%= request.getAttribute("n1") %></td>
                </tr>
                <tr>
                    <td>Número 2:</td>
                    <td><%= request.getAttribute("n2") %></td>
                </tr>
                <tr>
                    <td>Resta:</td>
                    <td><%= request.getAttribute("resta") %></td>
                </tr>
            </tbody>
        </table>

    </body>
</html>