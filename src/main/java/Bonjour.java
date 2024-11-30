

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Bonjour
 */
@WebServlet("/Bonjour")
public class Bonjour extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Bonjour() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
        PrintWriter p = response.getWriter();
        
        p.println("<h1>Bonjour</h1>");
        
        p.println("<p>la date est : </p>");
        p.println("<p>" + new Date() + "</p>");
        

        int N = 10; 
        int M = 3;  
        
        p.println("<table border='1'>");
        for(int i = 0; i < N; i++) {
            p.println("<tr>");
            for(int j = 0; j < M; j++) {
                p.println("<td>ligne " + i + ", colone " + j + "</td>");
            }
            p.println("</tr>");
        }
        p.println("</table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	

}
