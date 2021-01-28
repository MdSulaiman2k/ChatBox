package ChatBox;

import java.sql.*;
import java.util.*;

public class BillResources {
	String db_url = "jdbc:mariadb://localhost:8888/Accounts";
	   String db_user_name = "root";
	   String db_user_pass = "sweetsulaiman";
	   Connection con  ;
	   Statement st   ;
	   ResultSet rs ;
	   
	   public BillResources() {
		   try {
				
				Class.forName("java.sql.DriverManager");
				con = DriverManager.getConnection(db_url,db_user_name,db_user_pass);
				 st = con.createStatement() ;
			} catch (SQLException | ClassNotFoundException e  ) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	   
	   public  ArrayList<String> details() throws SQLException{
		   ArrayList<String> details = new ArrayList<>();
		   rs = st.executeQuery("select * from details");
		   String Name ;
		   while(rs.next()) {
			   Name = rs.getString("Name");
			   details.add(Name);
			}
 		   return details ;
	   }
}
