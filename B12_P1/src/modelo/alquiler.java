package modelo;

public class alquiler implements IAlquiler {
	private int iDiasdePrestamos;
	private int iPrecio;
	private int Id;
	
	public alquiler(int iDiasdePrestamos, int iPrecio, int Id) {
		setiDiasdePrestamos(iDiasdePrestamos);
		setiPrecio(iPrecio);
		setId(Id);
	}
	
	public alquiler( int Id) {
		setId(Id);
	}

	public int getiDiasdePrestamos() {
		return iDiasdePrestamos;
	}



	public boolean setiDiasdePrestamos(int iDiasdePrestamos) {
		boolean bExito=false;
		if(iDiasdePrestamos > 0 && iDiasdePrestamos<30) {
			this.iDiasdePrestamos = iDiasdePrestamos;
			bExito=true;
		}
		return bExito;
	}



	public int getiPrecio() {
		return iPrecio;
	}



	public boolean setiPrecio(int iPrecio) {
		boolean bExito=false;
		if(iPrecio > 0 ) {
			this.iPrecio = iPrecio;
			bExito=true;
		}
		return bExito;
		
	}



	public int getId() {
		return Id;
	}



	public boolean setId(int id) {
		boolean bExito=false;
		if(Id > 0) {
			this.Id = id;
			bExito=true;
		}
		return bExito;	
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Id;
		return result;
	}


	public boolean equals(Object obj) {
		boolean b = false;
		alquiler other = (alquiler) obj;
		if (this != null && other != null && this.Id == other.Id) {
			b = true;
		}
		return b;
	}
	
	@Override
	public String toString() {
		String sMensaje="";
		sMensaje += "Id de Alquiler: " + getId() +"\n";
		sMensaje += "Dias de prestamo: " + getiDiasdePrestamos()+"\n";
		sMensaje += "Precio" + getiPrecio()+"\n";
		return sMensaje;
	}	
}
