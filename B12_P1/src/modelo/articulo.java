package modelo;

public class articulo implements IArticulo {
	private int Id;
	private String sNombre;
	private double dPrecio;

	public articulo(int Id, String sNombre, double dPrecio) {
		setId(Id);
		setsNombre(sNombre);
		setdPrecio(dPrecio);
	}
	public articulo(int Id) {
		setId(Id);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean b = false;
		articulo other = (articulo) obj;
		if (this != null && other != null && this.Id == other.Id) {
			b = true;
		}
		return b;
	}

	public int getId() {
		return Id;
	}

	private boolean setId(int Id) {
		boolean bExito = false;
		if (Id > 0 && Id < 1000) {
			this.Id = Id;
			bExito = true;
		} else {
			this.Id = -1;
		}
		return bExito;
	}

	public String getsNombre() {
		return sNombre;
	}

	public boolean setsNombre(String sNombre) {
		boolean bExito = false;
		if (sNombre.length() < 20 && sNombre != null) {
			this.sNombre = sNombre;
			bExito = true;

		} else {
			sNombre = null;
		}
		return bExito;
	}

	public double getdPrecio() {
		return dPrecio;
	}

	public boolean setdPrecio(double dPrecio) {
		boolean bExito = false;
		if (dPrecio > 0) {
			this.dPrecio = dPrecio;
			bExito = true;

		} else {
			dPrecio = -1;
		}
		return bExito;
	}

	@Override
	public String toString() {
		String sResultado = "";
		sResultado += "-------------------------------------- \n";
		sResultado += "Id: " + getId() + "\n";
		sResultado += "Articulo: " + getsNombre() + "\n";
		sResultado += "Precio: " + getdPrecio() + "\n";
		sResultado += "--------------------------------------";
		return sResultado;
	}

	public boolean validarArticulo() {
		boolean bExito = false;
		if (this.Id != -1 && this.dPrecio != -1 && this.sNombre != null) {
			bExito = true;

		}
		return bExito;
	}
}
