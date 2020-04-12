package vistas;

import controller.TIENDA;
import medac.validaciones.LibFrontend;
import modelo.articulo;

public class ArticuloView {

	public static boolean add(TIENDA t) {
		int Id = 0;
		String sNombre = null;
		double dPrecio = 0;
		boolean bExito = false;

		bExito = false;
		while (!bExito) {
			try {
				Id = (int) LibFrontend.valida("Introduce el id", 1, 50, 4);
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
				dPrecio = (double) LibFrontend.valida("Introduce el precio: ", 0, 100, 2);
				bExito = true;
			} catch (NumberFormatException e) {
				System.out.println("ERROR 1");
			} catch (Exception ex) {
				System.out.println("ERROR 2" + ex.getMessage());
			}
		}

		articulo oArticulo = new articulo(Id, sNombre, dPrecio);
		return t.getAtcc().add(oArticulo);
	}

	public static articulo search(TIENDA t) {
		int Id = 0;
		articulo osearch = null;
		boolean bExito = false;

		bExito = false;
		while (!bExito) {
			try {
				Id = (int) LibFrontend.valida("Introduce el id", 1, 50, 4);
				bExito = true;
			} catch (NumberFormatException e) {
				System.out.println("ERROR");
			} catch (Exception ex) {
				System.out.println("ERROR");
			}
		}

		int Iposicion = t.getAtcc().search(new articulo(Id));
		if (Iposicion != -1) {
			osearch = t.getAtcc().getaVector()[Iposicion];
		}
		return osearch;
	}

	public static boolean remove(TIENDA t) {
		boolean bExito = false;
		articulo remove = search(t);
		if (remove != null) {
			t.getAtcc().remove(remove);
			bExito = true;
		}
		return bExito;
	}

	public static boolean update(TIENDA t) {
		articulo oupdate = search(t);
		int Id = 0;

		boolean bExito;
		bExito = false;

		while (!bExito) {
			try {
				Id = (int) LibFrontend.valida("Introduce el id", 1, 50, 4);
				bExito = true;
			} catch (NumberFormatException e) {
				System.out.println("ERROR");
			} catch (Exception ex) {
				System.out.println("ERROR");
			}
		}

		return t.getAtcc().modificar(oupdate);
	}

	public static void menuArticulos(TIENDA t) {
		boolean bExito = false;
		int opcion = 0;
		System.out.println("          ARTICULO          ");
		System.out.println("1. Añadir Articulo");
		System.out.println("2. Eliminar Articulo");
		System.out.println("3. Modificar Articulo");
		System.out.println("4. Buscar Articulo");
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
				System.out.println("El articulo se ha añadido con exito.");
			} else {
				System.out.println("El articulo no se ha podido añadir.");
			}

			articulo[] articulo = t.getAtcc().getaVector();
			for (int i = 0; i < t.getAtcc().getbContadorArray(); i++) {
				System.out.println("Articulo:" + articulo[i]);
			}
			System.out.println("-------------------------------------------------------------------------");
			menuArticulos(t);
			break;

		case 2:
			if (remove(t)) {
				System.out.println("El articulo se ha eliminado con exito.");
			} else {
				System.out.println("El articulo no se ha podido añadir.");
			}

			articulo[] articulo1 = t.getAtcc().getaVector();
			for (int i = 0; i < t.getAtcc().getbContadorArray(); i++) {
				System.out.println("Articulo:" + articulo1[i]);
			}
			System.out.println("-------------------------------------------------------------------------");
			menuArticulos(t);
			break;

		case 3:
			if (update(t)) {
				System.out.println("El articulo se ha modificado con exito.");
			} else {
				System.out.println("El articulo no se ha podido modificar.");
			}

			articulo[] articulo2 = t.getAtcc().getaVector();
			for (int i = 0; i < t.getAtcc().getbContadorArray(); i++) {
				System.out.println("Articulo:" + articulo2[i]);
			}
			System.out.println("-------------------------------------------------------------------------");
			menuArticulos(t);
			break;

		case 4:
			if (search(t) != null) {
				System.out.println("El inventario se ha mostrado con exito.");
			} else {
				System.out.println("El articulo no se ha podido añadir.");
			}
			System.out.println("-------------------------------------------------------------------------");
			menuArticulos(t);
			break;
		case 5:
			VistaGeneral.menuPrincipal();;
			VistaGeneral.opcionMenuPrincipal(opcion = (int) LibFrontend.valida("Elige una opcion", 1, 3, 1), t);
			break;
		}
	}
	
	

	
}