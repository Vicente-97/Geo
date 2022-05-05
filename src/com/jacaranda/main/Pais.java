package com.jacaranda.main;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

public class Pais {
	
	private  Integer id;
	private  String name;
	private LocalDateTime fecha;
	
	
	


	public Pais(Integer id, String name, LocalDateTime fecha) {
		super();
		this.id = id;
		this.name = name;
		this.fecha = fecha;
	}





	public Integer getId() {
		return id;
	}





	public String getName() {
		return name;
	}





	public LocalDateTime getFecha() {
		return fecha;
	}





	@Override
	public String toString() {
		return "Pais id: " + id+ " Nombre del país :  " + name+  "\n";
	}
	
	
	
	


	
	
	
	
	
	
	
	
}
