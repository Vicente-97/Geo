package com.jacaranda.main;

import java.time.LocalDateTime;

public class City {

	private  Integer id;
	private  String name;
	private Integer idpais;
	private LocalDateTime fecha;
	
	public City(Integer id, String name, Integer idpais, LocalDateTime fecha) {
		super();
		this.id = id;
		this.name = name;
		this.idpais = idpais;
		this.fecha = fecha;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getIdpais() {
		return idpais;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	@Override
	public String toString() {
		return " Codigo de la ciudad: "+ id+ " Nombre de la ciudad "+ name+
				" Codigo del país :"+ idpais+"\n";
	}
	
	
	
}
