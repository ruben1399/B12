package vistas;

import controller.ClienteController;
import medac.validaciones.LibFrontend;
import modelo.cliente;

public class ClienteView {

	public static void main(String[] args) {
		ClienteController clcc = new ClienteController();
		CreareIntroducirClientes(clcc);

		System.out.println(updateCliente(clcc));
	}

	public static void CreareIntroducirClientes(ClienteController clcc) {
		int NumeroCrearClientes = LibFrontend.validaNumero("¿Cuantos clientes quieres crear?", 1, clcc.MAXCLIENTE);
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
	
	
	
	public static cliente[] updateCliente(ClienteController clcc) {

		
		String sNombre = LibFrontend.leer("Dime un cliente que quieras actualizar");
		String sNombreNew = LibFrontend.leer("Dime nuevo cliente o la modificacion que quieres realizar");
		/*int iContador=0;*/
		int iPos= clcc.searchCliente(sNombre);
		
		
		clcc.getArray()[iPos].setsNombre(sNombreNew);
		return clcc.getArray();
		 
	
	}
}
