<%-- 
    Document   : CalculatorClientApp
    Created on : 8 Mar, 2018, 4:27:40 PM
    Author     : zaheer
--%>

<%@page import="org.me.calculator.CalculatorWS"%>
<%@page import="org.me.calculator.CalculatorWS_Service"%>

<%
    try {
        int a = Integer.parseInt(request.getParameter("num1"));
        int b = Integer.parseInt(request.getParameter("num2"));
        
        CalculatorWS_Service service = new CalculatorWS_Service();
        CalculatorWS port = service.getCalculatorWSPort();
        
        int add = port.addition(a,b);
        int sub = port.substraction(a,b);
        int mul = port.multiplication(a,b);
        int div = port.division(a,b);
        int moddiv = port.modulodivision(a,b);
        out.println("<html>");
        out.println("<head>");
        out.println("<title>JSPApplication</title>");            
        out.println("</head>");
        out.println("<body bgcolor='D2B4DE'>");
        out.println("<div align='center'>");
        out.println("<H1>CALCULATION RESULTS</H1>");
        out.println("<br/>");
            
        
        out.println("ADDITION = "+add);
        out.println("<br/><br/>");   
        out.println("SUBSTRACTION = "+sub);
        out.println("<br/><br/>");
        out.println("MULTIPLICATION = "+mul);
        out.println("<br/><br/>");
        out.println("DIVISION = "+div);
        out.println("<br/><br/>");
        out.println("MODULODIVISION = "+moddiv);
        out.println("<br/><br/>");
        out.println("<a href='index.jsp'>Go Back</a>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
    
    catch (Exception e) 
    {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>CalculatorClientJSPApplication</title>");            
            out.println("</head>");
            out.println("<body bgcolor='E74C3C'>");
            out.println("<div align='center'>");
            out.println("<h1>N U M B E R F O R M A T E X C E P T I O N</h1>");
            out.println("<br/>");
            out.println("Exception"+e);
            out.println("<br/>");
            out.println("<a href='index.jsp'>Go Back</a>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
    }
    %>         