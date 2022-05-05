package com.jacaranda.main;

public class Direccion {

	private Integer id;
	private String direccion;
	private String nombrePais;
	private String nombreCiudad;
	private Integer timems;
	
	public Direccion(Integer id, String direccion, String nombrePais, String nombreCiudad, Integer timems) {
		super();
		this.id = id;
		this.direccion = direccion;
		this.nombrePais = nombrePais;
		this.nombreCiudad = nombreCiudad;
		this.timems = timems;
	}

	public Integer getId() {
		return id;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getNombrePais() {
		return nombrePais;
	}

	public String getNombreCiudad() {
		return nombreCiudad;
	}

	public Integer getTimems() {
		return timems;
	}

	@Override
	public String toString() {
		return "Direccion [id=" + id + ", direccion=" + direccion + ", nombrePais=" + nombrePais + ", nombreCiudad="
				+ nombreCiudad + ", timems=" + timems + "\n";
	}
	
	
	
	
	
	
}
