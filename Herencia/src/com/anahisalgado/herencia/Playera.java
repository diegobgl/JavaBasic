package com.anahisalgado.herencia;

public class Playera extends Ropa {
	
	public Playera(int id, double precio, String talla, String color, String corte) {
		super(id, precio, talla, color); //SuperClase
		// TODO Auto-generated constructor stub
		this.corte = corte;
	}
	
	private String corte;
	
	public String getCorte() {
		return corte;
	}
	public void setCorte(String corte) {
		this.corte = corte;
	}
	@Override
	public void mostrarDatos(String nombreClase) {
		// TODO Auto-generated method stub
		super.mostrarDatos(nombreClase);
		System.out.println("corte: " + corte);
	}
	
	
	
	
}
