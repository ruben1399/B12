package controller;

import modelo.articulo;
import controller.ArticuloController;
import medac.validaciones.LibFrontend;

public class TIENDA {
	private articulo[] Carrito;
	private int ContadorArticulosCarrito;
	private final int MAXARTICCARRITO = 100;
	ArticuloController atcc = new ArticuloController();

	public TIENDA() {
		super();
		Carrito = new articulo[MAXARTICCARRITO];
		ContadorArticulosCarrito = 0;
	}

	public articulo[] getCarrito() {
		return Carrito;
	}

	public int getContadorArticulosCarrito() {
		return ContadorArticulosCarrito;
	}



}
