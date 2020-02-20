package controller;

import modelo.articulo;
import controller.ArticuloController;

public class TIENDA {
	private TIENDA[] ArrayCarrito;
	private int ContadorArticulosCarrito;
	private final int MAXARTICCARRITO=100;
	ArticuloController artcc = new ArticuloController();

	
	
	public TIENDA() {
		super();
		ArrayCarrito = new TIENDA[MAXARTICCARRITO];
		ContadorArticulosCarrito = 0;
	}

	public TIENDA[] getArrayCarrito() {
		return ArrayCarrito;
	}

	public int getContadorArticulosCarrito() {
		return ContadorArticulosCarrito;
	}
public void añadirCarrito(articulo Objeto){
	artcc.search()
}

}
