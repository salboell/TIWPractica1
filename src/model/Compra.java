package model;

import java.util.Date;

public class Compra {
	
	private int id, producto, comprador;
	private Date fecha_compra;

	public Compra(int id, int producto, int comprador, Date fecha_compra) {
		super();
		this.id = id;
		this.producto = producto;
		this.comprador = comprador;
		this.fecha_compra = fecha_compra;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProducto() {
		return producto;
	}

	public void setProducto(int producto) {
		this.producto = producto;
	}

	public int getComprador() {
		return comprador;
	}

	public void setComprador(int comprador) {
		this.comprador = comprador;
	}

	public Date getFecha_compra() {
		return fecha_compra;
	}

	public void setFecha_compra(Date fecha_compra) {
		this.fecha_compra = fecha_compra;
	}
	
	
	
	
	
}
