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

	public articulo[] A�adirAlCarrito() {

		int iContador = 0;
		int ContadorCarrito = 0;
		int iCantidadDeArticulos = LibFrontend.validaNumero("�Que cantidad de articulos quieres a�adir al carrito?", 0,100);
		while (iContador < iCantidadDeArticulos) {
			String articuloA�adir = LibFrontend.leer("�Que articulo quieres a�adir al carrito?");
			if (articuloA�adir.equals(atcc.Array[iContador].getsNombre())) {
				Carrito[ContadorCarrito] = atcc.Array[iContador];
				ContadorCarrito++;
			}
			iContador++;

		}
		return Carrito;
	}

	public String mostrarCarrito() {
		int cont = 0;
		String sMensaje = "";
		if (getContadorArticulosCarrito() == 0) {
			sMensaje = "No hay articulos en el carrito";

		} else {
			for (cont = 0; cont < getContadorArticulosCarrito(); cont++) {
				sMensaje += Carrito[cont] + "\n";
			}
		}
		return sMensaje;
	}

}
