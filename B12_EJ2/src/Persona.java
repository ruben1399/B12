public class Persona {
	private String sNombre, sApellido1, sApellido2;
	private byte bEstado;
	private short shEdad;
	private float fEstatura, fPeso;

	public Persona() {
	}

	public Persona(String sNombre, String sApellido1, String sApellido2, short shEdad, float fEstatura, float fPeso,
			byte bEstado) {

		this.setsNombre(sNombre);
		this.setsApellido1(sApellido1);
		this.setsApellido2(sApellido2);
		this.setshEdad(shEdad);
		this.setfEstatura(fEstatura);
		this.setfPeso(fPeso);
		this.setbEstado(bEstado);
	}

	public Persona(String sNombre, String sApellido1, String sApellido2) {
		this.setsNombre(sNombre);
		this.setsApellido1(sApellido1);
		this.setsApellido2(sApellido2);
	}

	public String getsNombre() {
		return sNombre;
	}

	public boolean setsNombre(String sNombre) {
		boolean bExito = false;
		if (!sNombre.equals("") && sNombre.length() < 15) {
			this.sNombre = sNombre;
			bExito = true;
		}
		return bExito;
	}

	public String getsApellido1() {
		return sApellido1;
	}

	public boolean setsApellido1(String sApellido1) {
		boolean bExito = false;
		if (!sApellido1.equals("") && sApellido1.length() < 20) {
			this.sApellido1 = sApellido1;
			bExito = true;
		}
		return bExito;
	}

	public String getsApellido2() {
		return sApellido2;
	}

	public boolean setsApellido2(String sApellido2) {
		boolean bExito = false;
		if (!sApellido2.equals("") && sApellido2.length() < 20) {
			this.sApellido2 = sApellido2;
			bExito = true;
		}
		return bExito;
	}

	public short getshEdad() {
		return shEdad;
	}

	public void setshEdad(short shEdad) {
		if (this.getshEdad() < shEdad && (shEdad > 0 && shEdad < 150)) {
			this.shEdad = shEdad;
		}
	}

	public float getfEstatura() {
		return fEstatura;
	}

	public void setfEstatura(float fEstatura) {
		if (fEstatura > 0 && fEstatura < 3) {
			this.fEstatura = fEstatura;
		}
	}

	public float getfPeso() {
		return fPeso;
	}

	public void setfPeso(float fPeso) {
		if (fPeso > 0 && fPeso < 300) {
			this.fPeso = fPeso;
		}
	}

	public byte getbEstado() {
		return bEstado;
	}

	public void setbEstado(byte bEstado) {
		if (this.getbEstado() == 0)
			this.bEstado = bEstado;
		else if (this.getbEstado() == 2 && (bEstado != 1)) {
			this.bEstado = bEstado;
		} else if (this.getbEstado() == 1 && bEstado == 2) {
			this.bEstado = bEstado;
		} else if (this.getbEstado() == 3 && (bEstado == 4 || bEstado == 5)) {
			this.bEstado = bEstado;
		} else if (this.getbEstado() == 4 && (bEstado == 2)) {
			this.bEstado = bEstado;
		} else if (this.getbEstado() == 5 && (bEstado == 2)) {
			this.bEstado = bEstado;
		}
	}

	public String conversionEstado() {
		if (this.getbEstado() == 1)
			return "SOLTERO";
		else if (this.getbEstado() == 2)
			return "CASADO";
		else if (this.getbEstado() == 3)
			return "SEPARADO";
		else if (this.getbEstado() == 4)
			return "DIVORCIADO";
		else if (this.getbEstado() == 5)
			return "VIUDO";
		else
			return "ERROR. Elemento no valido";

	}

	public String toString() {
		String sResultado = "";
		sResultado += "Nombre: " + this.getsNombre() + "\n";
		sResultado += "Apellido1: " + this.getsApellido1() + "\n";
		sResultado += "Apellido2: " + this.getsApellido2() + "\n";
		sResultado += "Edad: " + this.getshEdad() + "\n";
		sResultado += "Estatura: " + this.getfEstatura() + "\n";
		sResultado += "Peso: " + this.getfPeso() + "\n";
		sResultado += "Estado: " + this.conversionEstado() + "\n";
		return sResultado;
	}
}