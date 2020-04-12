package controller;

import modelo.alquiler;

public class AlquilerController implements ICrud<alquiler> {
	private alquiler aAlquiler[];
	private byte bContadorAlquiler;
	private final int MAXAlquiler = 100;
	
	public AlquilerController() {
		aAlquiler = new alquiler[MAXAlquiler];
		bContadorAlquiler = 0;
	}

	@Override
	public alquiler[] getaVector() {
		return aAlquiler;
	}

	@Override
	public byte getbContadorArray() {
		return bContadorAlquiler;
	}

	@Override
	public boolean add(alquiler oObject) {
		boolean bExito = false;
		if(bContadorAlquiler < MAXAlquiler && search(oObject) == -1) {
			aAlquiler[bContadorAlquiler] = oObject;
			bContadorAlquiler++;
			bExito = true;
		}
		return bExito;
	}

	@Override
	public boolean remove(alquiler oObject) {
		boolean bExito = false;
		int iPosicion = search(oObject);
		if(iPosicion != -1) {
			for(int i=iPosicion+1; i<bContadorAlquiler; i++) {
				aAlquiler[i-1] = aAlquiler[i];	
			}
			aAlquiler[bContadorAlquiler] = null;
			bContadorAlquiler--;
			bExito = true;
		}
		return bExito;
	}

	@Override
	public int search(alquiler oObject) {
		int iPosicion = -1;
		int iContador = 0;
		while(iPosicion == -1 && iContador < bContadorAlquiler) {
			if(oObject.equals(aAlquiler[iContador])) {
				iPosicion = iContador;
			}
			iContador++;
		}
		return iPosicion;
	}

	@Override
	public boolean modificar(alquiler oObject) {
		 boolean bExito=false;
	        int iPosicion = search(oObject);

	        if(iPosicion != -1) {
	        	aAlquiler[iPosicion]=oObject;
	            bExito=true;
	        }
	        return bExito;
	}
}
