public class Boletin9_P1 {
	public static void main(String[] args) {
		byte bHora, bMinuto, bSegundo;
		Reloj r1 = new Reloj((byte) 20, (byte) 2, (byte) 12);
		System.out.println(r1.formato24());
		System.out.println(r1.formato12());
		r1.ponerHora((byte) 21, (byte) 10);
		System.out.println(r1.formato24());
		r1.ponerHora((byte) 20, (byte) 50, (byte) 38);
		System.out.println(r1.formato24());
		r1.ponerHora((byte) 7, (byte) 28, (byte) 52, "PM");
	}
}