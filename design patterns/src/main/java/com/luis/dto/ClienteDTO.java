
package com.luis.dto;

import java.io.Serializable;

public class ClienteDTO  implements Serializable{

	private static final long serialVersionUID = -5367484877234704334L;
	
	private int id;
	private int cedula;
	private String nombre;
	private String apellido;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
