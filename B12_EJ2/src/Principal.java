
public class Principal {
	public static void main(String[] args) {
		String sNombre, sApellido1, sApellido2;
		byte bEstado;
		short shEdad;
		float fEstatura, fPeso;
		do {
			sNombre = Libreria.Leer("Introduce un nombre: ");
			} while (!sNombre.equals("") && sNombre.length()>15);
		
		
	}}