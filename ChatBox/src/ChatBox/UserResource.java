package ChatBox;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import ChatBox.CustomerDetails;

public class UserResource {
	   String db_url = "jdbc:mariadb://localhost:8888/ChatBox";
	   String db_user_name = "root";
	   String db_user_pass = "sweetsulaiman";
	   Connection con  ;
	   Statement st   ;
	   ResultSet rs ;
	   
	   public UserResource() {
		   try {
				
				Class.forName("java.sql.DriverManager");
				con = DriverManager.getConnection(db_url,db_user_name,db_user_pass);
				 st = con.createStatement() ;
			} catch (SQLException | ClassNotFoundException e  ) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	   
	   public String LoginController(String Username , String Password) throws SQLException {
		    String Userid = "null";
		    
		    if(ResultQuery(Username) != "null") {
		    	if(Password.equals(rs.getString("password"))) {
		    		Userid = rs.getString("userId");
		    	}
		    	else {
		    		Userid = "0";
		    	}
		    }
		    return Userid ;
		   }
	   
	   public String UserController(String name , String mail , String password) throws SQLException {
		   
		   String userId = null ;
		   
		   if(name != "" && mail != "" && password != "") 
		  {
		   int ns =  st.executeUpdate("insert into userContainer(NAME , UserName , password) values(\"" + name +"\" , \"" + mail +"\" , \"" + password + "\" )" );
		   if(ns>0) 
			   userId = ResultQuery(mail) ;
		  }
		   return userId ;
	   }
		
      public String ResultQuery(String Username) throws SQLException {
    	  rs = st.executeQuery("select * from userContainer where userName = \"" + Username + "\" ;");
    	  String userid = null;
    	  if(rs.next()) {
    		  userid = rs.getString("userId") ;
    	  }
    	  return userid ;
      }
    public String getMessage( String userid ) throws SQLException {
    	rs = st.executeQuery("select message,MessageSent from unseenMessage where id =\"" + userid + "\"") ;
    	String message = null , time = null  ;
    	if(rs.next()) {
    	message = rs.getString("Message");
    	time   = rs.getString("MessageSent");
    	}
    	int delete =  st.executeUpdate("delete from unseenMessage where id = \"" + userid + "\" and   MessageSent = \"" + time +"\""  );
    	return message ;
    }
    
    public String sendMessage(String userid , String message) throws SQLException {
    	int rs = st.executeUpdate("INSERT INTO unseenMessage(id , Message  ) VALUES( "+userid + " , \""+ message +"\")");
    	String imprt = null ;
    	if(rs>0) {
    		imprt = "success";
    	}
    	return imprt;
    }
      
    public CustomerDetails GetUser(String Username) throws SQLException {
    	 CustomerDetails customer ;
    	rs = st.executeQuery("select NAME ,userName ,userId  from userContainer where username = \"" + Username + "\" ;");
    	if(rs.next()) {
    		customer = new CustomerDetails(rs.getString("NAME"), rs.getString("userName"),rs.getString("userId"));
		    return customer ;
    	   }
    	return null ;
    }

}
