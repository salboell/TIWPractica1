package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import database.pruebaddbb;
import model.User;

import java.util.*;

import javax.sql.DataSource;
public class UsuarioDAO {

    private DataSource origenDatos;

    public UsuarioDAO(DataSource origenDatos){

        this.origenDatos=origenDatos;

    }



	public  List<User> list() throws SQLException {
		
		List<User> listaUsuarios = new ArrayList<>();

		Connection miConex=DriverManager.getConnection("jdbc:mysql://localhost:3306/practica1", "root", "rootroot");

        Statement miState = miConex.createStatement();

		String sql = "SELECT * FROM USER";
		
		ResultSet result = miState.executeQuery(sql);

		while (result.next()) {

			int iduser = result.getInt("iduser");
			int rol = result.getInt("rol");
			String email = result.getString("email");
			String password = result.getString("password");
			String name = result.getString("name");
			String surname = result.getString("surname");
			String city = result.getString("city");
			String address = result.getString("address");

			User usuario = new User( iduser, rol,  email,  password,  name,  surname, address,  city);
			listaUsuarios.add(usuario);
		}

		miConex.close();
		return listaUsuarios;
	}
	
/*	public User createUsuario(int iduser,int rol, String email,  password,  name,  surname, address,  city) {
		User usuario = new User(iduser, rol,  email,  password,  name,  surname, address,  city);
		
		return usuario;
		
	}
	
	*/
	
	
/*
	public User findUser(String email) {

		List<User> listaUsuarios;
		try {
			listaUsuarios = this.list();
			int indx = 0;
			User encontrado;
			for (User user : listaUsuarios) {
				if (user.getEmail().equals(email)) {
					encontrado = listaUsuarios.get(indx);
					return encontrado;
				} else {
					indx++;
				}
			}
			return null;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
	
	
*/
	
}

