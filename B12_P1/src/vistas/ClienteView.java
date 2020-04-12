package vistas;

import controller.TIENDA;
import medac.validaciones.LibFrontend;
import modelo.alquiler;
import modelo.cliente;

public class ClienteView {

	public static boolean add(TIENDA t) {
		int idCliente=0;
		String sNombre;
		int iSaldo=0;
		boolean bExito=false;	

		bExito = false;
		while (!bExito) {
			try {
				idCliente = (short) LibFrontend.valida("Introduce el id", 1, 50, 4);
				bExito = true;
			} catch (NumberFormatException e) {
				System.out.println("ERROR");
			} catch (Exception ex) {
				System.out.println("ERROR");
			}
		}

	   sNombre= LibFrontend.leer("Introduce un nombre: ");
	
		cliente oCliente = new cliente(idCliente, sNombre, iSaldo);
		return t.getClcc().add(oCliente);
	}

	public static cliente search(TIENDA t) {
		int idCliente = 0;
		cliente osearch = null;
		boolean bExito=false;
		
		bExito = false;
		while (!bExito) {
			try {
				idCliente = (short) LibFrontend.valida("Introduce el id", 1, 50, 4);
				bExito = true;
			} catch (NumberFormatException e) {
				System.out.println("ERROR");
			} catch (Exception ex) {
				System.out.println("ERROR");
			}
		}

		int iposicion = t.getClcc().search(new cliente(idCliente));
		if (iposicion != -1) {
			osearch = t.getClcc().getaVector()[iposicion];
		}
		return osearch;
	}
	
	public static boolean remove(TIENDA t) {
			boolean bExito = false;
			cliente remove = search(t);
			if (remove != null) {
				t.getClcc().remove(remove);
				bExito=true;
			}
			return bExito;
		} 

	public static boolean update(TIENDA t) {
		cliente oupdate = search(t);
		int idCliente=0;
		
		boolean bExito;
		bExito = false;
		
		bExito = false;
		while (!bExito) {
			try {
				idCliente = (short) LibFrontend.valida("Introduce el id", 1, 50, 4);
				bExito = true;
			} catch (NumberFormatException e) {
				System.out.println("ERROR");
			} catch (Exception ex) {
				System.out.println("ERROR");
			}
		}

		return t.getClcc().modificar(oupdate);
	}
	
	public static void menuCliente(TIENDA t) {
		boolean bExito = false;
		int opcion = 0;
		System.out.println("          CLIENTE          ");
		System.out.println("1. Añadir Cliente");
		System.out.println("2. Eliminar Cliente");
		System.out.println("3. Modificar Cliente");
		System.out.println("4. Buscar Cliente");
		System.out.println("5. Salir al menu VistaGeneral");

		bExito = false;
		while (!bExito) {
			try {
				opcion = (int) LibFrontend.valida("Elige una opcion", 1, 6, 1);
				bExito = true;
			} catch (NumberFormatException e) {
				System.out.println("Error");
			} catch (Exception ex) {
				System.out.println("Error");
			}
		}

		switch (opcion) {
		case 1:
			if (add(t)) {
				System.out.println("El cliente se ha añadido con exito.");
			} else {
				System.out.println("El cliente no se ha podido añadir.");
			}

			cliente[] cliente = t.getClcc().getaVector();
			for (int i = 0; i < t.getClcc().getbContadorArray(); i++) {
				System.out.println("Cliente:" + cliente[i]);
			}
			System.out.println("-------------------------------------------------------------------------");
			menuCliente(t);
			break;

		case 2:
			if (remove(t)) {
				System.out.println("El cliente se ha eliminado con exito.");
			} else {
				System.out.println("El cliente no se ha podido añadir.");
			}

			cliente[] cliente1 = t.getClcc().getaVector();
			for (int i = 0; i < t.getClcc().getbContadorArray(); i++) {
				System.out.println("Cliente:" + cliente1[i]);
			}
			System.out.println("-------------------------------------------------------------------------");
			menuCliente(t);
			break;

		case 3:
			if (update(t)) {
				System.out.println("El cliente se ha modificado con exito.");
			} else {
				System.out.println("El cliente no se ha podido modificar.");
			}

			cliente[] cliente2 = t.getClcc().getaVector();
			for (int i = 0; i < t.getClcc().getbContadorArray(); i++) {
				System.out.println("Cliente:" + cliente2[i]);
			}
			System.out.println("-------------------------------------------------------------------------");
			menuCliente(t);
			break;

		case 4:
			if (search(t) != null) {
				System.out.println("El cliente se ha mostrado con exito.");
			} else {
				System.out.println("El cliente no se ha podido añadir.");
			}
			System.out.println("-------------------------------------------------------------------------");
			menuCliente(t);
			break;
		case 5:
			VistaGeneral.menuPrincipal();;
			VistaGeneral.opcionMenuPrincipal(opcion = (int) LibFrontend.valida("Elige una opcion", 1, 3, 1), t);
			break;
		}
	}
}