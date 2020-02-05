public class Principal {
	public static void main(String[] args) {
		int bHora = 0, bMinuto= 0, bSegundo= 0;
		boolean errorControl = true;
		//Escepcion de hora
		while (errorControl) {
			try {
				bHora= (int) ValidaLibrary.valida("Dime una hora", 0, 24, 1); 
				errorControl = false;
			} catch (NumberFormatException ex) {
				System.out.println(ex.getMessage());
			}
		}
		
		//Excepcion de Minutos
		errorControl=true;
		while (errorControl) {
			try {
				bMinuto= (int) ValidaLibrary.valida("Dime unos minutos", 0, 60, 1); 
				errorControl = false;
			} catch (NumberFormatException ex) {
				System.out.println(ex.getMessage());
			}
		}
		//Excepcion de Segundos
		errorControl=true;
		while (errorControl) {
			try {
				bSegundo= (int) ValidaLibrary.valida("Dime unos segundos", 0, 60, 1); 
				errorControl = false;
			} catch (NumberFormatException ex) {
				System.out.println(ex.getMessage());
			}
		}

		Reloj r1 = new Reloj(bHora, bMinuto, bSegundo);
		System.out.println(r1.formato24());
		System.out.println(r1.formato12());
		r1.ponerHora(bHora, bMinuto);
		System.out.println(r1.formato24());
		r1.ponerHora(bHora, bMinuto, bSegundo);
		System.out.println(r1.formato24());
		r1.ponerHora(bHora, bMinuto, bSegundo, "PM");
	}
}