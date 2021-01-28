package ChatBox;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Override;
import java.sql.SQLException;

public class UserContainer extends HttpServlet{
	
	@Override
	public  void doPost(HttpServletRequest request , HttpServletResponse response ) throws IOException, ServletException {
		PrintWriter out = response.getWriter() ;
		String name = request.getParameter("Name") +request.getParameter("lastName") ;
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		UserResource user = new UserResource();
		RequestDispatcher rs ;
		try {
			String userId = user.ResultQuery(email);
			out.println(userId);
			if(userId == null) {
				userId = user.UserController(name , email , password);
			     if(userId != null) {
			    	 out.println("success " + userId);
			    	 rs = request.getRequestDispatcher("SearchBox.jsp");
					 rs.forward(request, response);
			     }
			     else {
			    	 out.println("fail " + userId);
			     }
			}else {
				out.println("fail");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

}
