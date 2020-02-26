package vistas;

import controller.ArticuloController;
import medac.validaciones.LibFrontend;
import modelo.articulo;

public class ArticuloView {

	public static void main(String[] args) {

		ArticuloController atcc = new ArticuloController();
		CreareIntroducirArticulos(atcc);
		System.out.println(atcc.mostrarArticulos());
		removeArticulo(atcc);
		System.out.println(atcc.mostrarArticulos());

	}

	public static void CreareIntroducirArticulos(ArticuloController atcc) {
		int NumeroCrearArticulos = LibFrontend.validaNumero("¿Cuantos Articulos quieres crear?", 1, atcc.MAXARTICULO);
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

	public static void updateArticulo(ArticuloController atcc) {
		String sNombreNew = LibFrontend.leer("Dime nuevo cliente o la modificacion que quieres realizar");
		int iPos = searchArticulo(atcc);
		atcc.getArray()[iPos].setsNombre(sNombreNew);

	}

	public static int searchArticulo(ArticuloController atcc) {
		int iPosicion = 0;
		int iContador = 0;
		String sNombre = LibFrontend.leer("Dime un nombre de articulo ");
		while (iContador < atcc.getContador()) {
			if (sNombre.equals(atcc.getArray()[iContador].getsNombre())) {
				iPosicion = iContador;

			}
			iContador++;
		}
		return iPosicion;
	}

	public static void removeArticulo(ArticuloController atcc) {
		int iPosicion = searchArticulo(atcc);
		if (iPosicion != -1) {
			for (int i = iPosicion + 1; i < atcc.getContador(); i++) {
				atcc.getArray()[i - 1] = atcc.getArray()[i];
			}
			atcc.getArray()[atcc.getContador()] = null;
			atcc.setContador(atcc.getContador() - 1);
		}
	}
}
