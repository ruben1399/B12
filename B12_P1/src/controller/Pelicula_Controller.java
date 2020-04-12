package controller;
import modelo.pelicula;


public class Pelicula_Controller implements ICrud<pelicula>{

	private pelicula aPelicula[];
	private byte bContadorPelicula;
	private final int MAXPelicula = 100;
	
	public Pelicula_Controller() {
		aPelicula = new pelicula[MAXPelicula];
		bContadorPelicula = 0;
	}

	@Override
	public pelicula[] getaVector() {
		return aPelicula;
	}

	@Override
	public byte getbContadorArray() {
		return bContadorPelicula;
	}

	@Override
	public boolean add(pelicula oObject) {
		boolean bExito = false;
		if(bContadorPelicula < MAXPelicula && search(oObject) == -1) {
			aPelicula[bContadorPelicula] = oObject;
			bContadorPelicula++;
			bExito = true;
		}
		return bExito;
	}

	@Override
	public boolean remove(pelicula oObject) {
		boolean bExito = false;
		int iPosicion = search(oObject);
		if(iPosicion != -1) {
			for(int i=iPosicion+1; i<bContadorPelicula; i++) {
				aPelicula[i-1] = aPelicula[i];	
			}
			aPelicula[bContadorPelicula] = null;
			bContadorPelicula--;
			bExito = true;
		}
		return bExito;
	}

	@Override
	public int search(pelicula oObject) {
		int iPosicion = -1;
		int iContador = 0;
		while(iPosicion == -1 && iContador < bContadorPelicula) {
			if(oObject.equals(aPelicula[iContador])) {
				iPosicion = iContador;
			}
			iContador++;
		}
		return iPosicion;
	}

	@Override
	public boolean modificar(pelicula oObject) {
        boolean bExito=false;
        int iPosicion = search(oObject);

        if(iPosicion != -1) {
        	aPelicula[iPosicion]=oObject;
            bExito=true;
        }
        return bExito;
    }
}
