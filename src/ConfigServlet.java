
		import java.io.IOException;
		import java.io.PrintWriter;
		import java.util.Enumeration;

		import javax.servlet.ServletConfig;
		import javax.servlet.ServletException;
		import javax.servlet.http.HttpServlet;
		import javax.servlet.http.HttpServletRequest;
		import javax.servlet.http.HttpServletResponse;


public class ConfigServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ServletConfig config = getServletConfig();

		String lname = config.getServletName();
		String driver_Class = config.getInitParameter("driver_Class");
		String driver_URL = config.getInitParameter("driver_URL");
		String db_User_Name = config.getInitParameter("db_User_Name");
		String db_Password = config.getInitParameter("db_Password");
		Enumeration<String> e = config.getInitParameterNames();
		String param_Names = "";
		while(e.hasMoreElements()) {
		param_Names = param_Names+e.nextElement()+"<br>";
		}

		out.println("<html>");
		out.println("<body>");
		out.println("<h3>Servlet Configuration Details</h3>");
		out.println("<table border='1'>");
		out.println("<tr><th>Parameter Names</th><th>Parameter Values</th></tr>");
		out.println("<tr><td>driver_Class</td><td>"+driver_Class+"</td></tr>");
		out.println("<tr><td>driver_URL</td><td>"+driver_URL+"</td></tr>");
		out.println("<tr><td>db_User_Name</td><td>"+db_User_Name+"</td></tr>");
		out.println("<tr><td>db_Password</td><td>"+db_Password+"</td></tr>");
		out.println("<tr><td>Parameter Names</td><td>"+param_Names+"</td></tr>");
		out.println("<tr><td>Servlet Logical Name</td><td>"+lname+"</td></tr>");
		out.println("</table></body></html>");
		}



}
