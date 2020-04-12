package vistas;

import controller.AlquilerController;
import controller.TIENDA;
import medac.validaciones.LibFrontend;
import modelo.alquiler;
import modelo.articulo;

public class AlquilerView {

	public static boolean add(TIENDA t) {
		int iDiasdePrestamos = 0;
	    int iPrecio = 0;
        int Id = 0;
		boolean bExito=false;	

		bExito = false;
		while (!bExito) {
			try {
				Id = (short) LibFrontend.valida("Introduce el id", 1, 50, 4);
				bExito = true;
			} catch (NumberFormatException e) {
				System.out.println("ERROR");
			} catch (Exception ex) {
				System.out.println("ERROR");
			}
		}

		bExito = false;
		while (!bExito) {
			try {
				iPrecio = (int) LibFrontend.valida("Introduce el precio: ", 0, 100, 2);
				bExito = true;
			} catch (NumberFormatException e) {
				System.out.println("ERROR 1");
			} catch (Exception ex) {
				System.out.println("ERROR 2" + ex.getMessage());
			}
		}
		
		bExito = false;
		while (!bExito) {
			try {
				iDiasdePrestamos = (int) LibFrontend.valida("Introduce los dias de prestamo: ", 0, 30, 2);
				bExito = true;
			} catch (NumberFormatException e) {
				System.out.println("ERROR 1");
			} catch (Exception ex) {
				System.out.println("ERROR 2" + ex.getMessage());
			}
		}
		alquiler oAlquiler = new alquiler(iDiasdePrestamos, iPrecio,Id);
		return t.getAcc().add(oAlquiler);
	}

	public static alquiler search(TIENDA t) {
		int Id = 0;
		alquiler osearch = null;
		boolean bExito=false;
		
		bExito = false;
		while (!bExito) {
			try {
				Id = (short) LibFrontend.valida("Introduce el id", 1, 50, 4);
				bExito = true;
			} catch (NumberFormatException e) {
				System.out.println("ERROR");
			} catch (Exception ex) {
				System.out.println("ERROR");
			}
		}

	    int Iposicion = t.getAcc().search(new alquiler(Id));
		if (Iposicion != -1) {
			osearch = t.getAcc().getaVector()[Iposicion];
		}
		return osearch;
	}
	
	public static boolean remove(TIENDA t) {
			boolean bExito = false;
			alquiler remove = search(t);
			if (remove != null) {
				t.getAcc().remove(remove);
				bExito=true;
			}
			return bExito;
		} 

	public static boolean update(TIENDA t) {
		alquiler oupdate = search(t);
		int Id=0;
		
		boolean bExito;
		bExito = false;
		
		while (!bExito) {
			try {
				Id = (short) LibFrontend.valida("Introduce el id", 1, 50, 4);
				bExito = true;
			} catch (NumberFormatException e) {
				System.out.println("ERROR");
			} catch (Exception ex) {
				System.out.println("ERROR");
			}
		}

		return t.getAcc().modificar(oupdate);
	}
	
	
	public static void menuAlquiler(TIENDA t) {
		boolean bExito = false;
		int opcion = 0;
		System.out.println("          ALQUILER          ");
		System.out.println("1. Añadir Alquiler");
		System.out.println("2. Eliminar Alquiler");
		System.out.println("3. Modificar Alquiler");
		System.out.println("4. Buscar Alquiler");
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
				System.out.println("El alquiler se ha añadido con exito.");
			} else {
				System.out.println("El alquiler no se ha podido añadir.");
			}

			alquiler[] alquiler = t.getAcc().getaVector();
			for (int i = 0; i < t.getAcc().getbContadorArray(); i++) {
				System.out.println("Alquiler:" + alquiler[i]);
			}
			System.out.println("-------------------------------------------------------------------------");
			menuAlquiler(t);
			break;

		case 2:
			if (remove(t)) {
				System.out.println("El alquiler se ha eliminado con exito.");
			} else {
				System.out.println("El alquiler no se ha podido añadir.");
			}

			alquiler[] alquiler1 = t.getAcc().getaVector();
			for (int i = 0; i < t.getAcc().getbContadorArray(); i++) {
				System.out.println("Alquiler:" + alquiler1[i]);
			}
			System.out.println("-------------------------------------------------------------------------");
			menuAlquiler(t);
			break;

		case 3:
			if (update(t)) {
				System.out.println("El alquiler se ha modificado con exito.");
			} else {
				System.out.println("El alquiler no se ha podido modificar.");
			}

			alquiler[] alquiler2 = t.getAcc().getaVector();
			for (int i = 0; i < t.getAcc().getbContadorArray(); i++) {
				System.out.println("Alquiler:" + alquiler2[i]);
			}
			System.out.println("-------------------------------------------------------------------------");
			menuAlquiler(t);
			break;

		case 4:
			if (search(t) != null) {
				System.out.println("El alquiler se ha mostrado con exito.");
			} else {
				System.out.println("El alquiler no se ha podido añadir.");
			}
			System.out.println("-------------------------------------------------------------------------");
			menuAlquiler(t);
			break;
		case 5:
			VistaGeneral.menuPrincipal();;
			VistaGeneral.opcionMenuPrincipal(opcion = (int) LibFrontend.valida("Elige una opcion", 1, 3, 1), t);
			break;
		}
	}
	
}