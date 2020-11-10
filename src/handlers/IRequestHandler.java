package handlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IRequestHandler {
	
	public String process(HttpServletRequest request, HttpServletResponse response); 

}
