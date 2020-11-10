package model;

public class Usuario {
	private int id;
	private String email,pass,nombre,apellidos,ciudad;
	private boolean vendedor;
	
	public Usuario(int id, String email, String pass, String nombre, String apellidos, String ciudad,
			boolean vendedor) {
		super();
		this.id = id;
		this.email = email;
		this.pass = pass;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.ciudad = ciudad;
		this.vendedor = vendedor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public boolean isVendedor() {
		return vendedor;
	}

	public void setVendedor(boolean vendedor) {
		this.vendedor = vendedor;
	}
	
	
	
}
