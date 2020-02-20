package controller;

import modelo.articulo;

public class ArticuloController implements ICrud <articulo>, IArticuloController {
	private articulo[] arrayArticulo;
	private int contadorArticulos;

	public ArticuloController() {
		arrayArticulo = new articulo[MAXARTICULO];
		contadorArticulos = 0;
	}


	@Override
	public articulo[] getArray() {
		return arrayArticulo;
	}

	



	@Override
	public int getContador() {
		return contadorArticulos;
	}



	//// CRUD
	
	@Override
	public int search(articulo Object) {
		int iPosicion = -1;
		int iContador = 0;
		while (iPosicion == -1 && iContador < MAXARTICULO) {
			if (Object.equals(arrayArticulo[iContador])) {
				iPosicion = iContador;
			}
			iContador++;
		}
		return iPosicion;
	}


	@Override
	public boolean add(articulo Object) {
		boolean bExito = false;
		if (contadorArticulos < MAXARTICULO && search(Object) == -1) {
			arrayArticulo[contadorArticulos] = Object;
			contadorArticulos++;
			bExito = true;
		}
		return bExito;
	}

		@Override
		public boolean remove(articulo Object) {
		boolean bExito = false;
		int iPosicion = search(Object);
		if (iPosicion != -1) {
			for (int i = iPosicion + 1; i < contadorArticulos; i++) {
				arrayArticulo[i - 1] = arrayArticulo[i];
			}
			arrayArticulo[contadorArticulos] = null;
			contadorArticulos--;
			bExito = true;
		}
		return bExito;
	}
	
	
	@Override
	public boolean update (articulo Object) {
		boolean bExito=false;
		int iPosicion = search(Object);
		if(iPosicion != -1) {
			arrayArticulo[iPosicion]=Object;
			bExito=true;
		}
	return bExito;
	}
}
