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
		
		
	int	x = Integer.parseInt(request.getParameter("lado1"));
	int	y = Integer.parseInt(request.getParameter("lado2"));
	int	z = Integer.parseInt(request.getParameter("lado3"));
		
		if (x + y > z|| y + z > x|| x + z > y) {
			if (x > 0 && y > 0 && z > 0)
				if (x == y && x == z){
					response.getWriter().println("Três lados iguais. É um Triangulo Equilatero");
				}else if(x == y || x == z || y == z){
					response.getWriter().println("Dois lados iguais. É um Triangulo Isosceles");
				}else if (x != y || x != z || y != z){
					response.getWriter().println("Três lados diferentes. É um Triangulo Escaleno");
				}else {
					response.getWriter().println("Não é Triangulo");
				}
		}
	// VERIFICAR SE É QUADRADO OU RETANGULO	
		
		if( x == 0 || y == 0 || z == 0) {
			if(x == y || y == z || x == z) {
				response.getWriter().println("Area de um Quadrado");
			}else if(x != y || y != z || x != z) {
				response.getWriter().println("Area de um Retangulo");
			}
		}
		
	

		
	//	VERIFICA SE É RETA
		if(x == 0 && y == 0 && z > 0) {
			response.getWriter().println("É uma reta");
		}else if(y == 0 && z == 0 && x > 0 ) {
			response.getWriter().println("É uma reta");
		}else if(x == 0 && z == 0 && y > 0 ) {
			response.getWriter().println("É uma reta");
		}
	}
}
		
	



