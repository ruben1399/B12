package vistas;

import modelo.articulo;
import controller.ArticuloController;
import controller.ICrud;

public class TIENDAFULLDEMANGO {

	public static void main(String[] args) {
		/*articulo artc = new articulo(1, "Satisfayer", 50);
		artc.validarArticulo();
		System.out.println(artc);*/
		ICrud atcc = new ArticuloController();
		articulo atc = new articulo (1, "Satisfayer", 50);
		
	}


}
