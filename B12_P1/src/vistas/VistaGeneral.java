package vistas;

import controller.ArticuloController;
import controller.ClienteController;
import controller.TIENDA;
import medac.validaciones.LibFrontend;

public class VistaGeneral {

	public static void main(String[] args) {
		MENU();

	}

	private static void MENU() {
		String sMensaje = "";
		int iOpcion;
		sMensaje += "------------------MENU----------------------";
		sMensaje += "1. Añadir Clientes";
		sMensaje += "2. Añadir Articulos";
		sMensaje += "3. Buscar Clientes";
		sMensaje += "4. Buscar Articulos";
		sMensaje += "5. Actualizar Clientes";
		sMensaje += "6. Actualizar Articulos";
		sMensaje += "5. Borrar Clientes";
		sMensaje += "6. Borrar Articulos";
		sMensaje += "7. Mostrar Clientes";
		sMensaje += "6. Mostrar Articulos";
		sMensaje += "Para salir pulsa 0";
		sMensaje += "--------------------------------------------";
		iOpcion = (int) LibFrontend.valida("Elige Una Opcion", 0, 7, 1);

		// Crear los objetos de Articulo
		ArticuloView artw = new ArticuloView();
		ArticuloController artcc = new ArticuloController();
		

		// Crear los objetos de Cliente
		ClienteView ctw = new ClienteView();
		ClienteController clcc = new ClienteController();

		if (iOpcion == 1) {
			ctw.CreareIntroducirClientes(clcc);
		}
		if (iOpcion == 2) {
			artw.CreareIntroducirArticulos(artcc);
		}if (iOpcion == 3) {
			clcc.searchCliente();
		}
		if (iOpcion == 4) {
			artcc.searchArticulo();
		}

	}

}
