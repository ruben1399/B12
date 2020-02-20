package controller;

import modelo.articulo;

public interface ICrud {

	
	public int search(articulo Object);

	public boolean add(articulo Object);

	public boolean remove(articulo Object);

	public boolean update(articulo Object);

}