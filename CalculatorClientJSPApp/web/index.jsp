<%-- 
    Document   : index
    Created on : 8 Mar, 2018, 4:19:22 PM
    Author     : zaheer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>CalculatorJSPApplication</title>
        <style>
            .back
            {
             background-color: wheat;
             color: darkslategray;
             padding: 10px;
            }
        </style>
    </head>
    <body bgcolor="powderblue">
        
        <div align="center">
            <h1 class="back"><i><b><marquee behavior="scoll" direction="left">CALCULATOR WEB APPLICATION</marquee></b></i></h1>
            <form action ="CalculatorClientApp.jsp" method="GET" >
                <input type ="text" required name ="num1" placeholder="Enter a Number">
                <br/><br/>
                <input type ="text" required name ="num2" placeholder="Enter a Number">
                <br/><br/>
                <input type="submit" value = "CALCULATE" >
        </form>
        </div>
    </body>
</html>

