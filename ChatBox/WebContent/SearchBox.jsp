<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Box</title>


</head>
<body align="center">
<style type="text/css">
  #searchbox{
     
		   
		    margin-top: 20px;
		    margin-right : 20px;
		    margin-left : 30px;
			padding-left: 20px;
			padding-right: 190px;
			padding-bottom: 10px;
		    padding-top: 10px;
		    border-radius: 9px;
		    width: 175px;
		    border: 1px solid  #ccc;
		}
	#button
		{
			margin-top: 20px;
		    padding-left: 15px;
		    padding-right: 15px;
		    background: #0072fff7;
		    border-radius: 6px;
		    border: none;
		    color: white;
		    padding-top: 3px;
		    padding-bottom: 3px;
		}
</style>
<form action="search"  method="post">
 <pre><input type="text" id="searchbox" placeholder="search..." name = "search" ><button id="button">Search</button></pre>
</body>
</html>