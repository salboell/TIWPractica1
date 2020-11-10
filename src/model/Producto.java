package model;

public class Producto {
	
	private int id, precio;
	private String titulo, descripcion,categoria, estado;
	//Imagen ??
	//Categoría : (a seleccionar entre un conjunto cerrado de categorías cerradas)
	
	
	public Producto(int id, int precio, String titulo, String descripcion, String categoria, String estado) {
		super();
		this.id = id;
		this.precio = precio;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.estado = estado;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}

}
