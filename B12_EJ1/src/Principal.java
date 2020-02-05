public class Principal {
	public static void main(String[] args) {
		int bHora, bMinuto, bSegundo;
		bHora= (int) ValidaLibrary.valida("Dime una hora", 0, 24, 1);
		bMinuto= (int) ValidaLibrary.valida("Dime unos minutos", 0, 60, 1);
		bSegundo= (int) ValidaLibrary.valida("Dime unos segundos", 0, 60, 1);
		Reloj r1 = new Reloj(bHora, bMinuto, bSegundo);
		System.out.println(r1.formato24());
		System.out.println(r1.formato12());
		r1.ponerHora((byte) 21, (byte) 10);
		System.out.println(r1.formato24());
		r1.ponerHora((byte) 20, (byte) 50, (byte) 38);
		System.out.println(r1.formato24());
		r1.ponerHora((byte) 7, (byte) 28, (byte) 52, "PM");
	}
}