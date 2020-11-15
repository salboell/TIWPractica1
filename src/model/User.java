package model;

public class User {
	private int iduser,rol;
	private String email,password,name,surname,city,address;
	
	
	public User(int iduser,int rol, String email, String password, String name, String surname,String address, String city
			) {
		super();
		this.iduser = iduser;
		this.rol = rol;
		this.email = email;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.city = city;
		
		
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getRol() {
		return rol;
	}

	public void setRol(int rol) {
		this.rol = rol;
	}

	public int getId() {
		return iduser;
	}

	public void setId(int id) {
		this.iduser = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return password;
	}

	public void setPass(String pass) {
		this.password = pass;
	}

	public String getNombre() {
		return name;
	}

	public void setNombre(String nombre) {
		this.name = nombre;
	}

	public String getApellidos() {
		return surname;
	}

	public void setApellidos(String apellidos) {
		this.surname = apellidos;
	}

	public String getCiudad() {
		return city;
	}

	public void setCiudad(String ciudad) {
		this.city = ciudad;
	}

	@Override
	public String toString(){
	    return "Users [iduser=" + iduser + "]";
	}
	
	
	
}
