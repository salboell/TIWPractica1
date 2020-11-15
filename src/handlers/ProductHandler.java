package handlers;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;

public class ProductHandler implements IRequestHandler{
	
	public String process(HttpServletRequest request, HttpServletResponse response) {
		
		
		//ID del producto
		String id = request.getParameter("id");
		
		HttpSession session = request.getSession();
		User usuario = (User) session.getAttribute("loggedin");
		
		//Carrito está en la sesión
		HashMap<Integer, Integer> carrito = (HashMap<Integer, Integer>) session.getAttribute("carrito");
		if(carrito == null) {
			carrito = new HashMap<Integer, Integer>();
			
		}else {
			//Seguir
			carrito.get(name);
		}
		
		
	
		 
		
		
		
		
		
		
		return null;
		
	}

}
