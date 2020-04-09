package controller;
import modelo.pelicula;


public class PeliculaController implements ICrud<pelicula>, IPeliculaController{
	private final int MAXPELICULA = 100;
	private pelicula[] Array;
	private int Contador;

	public PeliculaController() {
		Contador = 0;
		Array = new pelicula[MAXPELICULA];
	}

	@Override
	public pelicula[] getArray() {
		return Array;
	}

	@Override
	public void setArray(pelicula[] pelicula) {
		this.Array = pelicula;
	}

	@Override
	public int getContador() {
		return Contador;
	}

	@Override
	public void setContador(int Contador) {
		this.Contador = Contador;
	}
	
	
	

	@Override
	public int search(pelicula Object) {
		int iPosicion = -1;
		int iContador = 0;
		while (iPosicion == -1 && iContador < MAXPELICULA) {
			if (Object.equals(Array[iContador])) {
				iPosicion = iContador;
			}
			iContador++;
		}
		return iPosicion;
	}

	@Override
	public boolean add(pelicula Object) {
		boolean bExito = false;
		if (Contador < MAXPELICULA && search(Object) == -1) {
			Array[Contador] = Object;
			Contador++;
			bExito = true;
		}
		return bExito;
	}

	@Override
	public boolean remove(pelicula Object) {
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
	public boolean update(pelicula Object) {
		boolean bExito = false;
		int iPosicion = search(Object);
		if (iPosicion != -1) {
			Array[iPosicion] = Object;
			bExito = true;
		}
		return bExito;
	}


	@Override
	public String mostrarpeliculas() {
		int cont = 0;
		String sMensaje = "";
		if (getContador() == 0) {
			sMensaje = "No hay peliculas";

		} else {
			for (cont = 0; cont < getContador(); cont++) {
				sMensaje += Array[cont] + "\n";
			}
		}
		return sMensaje;
	}

}
