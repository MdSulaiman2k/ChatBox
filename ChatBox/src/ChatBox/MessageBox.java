package ChatBox;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;


public class MessageBox extends HttpServlet{
	
	@Override
	public void doPost(HttpServletRequest request , HttpServletResponse response ) throws IOException, ServletException {
		UserResource user = new UserResource();
		String userId = request.getParameter("userId");
	    RequestDispatcher rs ;
		PrintWriter out = response.getWriter() ;
		String message = request.getParameter("Message") ;
		try {
			if(user.ResultQuery(userId) != "null") {
				user.sendMessage(userId, message) ;
				request.setAttribute(userId, userId);
				rs = request.getRequestDispatcher("SearchBox.jsp");
				rs.forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		}
	

}
