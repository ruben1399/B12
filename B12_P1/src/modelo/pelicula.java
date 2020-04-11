package modelo;

public class pelicula implements IPelicula {
	private int Id;
	private String sNombre;
	private String sSinopsis;
	private String sTipo;
	private int iPrecio;

	public pelicula(int id, String sNombre, String sSinopsis, String sTipo, int iPrecio) {
		setiPrecio(iPrecio);
		setId(id);
		setsNombre(sNombre);
		setsSinopsis(sSinopsis);
		setsTipo(sTipo);
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
		pelicula other = (pelicula) obj;
		if (this != null && other != null && this.Id == other.Id) {
			b = true;
		}
		return b;
	}

	@Override
	public int getiPrecio() {
		return iPrecio;
	}

	@Override
	public void setiPrecio(int iPrecio) {
		this.iPrecio = iPrecio;
	}

	@Override

	public int getId() {
		return Id;
	}

	private void setId(int id) {
		Id = id;
	}

	@Override
	public String getsTipo() {
		return sTipo;
	}

	@Override
	public void setsTipo(String sTipo) {
		this.sTipo = sTipo;
	}

	@Override
	public String getsNombre() {
		return sNombre;
	}

	@Override
	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	@Override
	public String getsSinopsis() {
		return sSinopsis;
	}

	@Override
	public void setsSinopsis(String sSinopsis) {
		this.sSinopsis = sSinopsis;
	}

	@Override
	public String toString() {
		String sMensaje="";
		sMensaje += "Id de pelicula: " + getId();
		sMensaje += "Nombre de la pelicula: " + getsNombre();
		sMensaje += "Sipnopsis" + getsSinopsis();
		sMensaje += "Tipo de pelicula" + getsTipo();
		sMensaje += "Precio: " + getiPrecio();
		return sMensaje;
	}

}
