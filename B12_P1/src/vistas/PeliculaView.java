package vistas;

import controller.Pelicula_Controller;
import controller.TIENDA;
import medac.validaciones.LibFrontend;
import modelo.cliente;
import modelo.pelicula;

public class PeliculaView {

	public static boolean add(TIENDA t) {
		int Id=0;
	    String sNombre;
		String sSinopsis;
		String sTipo;
		int iPrecio=0;
		boolean bExito=false;

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
		
		sNombre=LibFrontend.leer("Introduce un nombre: ");
		sSinopsis=LibFrontend.leer("Indica la sinopsis: ");
		sTipo=LibFrontend.leer("Introduce un tipo: ");
		
		bExito = false;
		while (!bExito) {
			try {
				iPrecio = (int) LibFrontend.valida("Introduce el id", 1, 50, 4);
				bExito = true;
			} catch (NumberFormatException e) {
				System.out.println("ERROR");
			} catch (Exception ex) {
				System.out.println("ERROR");
			}
		}

	   sNombre= LibFrontend.leer("Introduce un nombre: ");
	
		pelicula oPelicula = new pelicula(Id, sNombre, sSinopsis, sTipo, iPrecio);
		return t.getPcc().add(oPelicula);
	}

	public static pelicula search(TIENDA t) {
		int idPelicula = 0;
		pelicula osearch = null;
		boolean bExito=false;
		
		bExito = false;
		while (!bExito) {
			try {
				idPelicula = (int) LibFrontend.valida("Introduce el id", 1, 50, 4);
				bExito = true;
			} catch (NumberFormatException e) {
				System.out.println("ERROR");
			} catch (Exception ex) {
				System.out.println("ERROR");
			}
		}

		int iposicion = t.getPcc().search(new pelicula(idPelicula));
		if (iposicion != -1) {
			osearch = t.getPcc().getaVector()[iposicion];
		}
		return osearch;
	}
	
	public static boolean remove(TIENDA t) {
			boolean bExito = false;
			pelicula remove = search(t);
			if (remove != null) {
				t.getPcc().remove(remove);
				bExito=true;
			}
			return bExito;
		} 

	public static boolean update(TIENDA t) {
		pelicula oupdate = search(t);
		int idPelicula=0;
		
		boolean bExito;
		bExito = false;
		
		bExito = false;
		while (!bExito) {
			try {
				idPelicula = (int) LibFrontend.valida("Introduce el id", 1, 50, 4);
				bExito = true;
			} catch (NumberFormatException e) {
				System.out.println("ERROR");
			} catch (Exception ex) {
				System.out.println("ERROR");
			}
		}
		return t.getPcc().modificar(oupdate);
	}
	
	
	public static void menuPelicula(TIENDA t) {
		boolean bExito = false;
		int opcion = 0;
		System.out.println("          PELICULA          ");
		System.out.println("1. Añadir Pelicula");
		System.out.println("2. Eliminar Pelicula");
		System.out.println("3. Modificar Pelicula");
		System.out.println("4. Buscar Pelicula");
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
				System.out.println("La pelicula se ha añadido con exito.");
			} else {
				System.out.println("La pelicula no se ha podido añadir.");
			}

			pelicula[] pelicula = t.getPcc().getaVector();
			for (int i = 0; i < t.getPcc().getbContadorArray(); i++) {
				System.out.println("Pelicula:" + pelicula[i]);
			}
			System.out.println("-------------------------------------------------------------------------");
			menuPelicula(t);
			break;

		case 2:
			if (remove(t)) {
				System.out.println("La pelicula se ha eliminado con exito.");
			} else {
				System.out.println("La pelicula no se ha podido añadir.");
			}

			pelicula[] pelicula1 = t.getPcc().getaVector();
			for (int i = 0; i < t.getPcc().getbContadorArray(); i++) {
				System.out.println("Pelicula:" + pelicula1[i]);
			}
			System.out.println("-------------------------------------------------------------------------");
			menuPelicula(t);
			break;

		case 3:
			if (update(t)) {
				System.out.println("La pelicula se ha modificado con exito.");
			} else {
				System.out.println("La pelicula no se ha podido modificar.");
			}

			pelicula[] pelicula2 = t.getPcc().getaVector();
			for (int i = 0; i < t.getPcc().getbContadorArray(); i++) {
				System.out.println("Pelicula:" + pelicula2[i]);
			}
			System.out.println("-------------------------------------------------------------------------");
			menuPelicula(t);
			break;

		case 4:
			if (search(t) != null) {
				System.out.println("La pelicula se ha mostrado con exito.");
			} else {
				System.out.println("La pelicula no se ha podido añadir.");
			}
			System.out.println("-------------------------------------------------------------------------");
			menuPelicula(t);
			break;
		case 5:
			VistaGeneral.menuPrincipal();;
			VistaGeneral.opcionMenuPrincipal(opcion = (int) LibFrontend.valida("Elige una opcion", 1, 3, 1), t);
			break;
		}
	}
}