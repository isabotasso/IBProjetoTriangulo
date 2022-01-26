package br.com.rd.queroserdev.IBProjetoTriangulo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IBProjetoTriangulo
 */
@WebServlet("/IBProjetoTriangulo")
public class IBProjetoTriangulo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IBProjetoTriangulo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		int x, y, z;
		
		x = Integer.parseInt(request.getParameter("lado1"));
		y = Integer.parseInt(request.getParameter("lado2"));
		z = Integer.parseInt(request.getParameter("lado3"));
		
		
		if (x == y && x == z){
			response.getWriter().println("Três lados iguais. É um Triangulo Equilatero");
		}else if(x == y || x == z || y == z){
			response.getWriter().println("Dois lados iguais. É um Triangulo Isosceles");
			}else {
			response.getWriter().println("Três lados diferentes. É um Triangulo Escaleno");
			}

		
		
		
		
	}


}
