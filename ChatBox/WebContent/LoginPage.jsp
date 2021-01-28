<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>login page</title>
</head>
<body align="center">
    
	<style type="text/css">
	    h3{
	       font-family :"Times New Roman ",Times,serif;
	    }
		form
		{
			display: inline-block;
			margin-top: 95px;
			box-shadow: 0 0 0 2px rgba(0, 0, 0, 0.15);
			padding: 24px;
		}
		
		
		#username
		{
			padding-left: 30px;
			padding-right: 30px;
			padding-bottom: 10px;
		    padding-top: 8px;
		    border-radius: 9px;
		    width: 175px;
		    
		    border: 1px solid #CCC;
		}
		#password
		{
			padding-left: 30px;
			padding-right: 30px;
		    padding-top: 8px;
		    border-radius: 9px;
		    width: 175px;
		    border: 1px solid #CCC;
		    padding-bottom: 10px;
		}
		#button
		{
			margin-top: 20px;
		    padding-left: 66px;
		    padding-right: 66px;
		    background: #0072fff7;
		    border-radius: 6px;
		    border: none;
		    color: white;
		    padding-top: 3px;
		    padding-bottom: 3px;
		}
		
		#show
		{
		   margin-top: 10px;
		   margin-right:10px ;
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
	
	<form action="login"  method="post">
	    
	    
	    <h3 >Login page<h3><br><br>
		<abbr title="enter your userid"><input id="username" type="Username" placeholder="Username" name="loginid"></abbr><pre style="color : red">${label}</pre>
		<abbr title="enter your passwoed"><input id="password" type="password" placeholder="Password" name="password"></abbr> <pre style="color :red ;size :3">${label1}</pre>
	    <label class="radio" >
	   <pre style="margin-right:100px;"><input  id="show" type="checkbox" onclick = "toggle()">show password</pre>
		</label><br>
		<button id="button" style ="margin-top: 10px;">login</button>
	</form>
	<br>
   <button id="button"><a  style="text-decoration: none;color:white" href="CreateAccount.jsp" target="_self">CreateAccount</button></a><br><br><br>
  

</body>
</html>