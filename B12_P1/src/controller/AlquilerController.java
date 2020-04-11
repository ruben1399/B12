package controller;

import modelo.alquiler;

public class AlquilerController {
	public final int MAXALQUILER=100;
	private alquiler[] Array;
	private int Contador;
	public AlquilerController() {
		Array = new alquiler[MAXALQUILER];
		Contador = 0;
	}

	public void setContador(int contador ) {
		Contador = contador;
	}


	public alquiler[] getArray() {
		return Array;
	}


	public int getContador() {
		return Contador;
	}

	


	public int search(alquiler Object) {
		int iPosicion = -1;
		int iContador = 0;
		while (iPosicion == -1 && iContador < MAXALQUILER) {
			if (Object.equals(Array[iContador])) {
				iPosicion = iContador;
			}
			iContador++;
		}
		return iPosicion;
	}

	
	public boolean add(alquiler Object) {
		boolean bExito = false;
		if (Contador < MAXALQUILER && search(Object) == -1) {
			Array[Contador] = Object;
			Contador++;
			bExito = true;
		}
		return bExito;
	}

	
	public boolean remove(alquiler Object) {
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


	public boolean update(alquiler Object) {
		boolean bExito = false;
		int iPosicion = search(Object);
		if (iPosicion != -1) {
			Array[iPosicion] = Object;
			bExito = true;
		}
		return bExito;
	}

	
	public  String mostraralquileres() {
		int cont = 0;
		String sMensaje = "";
		if (getContador() == 0) {
			sMensaje = "No hay alquiler";

		} else {
			for (cont = 0; cont < getContador(); cont++) {
				sMensaje += Array[cont] + "\n";
			}
		}
		return sMensaje;
	}
	
}
