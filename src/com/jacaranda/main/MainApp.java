package com.jacaranda.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainApp {

	public static void main(String[] args) throws IOException {
		//System.out.println(cargarFicheroPais());
		//System.out.println(cargarFicheroCiudad());
		System.out.println(cargarFicheroDirrecciones());

	}
	private static List<Pais> cargarFicheroPais () throws IOException{
		String linea;
		List<Pais> lista = new ArrayList<>();
		
		try {
			
			File file = new File("./Ficheros/country(1).txt");
			FileReader fr = new FileReader(file);
			BufferedReader br= new BufferedReader(fr);
			br.readLine();
			linea= br.readLine();
			
			while(linea!=null) {
				String[] info =linea.split(",");
				Pais p1 = new Pais(Integer.valueOf(info[0]), info[1], null);	
				
				lista.add(p1);
				
				linea=br.readLine();
			}
			br.close();
			fr.close();
		}catch (FileNotFoundException ex) {
			System.out.println("No existe el archivo");
		}
		
		return lista;
		
	}
	
	private static List<City> cargarFicheroCiudad () throws IOException{
		List<City> listaCiudades = new ArrayList<>();
		String linea;
		try {
			File file = new File("./Ficheros/city(1).txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			br.readLine();
			linea= br.readLine();
			
			while(linea!=null ) {
				String[]info =linea.split(",");
				City ciudad = new City(Integer.valueOf(info[0]), info[1], Integer.valueOf(info[2]), null);
				listaCiudades.add(ciudad);
				
				
				linea=br.readLine();
			}
			
			br.close();
			fr.close();
			
		}catch (FileNotFoundException ex) {
			System.out.println("No esta presente el archivo");
		}
		
		
		
		return  listaCiudades;
	}
	
	
	private static List<Direccion> cargarFicheroDirrecciones () throws IOException{
		List<Direccion> listaDirecciones = new ArrayList<>();
		String linea;
		try {
			File file = new File("./Ficheros/address(1).txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			br.readLine();
			linea= br.readLine();
			
			while(linea!=null ) {
				if(linea==null) {
					linea=br.readLine();
				}
				String[]info =linea.split(",");
				Direccion direccion = new Direccion(Integer.valueOf(info[0]), info[1], null, null, null);                  
				listaDirecciones.add(direccion);
				
				
				linea=br.readLine();
			}
			
			br.close();
			fr.close();
			
		}catch (FileNotFoundException ex) {
			System.out.println("No esta presente el archivo");
		}
		
		return  listaDirecciones;
	}
}
