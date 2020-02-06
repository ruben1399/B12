public class Principal {
	public static void main(String[] args) {
		String sNombre = "", sApellido1, sApellido2;
		byte bEstado = 0;
		short shEdad = 0;
		float fEstatura = 0, fPeso = 0;
		boolean bEstadoError;
		String[] lVector = new String[5];
		for (int iContador = 0; iContador < lVector.length; iContador++) {

			do {
				sNombre = Libreria.leer("Introduce un nombre: ");
			} while (!sNombre.equals("") && sNombre.length() > 15);
			lVector[iContador] = sNombre;
		}

		do {
			sApellido1 = Libreria.leer("Introduce un primero apellido:");

		} while (!sApellido1.equals("") && sApellido1.length() > 20);
		do {
			sApellido2 = Libreria.leer("Introduce un segundo apellido:");

		} while (!sApellido2.equals("") && sApellido2.length() > 20);

		// TRYCATCH EDAD
		bEstadoError = true;
		while (bEstadoError) {

			try {
				shEdad = (short) Libreria.valida("Introduce una edad (0-150): ", 0, 150, 4);
				bEstadoError = false;
			} catch (NumberFormatException ex) {
				System.out.println(ex.getMessage());
			}
		}

		// TRYCATCH ESTATURA
		bEstadoError = true;
		while (bEstadoError) {

			try {
				fEstatura = (float) Libreria.valida("Introduce una estatura en metros (0 - 3): ", 0, 3, 2);
				bEstadoError = false;
			} catch (NumberFormatException ex) {
				System.out.println(ex.getMessage());
			}
		}

		// TRYCATCH PESO
		bEstadoError = true;
		while (bEstadoError) {

			try {
				fPeso = (float) Libreria.valida("Introduce un peso en kilos (0 -300): ", 0, 300, 2);
				bEstadoError = false;
			} catch (NumberFormatException ex) {
				System.out.println(ex.getMessage());
			}
		}

		// TRYCATCH ESTADO
		bEstadoError = true;
		while (bEstadoError) {

			try {
				bEstado = (byte) Libreria.valida(
						"Selecciona su estado:\n1 - SOLTERO\n2 - CASADO\n3 - SEPARADO\n4 - DIVORCIADO\n5 - VIUDO", 1, 5,
						3);
				bEstadoError = false;
			} catch (NumberFormatException ex) {
				System.out.println(ex.getMessage());
			}
		}

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