package example1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
import javax.xml.ws.soap.AddressingFeature.Responses;

@WebServlet("/exam")
public class HelloServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.println("hello world");
		
		String action = request.getParameter("action");	
		
		if(action.equals("printGugu1")) {
			for(int i = 2; i < 10; i++) {
				for(int j = 1; j < 10; j++ ) {
					out.println(i + "*" + j + "=" + i * j + "<br/>");
				}
			}
		}
		else if(action.equals("printGugu2")) {
			
			int limit = Integer.parseInt(request.getParameter("limit")); 
			
			for(int i = 2; i <= limit; i++) {
				for(int j = 1; j < 10; j++ ) {
					out.println(i + "*" + j + "=" + i * j + "<br/>");
				}
			}
		}
		else if(action.equals("hello")) {
			out.println("<html>");
			out.println("<head>");
			out.println("</head>");
			out.println("<body>");
			for(int i = 0 ; i < 5; i++) {
				out.println("<h1>hello world!!</h1>");
			}
			out.println("</body>");
			out.println("</html>");
		}

	}

}

