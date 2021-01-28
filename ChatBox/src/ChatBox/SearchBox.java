package ChatBox;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.http.*;

public class SearchBox extends HttpServlet {
	public CustomerDetails customer ;
	
	public void doPost(HttpServletRequest request , HttpServletResponse response ) throws IOException {
		String username = request.getParameter("search");
		PrintWriter out = response.getWriter(); 
		String name = null ;
		  UserResource user = new UserResource();
		  String userId =null ;
		  try {
			userId = user.ResultQuery(username) ;
			if(userId == "null") {
				out.println("not found ");
			}
			if(userId != "null") {
				customer = user.GetUser(username) ;
				userId = customer.getUser_id() ;
				name = customer.getName() ;
				username = customer.getuserName() ;
				out.println("<html>\r\n" + 
						"<head>\r\n" + 
						"<meta charset=\"ISO-8859-1\">\r\n" + 
						"<title>Search Box</title>\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"</head>\r\n" + 
						"<body align=\"left\">"
						+ "<style type=\"text/css\">	#button\r\n" + 
						"		{\r\n" + 
						"			margin-top: 20px;\r\n" + 
						"		    padding-left: 5px;\r\n" + 
						"		    padding-right: 5px;\r\n" + 
						"		    background: #0072fff7;\r\n" + 
						"		    border-radius: 6px;\r\n" + 
						"		    border: none;\r\n" + 
						"		    color: white;\r\n" + 
						"		    padding-top: 3px;\r\n" + 
						"		    padding-bottom: 3px;\r\n" + 
						"		}\r\n" + "#buttontype\r\n" + 
						"		{\r\n" + 
						"			margin-top: 20px;\r\n" + 
						"		    padding-left: 15px;\r\n" + 
						"		    padding-right: 15px;\r\n" + 
						"		    background: white;\r\n" + 
						"		    border-radius: 6px;\r\n" + 
						"		    border: none;\r\n" + 
						"		    color: #0072fff7;\r\n" + 
						"		    padding-top: 3px;\r\n" + 
						"		    padding-bottom: 3px;\r\n" + 
						"		}\r\n" +
								"		#search\r\n" + 
								"		{\r\n" + 
								"		     margin-top: 30px;\r\n" + 
								"		    margin-right : 30px;\r\n" + 
								"		    margin-left : 30px;\r\n" + 
								"			padding-left: 10px;\r\n" + 
								"			padding-right: 10px;\r\n" + 
								"			padding-bottom: 10px;\r\n" + 
								"		    padding-top: 10px;\r\n" + 
								"		    border-radius: 9px;\r\n" + 
								"		    width: 175px;\r\n" + 
								"		    border: 1px solid red;\r\n" + 
								"		}\r\n" + 
								"		\r\n" + 
								"" +
						"</style>\n<button id=\"button\"><a  style=\"text-decoration: none;color:white\" href=\"SearchBox.jsp\" target=\"_self\">Search</button></a><br><br>");
				
				out.println("<font size=+2>"+name + "</font> <br> <font size =-1>" + username + "</fonr>" );
				out.println("<br>"
						+ "<form action = \"MessageBox\" method=\"post\"><br> " + "<abbr title=\"enter your Messages\"><input  type=\"text\" placeholder=\"write your Message \" name=\"Message\" style =\" " + 
								"		    border-radius: 9px;" + 
								"		    width: 175px;\"></abbr>" + "<button id=\"button\" value =\""+userId+"\" name =\"userId\">Send Message</button>");
				out.println("</form>\n</body>\r\n" + 
						"</html>") ;
				
			}else {
				out.println("no userid like that ");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
