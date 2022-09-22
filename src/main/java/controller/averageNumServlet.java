package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AvgCalc;

/**
 * Servlet implementation class averageNumServlet
 */
@WebServlet("/averageNumServlet")
public class averageNumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public averageNumServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String numOne = request.getParameter("numOne");
		String numTwo = request.getParameter("numTwo");
		String numThree = request.getParameter("numThree");
		
		AvgCalc calculator = new AvgCalc(Integer.parseInt(numOne), Integer.parseInt(numTwo), Integer.parseInt(numThree));
		
		request.setAttribute("AverageCalculator", calculator);
		
		getServletContext().getRequestDispatcher("/calcResult.jsp").forward(request, response);
	}

}
