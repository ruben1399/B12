public class Reloj {
	private int bHora;
	private int bMinuto;
	private int bSegundo;

	public Reloj(int bHora, int bMinuto, int bSegundo) {
		setbHora(bHora);
		setbMinuto(bMinuto);
		setbSegundo(bSegundo);
	}

	public int getbHora() {
		return bHora;
	}

	public boolean setbHora(int bHora) {
		boolean bExito = false;
		if (bHora >= 0 && bHora < 24) {
			this.bHora = bHora;
			bExito = true;
		}
		return bExito;
	}

	public int getbMinuto() {
		return bMinuto;
	}

	public boolean setbMinuto(int bMinuto) {
		boolean bExito = false;
		if (bMinuto >= 0 && bMinuto < 60) {
			this.bMinuto = bMinuto;
			bExito = true;
		}
		return bExito;
	}

	public int getbSegundo() {
		return bSegundo;
	}

	public boolean setbSegundo(int bSegundo) {
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

	public void ponerHora(int bHora, int bMinuto) {
		setbHora(bHora);
		setbMinuto(bMinuto);
		setbSegundo((int) 0);
	}

	public void ponerHora(int bHora, int bMinuto, int bSegundo) {
		ponerHora(bHora, bMinuto);
		setbSegundo(bSegundo);
	}

	public void ponerHora(int bHora, int bMinuto, int bSegundo, String franjaHoraria) {

		if (franjaHoraria.equals("am")) {
			ponerHora(bHora, bMinuto, bSegundo);
		} else {
			ponerHora((int) (bHora + 12), bMinuto, bSegundo);
		}
	}
}