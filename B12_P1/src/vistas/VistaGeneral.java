package vistas;

import controller.TIENDA;
import medac.validaciones.LibFrontend;
import modelo.articulo;
import modelo.cliente;

public class VistaGeneral {

    public static void main(String[] args) {
        TIENDA tienda= new TIENDA();
        int opcion=0;
        menuPrincipal();
        boolean errorController=false;
        while(!errorController) {
            try {
                opcion = (int) LibFrontend.valida("Elige una opcion", 1, 3, 1);
                errorController=true;
            }catch(NumberFormatException e) {
                System.out.println("Error");
            }catch(Exception ex) {
                System.out.println("Error");
            }
        }
        opcionMenuPrincipal(opcion,tienda);
    }
    public static void menuPrincipal() {
        System.out.println("          TIENDA          ");
        System.out.println("1. Cliente");
        System.out.println("2. Articulo");
        System.out.println("3. Salir");

    }

    public static void opcionMenuPrincipal(int opcion, TIENDA t) {
        switch (opcion) {
        case 1:
            ClienteView.menuCliente(t);
        break;
        case 2:
            ArticuloView.menuArticulos(t);
        break;
        case 3:
            System.out.println("Fin del programa");
        break;
        }
    }

}