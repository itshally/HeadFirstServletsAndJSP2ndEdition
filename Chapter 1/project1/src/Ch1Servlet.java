import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ch1Servlet")
public class Ch1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Ch1Servlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		Date today = new Date();
		
		out.println("<html>" + 
						"<body>" +
							"<h1 align=center>HF\'s Chapter 1 Servlet</h1>" +
							"<br>" + today +
						"</body>" +
					"</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
