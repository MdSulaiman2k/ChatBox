package ChatBox;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	
	@Override
	public void  doPost(HttpServletRequest request , HttpServletResponse response) throws IOException, ServletException {
		String loginid = request.getParameter("loginid");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
        UserResource user = new UserResource();
        RequestDispatcher rd ;
		try {
			 String user_id = user.LoginController(loginid ,password );
			 out.println(user_id + "  comes");
			 if(user_id != "null"  ) {
				 if(user_id == "0") {
					request.setAttribute("label1", "your password is wrong");
					 rd = request.getRequestDispatcher("LoginPage.jsp");
					 rd.forward(request, response);
				}
				else {
					 rd = request.getRequestDispatcher("SearchBox.jsp");
					 rd.forward(request, response);
				}
			 }else {
				 request.setAttribute("label1", " No user found ");
				 rd = request.getRequestDispatcher("LoginPage.jsp");
				 rd.forward(request, response);
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}
}