package controller;

import modelo.cliente;


public class ClienteController implements ICrud<cliente> {
	
	private cliente aCliente[];
	private byte bContadorcliente;
	private final int MAXCliente = 100;
	
	public ClienteController() {
		aCliente = new cliente[MAXCliente];
		bContadorcliente = 0;
	}
	
	@Override
	public cliente[] getaVector() {
		return aCliente;
	}

	@Override
	public byte getbContadorArray() {
		return bContadorcliente;
	}
	
	@Override
	public boolean add(cliente oObject) {
		boolean bExito = false;
		if(bContadorcliente < MAXCliente && search(oObject) == -1) {
			aCliente[bContadorcliente] = oObject;
			bContadorcliente++;
			bExito = true;
		}
		return bExito;
	}

	@Override
	public boolean remove(cliente oObject) {
		boolean bExito = false;
		int iPosicion = search(oObject);
		if(iPosicion != -1) {
			for(int i=iPosicion+1; i<bContadorcliente; i++) {
				aCliente[i-1] = aCliente[i];	
			}
			aCliente[bContadorcliente] = null;
			bContadorcliente--;
			bExito = true;
		}
		return bExito;
	}

	@Override
	public int search(cliente oObject) {
		int iPosicion = -1;
		int ibContadorcliente = 0;
		while(iPosicion == -1 && ibContadorcliente < bContadorcliente) {
			if(oObject.equals(aCliente[ibContadorcliente])) {
				iPosicion = ibContadorcliente;
			}
			ibContadorcliente++;
		}
		return iPosicion;
	}

	@Override
	public boolean modificar(cliente oObject) {
        boolean bExito=false;
        int iPosicion = search(oObject);

        if(iPosicion != -1) {
        	aCliente[iPosicion]=oObject;
            bExito=true;
        }
        return bExito;
    }




}