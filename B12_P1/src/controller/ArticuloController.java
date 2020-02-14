package controller;

import modelo.articulo;

public class ArticuloController {
	private articulo[] arrayArticulo;
	private final int MAXARTICULO = 50;
	private int contadorArticulos;
	
	
	
	public ArticuloController() {
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
	public int search(articulo Object) {
		int iPosicion = -1;
		int iContador = 0;
		while(iPosicion == -1 && iContador < MAXARTICULO) {
			if(Object.equals(arrayArticulo[iContador])) {
				iPosicion = iContador;
			}
			iContador++;
		}
		return iPosicion;
	}

	
	public boolean add(articulo Object) {
		boolean bExito = false;
		if(contadorArticulos < MAXARTICULO && search(Object) == -1) {
			arrayArticulo[contadorArticulos] = Object;
			contadorArticulos++;
			bExito = true;
		}
		return bExito;
	}
	public boolean remove(articulo Object) {
	boolean bExito = false;
	int iPosicion = search(Object);
	if(iPosicion != -1) {
		for(int i=iPosicion+1; i< contadorArticulos; i++) {
			arrayArticulo[i-1] = arrayArticulo[i];	
		}
		arrayArticulo[contadorArticulos] = null;
		contadorArticulos--;
		bExito = true;
	}
	return bExito;
}
}
