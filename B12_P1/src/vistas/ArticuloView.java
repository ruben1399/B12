package vistas;

import controller.ArticuloController;
import medac.validaciones.LibFrontend;
import modelo.articulo;

public class ArticuloView {

	public static void main(String[] args) {

		ArticuloController atcc = new ArticuloController();

		CreareIntroducirArticulos(atcc);

		System.out.println(atcc.mostrarArticulos());
	}

	private static void CreareIntroducirArticulos(ArticuloController atcc) {
		int NumeroCrearArticulos = LibFrontend.validaNumero("¿Cuantos Articulos quieres crear?", 1, 50);
		int iContador = 0;
		while (iContador < NumeroCrearArticulos) {
			atcc.add(CrearArticulo());
			iContador++;
		}
	}

	private static articulo CrearArticulo() {
		int IdArticulo = LibFrontend.validaNumero("Dime una ID", 1, 50);
		String sNombre = LibFrontend.leer("Dime el nombre de Articulo");
		int iPrecio = LibFrontend.validaNumero("Dime el precio", 0, 50000);
		articulo atc = new articulo(IdArticulo, sNombre, iPrecio);
		return atc;
	}

}
