<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Message Box</title>
</head>
<body>
<style type="text/css">


#username
		{
		   
		    margin-top: 20px;
		    margin-right : 20px;
		    margin-left : 30px;
			padding-left: 20px;
			padding-right: 190px;
			padding-bottom: 50px;
		    padding-top: 50px;
		    border-radius: 9px;
		    width: 175px;
		    border: 1px solid  #ccc;
		}
		#search
		{
		     margin-top: 30px;
		    margin-right : 30px;
		    margin-left : 30px;
			padding-left: 10px;
			padding-right: 10px;
			padding-bottom: 10px;
		    padding-top: 10px;
		    border-radius: 9px;
		    width: 175px;
		    border: 1px solid red;
		}
		

</style>
<form action = "sendbox" method="post" >
<abbr title="search"><input id="search" type="search" placeholder="search" name="search"></abbr><br>
<abbr title="enter your Messages"><input id="username" type="Username" placeholder="write your Message " name="Message"></abbr>
<br>
<p style="margin-left : 30px">
<button id="button" style ="margin-top: 10px; align:left ">Send Message </button></p>
</form>
</body>
</html>