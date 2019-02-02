<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result Page</title>
</head>
<body>
	<h1>Beer Recommendations JSP</h1>
	<p>
		<!-- some standard Java sitting inside /</% /%/> tags == aka scriplet code -->
		<% 
		//Here we are getting an attribute from the request object
		  List styles = (List)request.getAttribute("styles");
		
		  Iterator it = styles.iterator();
		
		  while(it.hasNext()) {
		    out.print("<br>try: " + it.next());
		  }
		%>
		
	</p>
</body>
</html>