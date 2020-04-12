package controller;

import medac.validaciones.LibFrontend;

import modelo.articulo;

public class ArticuloController implements ICrud<articulo> {
	
	private articulo aArticulo[];
	private byte bContadorArticulo;
	private final int MAXARTICULO = 100;

	public ArticuloController() {
		aArticulo = new articulo[MAXARTICULO];
		bContadorArticulo = 0;
	}

	@Override
	public articulo[] getaVector() {
		return aArticulo;
	}

	@Override
	public byte getbContadorArray() {
		return bContadorArticulo;
	}

	@Override
	public boolean add(articulo oObject) {
		boolean bExito = false;
		if (bContadorArticulo < MAXARTICULO && search(oObject) == -1) {
			aArticulo[bContadorArticulo] = oObject;
			bContadorArticulo++;
			bExito = true;
		}
		return bExito;
	}

	@Override
	public boolean remove(articulo oObject) {
		boolean bExito = false;
		int iPosicion = search(oObject);
		if (iPosicion != -1) {
			for (int i = iPosicion + 1; i < bContadorArticulo; i++) {
				aArticulo[i - 1] = aArticulo[i];
			}
			aArticulo[bContadorArticulo] = null;
			bContadorArticulo--;
			bExito = true;
		}
		return bExito;
	}

	@Override
	public int search(articulo oObject) {
		int iPosicion = -1;
		int iContador = 0;
		while (iPosicion == -1 && iContador < bContadorArticulo) {
			if (oObject.equals(aArticulo[iContador])) {
				iPosicion = iContador;
			}
			iContador++;
		}
		return iPosicion;
	}

	@Override
	public boolean modificar(articulo oObject) {
		boolean bExito = false;
		int iPosicion = search(oObject);

		if (iPosicion != -1) {
			aArticulo[iPosicion] = oObject;
			bExito = true;
		}
		return bExito;
	}
}
