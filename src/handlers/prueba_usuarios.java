package handlers;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import DAO.UsuarioDAO;
import model.User;

/**
 * Servlet implementation class prueba_usuarios
 */
@WebServlet("/prueba_usuarios")
public class prueba_usuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UsuarioDAO UsuarioDAO;

	@Resource (name="jdbc/User")
	private DataSource miPool;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    
    @Override
    public void init() throws ServletException{
        super.init();

        try{

            UsuarioDAO=new UsuarioDAO(miPool);

        }catch(Exception e){
            throw new ServletException(e);
        }
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<User> listaUsuarios;

		try{

			listaUsuarios=UsuarioDAO.list();

		    request.setAttribute("LISTAUSUARIOS", listaUsuarios);

		    RequestDispatcher miDispatcher=request.getRequestDispatcher("/prueba_usuarios.jsp");

		    miDispatcher.forward(request, response);

		    }catch(Exception e){

		        e.printStackTrace();
		    }
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
