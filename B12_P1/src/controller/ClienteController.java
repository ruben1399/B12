package controller;

import modelo.cliente;

public class ClienteController implements ICrud<cliente>, IClienteController {
	private cliente[] Array;
	private int Contador;

	public ClienteController() {
		Contador = 0;
		Array = new cliente[MAXCLIENTE];
	}

	@Override
	public cliente[] getArray() {
		return Array;
	}

	@Override
	public int getContador() {
		return Contador;
	}

	@Override
	public int search(cliente Object) {
		int iPosicion = -1;
		int iContador = 0;
		while (iPosicion == -1 && iContador < MAXCLIENTE) {
			if (Object.equals(Array[iContador])) {
				iPosicion = iContador;
			}
			iContador++;
		}
		return iPosicion;
	}

	@Override
	public boolean add(cliente Object) {
		boolean bExito = false;
		if (Contador < MAXCLIENTE && search(Object) == -1) {
			Array[Contador] = Object;
			Contador++;
			bExito = true;
		}
		return bExito;
	}

	@Override
	public boolean remove(cliente Object) {
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
	public boolean update(cliente Object) {
		boolean bExito = false;
		int iPosicion = search(Object);
		if (iPosicion != -1) {
			Array[iPosicion] = Object;
			bExito = true;
		}
		return bExito;
	}
	@Override
	public String mostrarClientes() {
		int cont = 0;
		String sMensaje = "";
		if (getContador() == 0) {
			sMensaje = "No hay Clientes";

		} else {
			for (cont = 0; cont < getContador(); cont++) {
				sMensaje += Array[cont] + "\n";
			}
		}
		return sMensaje;
	}

}
