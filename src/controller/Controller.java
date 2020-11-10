package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import handlers.*;
import log.Log;

//Añadir más tarde los jsps creados :"/flatList","/messageList", "/userList", "/userInfo", "/index", "/flatInfo", "/flatErase", "/modifyUser", "/userErase"})
@WebServlet({"/login"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Log log = new Log();
	
    public Controller() {
        super();
    }
	
    private Map<String, IRequestHandler> hashMap = new HashMap <String, IRequestHandler>();
    
    
	public void init(ServletConfig config) throws ServletException {

		//log.write("CONTROLLER STARTED...\n");
		
		/* here we bind the handlers to each controller route when the controller initiates */
		hashMap.put("/login", new LoginHandler());
		//hashMap.put("/userList", new ShowUsersHandler());
		//hashMap.put("/flatList", new ShowFlatsHandler());
		//hashMap.put("/messageList", new ShowMessagesHandler());
		//hashMap.put("/userInfo", new UserInfoHandler());
		//hashMap.put("/index", new IndexHandler());
		//hashMap.put("/flatInfo", new FlatInfoHandler());
		//hashMap.put("/flatErase", new FlatDeleteHandler());
		//hashMap.put("/modifyUser", new ModifyUserHandler());
		//hashMap.put("/userErase", new UserEraseHandler());

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = request.getRequestURI().substring(request.getContextPath().length());
		IRequestHandler handler = hashMap.get(url);
		String urlForward = handler.process(request, response);
		if(response.isCommitted() || urlForward == null) {
			return;
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(urlForward);		
		rd.forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
