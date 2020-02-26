package controller;

import medac.validaciones.LibFrontend;
import modelo.articulo;
import modelo.cliente;

public class ArticuloController implements ICrud<articulo>, IArticuloController {
	private articulo[] Array;
	private int Contador;

	public ArticuloController() {
		Array = new articulo[MAXARTICULO];
		Contador = 0;
	}
	@Override
	public void setContador(int contador) {
		Contador = contador;
	}

	@Override
	public articulo[] getArray() {
		return Array;
	}

	@Override
	public int getContador() {
		return Contador;
	}

	

	@Override
	public int search(articulo Object) {
		int iPosicion = -1;
		int iContador = 0;
		while (iPosicion == -1 && iContador < MAXARTICULO) {
			if (Object.equals(Array[iContador])) {
				iPosicion = iContador;
			}
			iContador++;
		}
		return iPosicion;
	}

	@Override
	public boolean add(articulo Object) {
		boolean bExito = false;
		if (Contador < MAXARTICULO && search(Object) == -1) {
			Array[Contador] = Object;
			Contador++;
			bExito = true;
		}
		return bExito;
	}

	@Override
	public boolean remove(articulo Object) {
		boolean bExito = false;
		int iPosicion = search(Object);
		if (iPosicion != -1) {
			for (int i = iPosicion + 1; i < Contador; i++) {
				Array[i - 1] = Array[i];
			}
			Array[Contador] = null;
			Contador--;
			bExito = true;
		}
		return bExito;
	}

	@Override
	public boolean update(articulo Object) {
		boolean bExito = false;
		int iPosicion = search(Object);
		if (iPosicion != -1) {
			Array[iPosicion] = Object;
			bExito = true;
		}
		return bExito;
	}

	@Override
	public  String mostrarArticulos() {
		int cont = 0;
		String sMensaje = "";
		if (getContador() == 0) {
			sMensaje = "No hay articulos";

		} else {
			for (cont = 0; cont < getContador(); cont++) {
				sMensaje += Array[cont] + "\n";
			}
		}
		return sMensaje;
	}
}
