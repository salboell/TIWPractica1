package handlers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.accessDB;
import log.Log;
import model.Administrador;

public class LoginHandler implements IRequestHandler {

	Log log = new Log();

	public String process(HttpServletRequest request, HttpServletResponse response) {

		String email = request.getParameter("admin_mail");
		String password = request.getParameter("admin_pass");

		if (email != null && password != null) {

			// BUSCAR EL ADMIN
			accessDB bd = new accessDB();
			Connection check = bd.openConnection();

			if (check == null) {
				// No connection
				return null;
			}

			ResultSet rs = bd.lookForAdmin(email);

			// CONVERTIR EN LISTA DE ADMINISTRADORES
			ArrayList<Administrador> resultados = retrieveAdminData(rs);
			bd.closeConnection();

			if (resultados.isEmpty()) {

				// request.setAttribute("fallo", "true");
				// log.write("INCORRECT ADMIN CREDENTIALS...");
				return null;
				// no se puede acceder

			} else {

				Administrador admin = resultados.get(0);

				// Comprobamos que coincidan los campos
				String emaildb = admin.getEmail();
				String passworddb = admin.getPass();

				if (!email.equals(emaildb) || !password.equals(passworddb)) {

					// request.setAttribute("fallo", "true");
					// log.write("INCORRECT ADMIN CREDENTIALS...");
					return null;
					// no se puede acceder

				} else {

					// request.setAttribute("fallo", "false");
					// mantenemos el admin para poder acceder a sus datos
					// unicamente
					request.setAttribute("admin", email);

					// log.write("CORRECT ADMIN CREDENTIALS...");
					return "messageList";
					// ir a la pagina de admin, acceso correcto
				}
			}

		}

		return null;
	}

	// OBTENER LOS DATOS DEL ADMIN
	public ArrayList<Administrador> retrieveAdminData(ResultSet rs) {
		ArrayList<Administrador> resultados = new ArrayList<Administrador>();
		try {
			while (rs.next()) {
				resultados.add(new Administrador(rs.getInt("ID"), rs.getString("EMAIL"), rs.getString("PASS")));
			}
		} catch (Exception e) {
			// log.write("ERROR WHILE RETRIEVING ADMINISTRADOR DATA...");
		}
		return resultados;
	}

}
