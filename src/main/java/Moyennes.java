

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Moyennes
 */
@WebServlet("/Moyennes")
public class Moyennes extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Moyennes() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
        PrintWriter p = response.getWriter();
        
        int N = 5; 
        
        p.println("<html><body>");
        p.println("<h2>Etudiants et moyennes</h2>");
        p.println("<table border='1'>");
        
        
        p.println("<tr>");
        p.println("<th>Nom</th>");
        p.println("<th>Moyenne</th>");
        p.println("</tr>");
        
       
        for(int i = 0; i < N; i++) {
            p.println("<tr>");
            p.println("<td>nom" + (i+1) + "</td>");
            
            double moyenne = Math.random() * 20;
            p.println("<td>" + String.format("%.2f", moyenne) + "</td>");
            
            p.println("</tr>");
        }
        
        p.println("</table>");
        p.println("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
