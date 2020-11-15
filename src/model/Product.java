package model;

public class Product {
	
	private int idproduct, price;
	private String name, description,category, status,owner, photo;
	
	
	
	
	public Product(int idproduct, int price, String name, String description, String category, String status, String owner,String photo) {
		super();
		this.idproduct = idproduct;
		this.price = price;
		this.name = name;
		this.description = description;
		this.category = category;
		this.status = status;
		this.owner = owner;
		this.photo= photo;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public int getId() {
		return idproduct;
	}


	public void setId(int id) {
		this.idproduct = id;
	}


	public int getPrecio() {
		return price;
	}


	public void setPrecio(int precio) {
		this.price = precio;
	}


	public String getTitulo() {
		return name;
	}


	public void setTitulo(String titulo) {
		this.name = titulo;
	}


	public String getDescripcion() {
		return description;
	}


	public void setDescripcion(String descripcion) {
		this.description = descripcion;
	}


	public String getCategoria() {
		return category;
	}


	public void setCategoria(String categoria) {
		this.category = categoria;
	}


	public String getEstado() {
		return status;
	}


	public void setEstado(String estado) {
		this.status = estado;
	}

}
