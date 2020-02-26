package vistas;


import controller.ClienteController;
import medac.validaciones.LibFrontend;
import modelo.cliente;

public class ClienteView {

	public static void main(String[] args) {
		ClienteController clcc = new ClienteController();
		CreareIntroducirClientes(clcc);
		System.out.println(clcc.mostrarClientes());
		removeCliente(clcc);
		System.out.println(clcc.mostrarClientes());
	}

	public static void CreareIntroducirClientes(ClienteController clcc) {
		int NumeroCrearClientes = LibFrontend.validaNumero("¿Cuantos clientes quieres crear?", 1, ClienteController.MAXCLIENTE);
		int iContador = 0;
		while (iContador < NumeroCrearClientes) {
			clcc.add(CrearCliente());
			iContador++;
		}
	}

	public static cliente CrearCliente() {
		int IdCliente = LibFrontend.validaNumero("Dime una ID", 1, 100);
		String sNombre = LibFrontend.leer("Dime tu nombre de cliente");
		int iSaldo = LibFrontend.validaNumero("Dime tu saldo", 0, 50000);
		cliente ocl = new cliente(IdCliente, sNombre, iSaldo);
		return ocl;
	}

	public static void updateCliente(ClienteController clcc) {
		String sNombreNew = LibFrontend.leer("Dime nuevo cliente o la modificacion que quieres realizar");
		int iPos = searchCliente(clcc);
		clcc.getArray()[iPos].setsNombre(sNombreNew);

	}
	public static int searchCliente(ClienteController clcc) {
		int iPosicion=0;
		int iContador = 0;
		String sNombre = LibFrontend.leer("Dime un nombre de cliente ");
		while (iContador < clcc.getContador()) {
			if (sNombre.equals(clcc.getArray()[iContador].getsNombre())) {
				iPosicion=iContador;

			}
			iContador++;
		}
		return iPosicion;
	}
	
	public static void removeCliente(ClienteController clcc) {
		int iPosicion = searchCliente(clcc);
		if (iPosicion != -1) {
			for (int i = iPosicion + 1; i < clcc.getContador(); i++) {
				clcc.getArray()[i - 1] = clcc.getArray()[i];
			}
			clcc.getArray()[clcc.getContador()] = null;
			clcc.setContador(clcc.getContador()-1);
		}
	}
}
