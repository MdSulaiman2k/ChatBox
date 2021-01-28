<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>
</head>
<body align="center">
	<style type="text/css">
		form
		{
			display: inline-block;
			margin-top: 105px;
			box-shadow: 0 0 0 1px rgba(0, 0, 0, 0.22);
			padding: 34px;
		}
		
		#name
		{
		    margin-top: 2px;
			padding-left: 9px;
		    padding-top: 5px;
		    border-radius: 3px;
		    width: 175px;
		    border: 1px solid #CCC;
		    padding-bottom: 4px;
		}
		#gender
		{
		    margin-top: 10px;
			padding-left: 9px;
		    padding-top: 5px;
		    border-radius: 3px;
		    width: 175px;
		    border: 1px solid #CCC;
		    padding-bottom: 4px;
		}
		#date
		{
		    margin-top: 10px;
			padding-left: 9px;
		    padding-top: 5px;
		    border-radius: 3px;
		    width: 175px;
		    border: 1px solid #CCC;
		    padding-bottom: 4px;
		}
       #number
		{
		    margin-top: 10px;
			padding-left: 9px;
		    padding-top: 5px;
		    border-radius: 3px;
		    width: 175px;
		    border: 1px solid #CCC;
		    padding-bottom: 4px;
		}
		#email
		{
		    margin-top: 10px;
			padding-left: 9px;
		    padding-top: 5px;
		    border-radius: 3px;
		    width: 175px;
		    padding-bottom: 4px;
		    border: 1px solid #CCC;
		}
		#username
		{
		    margin-top: 10px;
			padding-left: 9px;
		    padding-top: 5px;
		    border-radius: 3px;
		    width: 175px;
		    padding-bottom: 4px;
		    border: 1px solid #CCC;
		}
		#password
		{
		    margin-top: 10px;
			padding-left: 9px;
		    padding-top: 5px;
		    border-radius: 3px;
		    width: 175px;
		    border: 1px solid #CCC;
		    padding-bottom: 4px;
		}
		#sex{
		     
		}
		#button
		{
			margin-top: 23px;
		    padding-left: 66px;
		    padding-right: 66px;
		    background: #0072fff7;
		    border-radius: 6px;
		    border: none;
		    color: white;
		    padding-top: 3px;
		    padding-bottom: 3px;
		}
		#showpassword {
		  
		  margin-left : 30px;
		}


	</style>
	<script language="javascript" type="text/javascript">
	   function toggle(){
		const password = document.getElementById("password") ;
		if(password.type == "password"){
			password.type = "text";
		}else{
			password.type = "password";
		}
	}
	</script>
	

	<form action="createaccount" method="post" >
	    <h3 >Create new Account</h3>
	    <br>
	    <abbr text="enter your name"><input id="name" placeholder="*first Name" type="text" name="Name"></abbr><br><br>
	    <input id="name" placeholder="last Name" type="text" name="lastName"> <br><br>
		<abbr text="your emailid"><input id="email" type="email" placeholder="*Email ID" name="email"></abbr><br><br>
		<abbr text="your password"><input id="password" type="password" placeholder="*Password" name="password"></abbr><br>
		<pre style ="margin-right:100px"><input type ="checkbox" id ="showpassword" onclick="toggle()" > show Password<br></pre>
		<button id="button">Sign Up</button><br><br><br>
	
	</form>

</body>
</html>