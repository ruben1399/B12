package vistas;

import modelo.articulo;

public class TIENDAFULLDEMANGO {

	public static void main(String[] args) {
		articulo artc = new articulo(1, "Satisfayer", 50);
		artc.validarArticulo();
		System.out.println(artc);
	}


}
