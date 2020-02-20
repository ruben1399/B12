package vistas;

import controller.ClienteController;
import medac.validaciones.LibFrontend;
import modelo.cliente;

public class ClienteView {

	public static void main(String[] args) {
		ClienteController clcc = new ClienteController();
		CreareIntroducirClientes(clcc);

		System.out.println(clcc.mostrarClientes());
	}

	private static void CreareIntroducirClientes(ClienteController clcc) {
		int NumeroCrearClientes = LibFrontend.validaNumero("¿Cuantos clientes quieres crear?", 1, 100);
		int iContador = 0;
		while (iContador < NumeroCrearClientes) {
			clcc.add(CrearCliente());
			iContador++;
		}
	}

	private static cliente CrearCliente() {
		int IdCliente = LibFrontend.validaNumero("Dime una ID", 1, 100);
		String sNombre = LibFrontend.leer("Dime tu nombre de cliente");
		int iSaldo = LibFrontend.validaNumero("Dime tu saldo", 0, 50000);
		cliente ocl = new cliente(IdCliente, sNombre, iSaldo);
		return ocl;
	}
}
