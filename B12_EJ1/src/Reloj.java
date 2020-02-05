public class Reloj {
	private byte bHora;
	private byte bMinuto;
	private byte bSegundo;

	public Reloj() {
		setbHora((byte) 0);
		setbMinuto((byte) 0);
		setbSegundo((byte) 0);
	}

	public Reloj(byte bHora, byte bMinuto, byte bSegundo) {
		setbHora(bHora);
		setbMinuto(bMinuto);
		setbSegundo(bSegundo);
	}

	public byte getbHora() {
		return bHora;
	}

	public boolean setbHora(byte bHora) {
		boolean bExito = false;
		if (bHora >= 0 && bHora < 24) {
			this.bHora = bHora;
			bExito = true;
		}
		return bExito;
	}

	public byte getbMinuto() {
		return bMinuto;
	}

	public boolean setbMinuto(byte bMinuto) {
		boolean bExito = false;
		if (bMinuto >= 0 && bMinuto < 60) {
			this.bMinuto = bMinuto;
			bExito = true;
		}
		return bExito;
	}

	public byte getbSegundo() {
		return bSegundo;
	}

	public boolean setbSegundo(byte bSegundo) {
		boolean bExito = false;
		if (bSegundo >= 0 && bSegundo < 60) {
			this.bSegundo = bSegundo;
		}
		return bExito;
	}

	public String formato24() {
		return toString();
	}

	public String formato12() {
		String sResultado = "";
		if (bHora > 12) {
			sResultado += (this.bHora - 12) + ":" + this.bMinuto + ":"

					+ this.bSegundo;

			sResultado += " pm";
		} else {
			sResultado += toString();
			sResultado += " am";
		}
		return sResultado;
	}

	public String toString() {
		String sResultado = "";
		sResultado += this.bHora + ":";
		sResultado += this.bMinuto + ":";
		sResultado += this.bSegundo + "\n";
		return sResultado;
	}

	public void ponerHora(Byte bHora, Byte bMinuto) {
		setbHora(bHora);
		setbMinuto(bMinuto);
		setbSegundo((byte) 0);
	}

	public void ponerHora(Byte bHora, Byte bMinuto, Byte bSegundo) {
		ponerHora(bHora, bMinuto);
		setbSegundo(bSegundo);
	}

	public void ponerHora(Byte bHora, Byte bMinuto, Byte bSegundo, String franjaHoraria) {

		if (franjaHoraria.equals("am")) {
			ponerHora(bHora, bMinuto, bSegundo);
		} else {
			ponerHora((byte) (bHora + 12), bMinuto, bSegundo);
		}
	}
}