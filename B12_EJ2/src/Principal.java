public class Principal {
	public static void main(String[] args) {
		String sNombre, sApellido1, sApellido2;
		byte bEstado;
		short shEdad;
		float fEstatura, fPeso;
		boolean bEstadoError;
		/*
		 * Intento de TRYCATCH
		 *
		 * try { sNombre=Libreria.leer("Introduce un nombre"); bEstadoError=false; }
		 * catch () { System.out.println(ex.getMessage()); }
		 *
		 */

		do {
			sNombre = Libreria.leer("Introduce un nombre: ");
		} while (!sNombre.equals("") && sNombre.length() > 15);

		do {
			sApellido1 = Libreria.leer("Introduce un primero apellido:");

		} while (!sApellido1.equals("") && sApellido1.length() > 20);
		do {
			sApellido2 = Libreria.leer("Introduce un segundo apellido:");

		} while (!sApellido2.equals("") && sApellido2.length() > 20);
		shEdad = (short) Libreria.valida("Introduce una edad (0-150): ", 0, 150, 4);

		fEstatura = (float) Libreria.valida("Introduce una estatura en metros (0 - 3): ", 0, 3, 2);

		fPeso = (float) Libreria.valida("Introduce un peso en kilos (0 -300): ", 0, 300, 2);

		bEstado = (byte) Libreria.valida(
				"Selecciona su estado:\n1 - SOLTERO\n2 - CASADO\n3 - SEPARADO\n4 - DIVORCIADO\n5 - VIUDO", 1, 5, 3);
		Persona oPersona2 = new Persona(sNombre, sApellido1, sApellido2,

				shEdad, fEstatura, fPeso, bEstado);
		System.out.println(oPersona2);
		System.out.println(oPersona2);
		oPersona2.setbEstado((byte) 2);
		System.out.println(oPersona2);
		System.out.println(oPersona2);
		oPersona2.setshEdad((short) 100);
		System.out.println(oPersona2);

	}
}