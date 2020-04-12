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
	public pelicula(int id) {
		setId(id);
	}


	@Override
	public int getiPrecio() {
		return iPrecio;
	}

	@Override
	public boolean setiPrecio(int iPrecio) {
		boolean bExito=false;
		if(iPrecio > 0 ) {
			this.iPrecio = iPrecio;
			bExito=true;
		}
		return bExito;
	}
		
	@Override

	public int getId() {
		return Id;
	}

	private boolean setId(int id) {
		boolean bExito=false;
		if(Id > 0 ) {
			this.Id = id;
			bExito=true;
		}
		return bExito;
		
	}

	@Override
	public String getsTipo() {
		return sTipo;
	}

	@Override
	public boolean setsTipo(String sTipo) {
		boolean bExito=false;
		if(!sTipo.equals("") && sTipo.length()<50) {
			this.sTipo = sTipo;
			bExito=true;
		}
		return bExito;
		
	}

	@Override
	public String getsNombre() {
		return sNombre;
	}

	@Override
	public boolean setsNombre(String sNombre) {
		boolean bExito=false;
		if(!sNombre.equals("") && sNombre.length()<50) {
			this.sNombre = sNombre;
			bExito=true;
		}
		return bExito;
	}

	@Override
	public String getsSinopsis() {
		return sSinopsis;
	}

	@Override
	public boolean setsSinopsis(String sSinopsis) {
		boolean bExito=false;
		if(!sSinopsis.equals("") && sSinopsis.length()<250) {
			this.sSinopsis = sSinopsis;
			bExito=true;
		}
		return bExito;
		
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
