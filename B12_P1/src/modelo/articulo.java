package modelo;

import javax.print.attribute.standard.MediaSize.Other;

public class articulo {
	private int Id;
	private String sNombre;
	private double dPrecio;

	public articulo(int id, String sNombre, double dPrecio) {
		setId(id);
		setsNombre(sNombre);
		setdPrecio(dPrecio);
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

	public void setId(int id) {
		Id = id;
	}

	public String getsNombre() {
		return sNombre;
	}

	public boolean setsNombre(String sNombre) {
		boolean bExito = false;
		if (sNombre.length() < 20 && sNombre != null) {
			bExito = true;
			this.sNombre = sNombre;
		}
		return bExito;
	}

	public double getdPrecio() {
		return dPrecio;
	}

	public boolean setdPrecio(double dPrecio) {
		boolean bExito = false;
		if (dPrecio > 0) {
			bExito = true;
			this.dPrecio = dPrecio;
		}
		return bExito;
	}

	@Override
	public String toString() {
		String sResultado = "";
		sResultado += "Id: " + getId() + "\n";
		sResultado += "Articulo: " + getsNombre() + "\n";
		sResultado += "Precio: " + getdPrecio() + "\n";
		return sResultado;
	}

}
