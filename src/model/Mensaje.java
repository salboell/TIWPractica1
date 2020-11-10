package model;

import java.util.*;

public class Mensaje {

	
	private int id, emisor, receptor;
	private Date fecha;
	private String contenido;
	
	public Mensaje(int id, int emisor, int receptor, Date fecha, String contenido) {
		super();
		this.id = id;
		this.emisor = emisor;
		this.receptor = receptor;
		this.fecha = fecha;
		this.contenido = contenido;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmisor() {
		return emisor;
	}

	public void setEmisor(int emisor) {
		this.emisor = emisor;
	}

	public int getReceptor() {
		return receptor;
	}

	public void setReceptor(int receptor) {
		this.receptor = receptor;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
}
