package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.User;

public class pruebaddbb {
	public static void main(String[] args) {

	    try{
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

	       //ResultSet miResult=miState.executeQuery("SELECT * FROM USER");

	        while(result.next()){

	            System.out.println(result.getString("name"));
	            }
	        

			}  

	    }catch(Exception e){

	        System.out.println("NO CONECTA");

	        e.printStackTrace();

	    }


}
}
