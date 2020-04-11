package vistas;

import controller.PeliculaController;
import medac.validaciones.LibFrontend;
import modelo.pelicula;

public class PeliculaView {

	public static void main(String[] args) {

		PeliculaController pcc = new PeliculaController();

	}

	public static void CreareIntroducirArticulos(PeliculaController pcc) {
		int NumeroCrearArticulos = LibFrontend.validaNumero("¿Cuantos Articulos quieres crear?", 1, pcc.MAXPELICULA);
		int iContador = 0;
		while (iContador < NumeroCrearArticulos) {
			pcc.add(CrearPelicula());
			iContador++;
		}
	}

	private static pelicula CrearPelicula() {
		int id = LibFrontend.validaNumero("Dime una ID", 1, 50);
		String sNombre = LibFrontend.leer("Dime el nombre de la pelicula");
		String sSinopsis = LibFrontend.leer("Dime un breve resumen de esta pelicula");
		String sTipo = LibFrontend.leer("¿De que tipo es esta pelicula?");
		int iPrecio = LibFrontend.validaNumero("Dime el precio", 0, 50000);
		pelicula pc = new pelicula(id, sNombre, sSinopsis, sTipo, iPrecio);
		return pc;
	}

	public static void updatePelicula(PeliculaController pcc) {
		String sNombreNew = LibFrontend.leer("Dime nuevo nombre de pelicula o la modificacion que quieres realizar");
		int iPos = searchPelicula(pcc);
		pcc.getArray()[iPos].setsNombre(sNombreNew);

	}

	public static int searchPelicula(PeliculaController pcc) {
		int iPosicion = 0;
		int iContador = 0;
		String sNombre = LibFrontend.leer("Dime el nombre de una pelicula ");
		while (iContador < pcc.getContador()) {
			if (sNombre.equals(pcc.getArray()[iContador].getsNombre())) {
				iPosicion = iContador;

			}
			iContador++;
		}
		return iPosicion;
	}

	public static void removeArticulo(PeliculaController pcc) {
		int iPosicion = searchPelicula(pcc);
		if (iPosicion != -1) {
			for (int i = iPosicion + 1; i < pcc.getContador(); i++) {
				pcc.getArray()[i - 1] = pcc.getArray()[i];
			}
			pcc.getArray()[pcc.getContador()] = null;
			pcc.setContador(pcc.getContador() - 1);
		}
	}
}

