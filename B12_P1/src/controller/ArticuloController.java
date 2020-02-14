package controller;

import modelo.articulo;

public class ArticuloController {
	private articulo[] arrayArticulo;
	private final int MAXARTICULO = 50;
	private int contadorArticulos;
	
	
	
	public ArticuloController(articulo[] arrayArticulo, int contadorArticulos) {
		 arrayArticulo= new articulo[MAXARTICULO];
		 contadorArticulos=0;
	}
	public articulo[] getArrayArticulo() {
		return arrayArticulo;
	}
	public void setArrayArticulo(articulo[] arrayArticulo) {
		this.arrayArticulo = arrayArticulo;
	}
	public int getContadorArticulos() {
		return contadorArticulos;
	}
	public void setContadorArticulos(int contadorArticulos) {
		this.contadorArticulos = contadorArticulos;
	}
	
	////CRUD
	public void addArticulo() {
		
	}

}
