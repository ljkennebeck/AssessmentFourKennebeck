package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.RockPaperScissors;

/**
 * Servlet implementation class rockPaperScissors
 */
@WebServlet("/rockPaperScissorsServlet")
public class rockPaperScissorsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public rockPaperScissorsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String playerOne = request.getParameter("playerOne");
		
		RockPaperScissors rps = new RockPaperScissors(playerOne);
		
		request.setAttribute("RPS", rps);
		
		getServletContext().getRequestDispatcher("/rpsResult.jsp").forward(request, response);
	}

}
