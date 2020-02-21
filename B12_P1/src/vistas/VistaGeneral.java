package vistas;

import controller.ArticuloController;
import controller.TIENDA;

public class VistaGeneral {

	public static void main(String[] args) {
		ArticuloView atcw = new ArticuloView();
		ArticuloController atcc = new ArticuloController();
		TIENDA TND = new TIENDA();
		atcw.CreareIntroducirArticulos(atcc);
		TND.AñadirAlCarrito();
		TND.mostrarCarrito();
		
		
		

	}

}
