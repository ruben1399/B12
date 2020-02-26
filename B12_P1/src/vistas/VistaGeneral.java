package vistas;

import controller.ArticuloController;
import controller.ClienteController;
import controller.TIENDA;
import medac.validaciones.LibFrontend;

public class VistaGeneral {

	public static void main(String[] args) {
		TIENDA t = new TIENDA();
		}
	
	
		
	
	
	
	public static boolean EligeOpcion(TIENDA t) {
		boolean bExito = false;
		int iOpcion;
		iOpcion = (int) LibFrontend.valida("Elige Una Opcion", 0, 10, 1);

		if (iOpcion == 1) {
			ClienteView.CreareIntroducirClientes(t.getClcc());
		}
		if (iOpcion == 2) {
			ArticuloView.CreareIntroducirArticulos(t.getAtcc());
		}
		if (iOpcion == 3) {
			ClienteView.searchCliente(t.getClcc());
		}
		if (iOpcion == 4) {
			ArticuloView.searchArticulo(t.getAtcc());
		}
		if (iOpcion == 5) {
			ClienteView.updateCliente(t.getClcc());
		}
		if (iOpcion == 6) {
			ArticuloView.updateArticulo(t.getAtcc());
		}
		if (iOpcion == 7) {
			ClienteView.removeCliente(t.getClcc());
		}
		if (iOpcion == 8) {
			ArticuloView.removeArticulo(t.getAtcc());
		}
		if (iOpcion == 9) {
			t.getClcc().mostrarClientes();
		}
		if (iOpcion == 10) {
			
		}
		if (iOpcion == 0) {
			bExito = true;
		}
		return bExito;
	}

	public static String MENU() {
		String sMensaje = "";
		sMensaje += "------------------MENU---------------------- \n";
		sMensaje += "1. Añadir Clientes \n";
		sMensaje += "2. Añadir Articulos \n";
		sMensaje += "3. Buscar Clientes \n";
		sMensaje += "4. Buscar Articulos \n";
		sMensaje += "5. Actualizar Clientes \n";
		sMensaje += "6. Actualizar Articulos \n";
		sMensaje += "7. Borrar Clientes \n";
		sMensaje += "8. Borrar Articulos \n";
		sMensaje += "9. Mostrar Clientes \n";
		sMensaje += "10. Mostrar Articulos \n";
		sMensaje += "Para salir pulsa 0 \n";
		sMensaje += "--------------------------------------------";
		return sMensaje;
	}

}
