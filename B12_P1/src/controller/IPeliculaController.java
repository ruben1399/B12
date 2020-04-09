package controller;

import modelo.pelicula;

public interface IPeliculaController {

	public pelicula[] getArray();

	public void setArray(pelicula[] Array);

	public int getContador();

	public void setContador(int iContadorPelicula);

	public String mostrarpeliculas();

}