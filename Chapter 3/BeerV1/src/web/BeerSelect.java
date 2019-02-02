package web;
import model.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BeerSelect")
public class BeerSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public BeerSelect() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//this method comes from the ServletRequest interface
		//Notice that the argument matches the value of the "name"
		//attribute in the HTML's <select> tag
		String c = request.getParameter("color");
		
		//instantiate the BeerExpert class and call getBrands()
		BeerExpert be = new BeerExpert();
		List result = be.getBrands(c);
		
		//add an attribute to the request object for the JSP to use.
		//Notice the JSP is looking for "styles"
		request.setAttribute("styles", result);
		
		//instantiate a request dispatcher for the JSP
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		
		//use the request dispatcher to ask the Container to crank up the JSP
		//sending it the request and response
		view.forward(request, response);
	}

}
