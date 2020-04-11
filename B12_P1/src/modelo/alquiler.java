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
		alquiler other = (alquiler) obj;
		if (this != null && other != null && this.Id == other.Id) {
			b = true;
		}
		return b;
	}
	
	@Override
	public int getId() {
		return Id;
	}

	private void setId(int id) {
		Id = id;
	}

	@Override
	public int getiDiasdePrestamos() {
		return iDiasdePrestamos;
	}

	@Override
	public boolean setiDiasdePrestamos(int iDiasdePrestamos) {
		boolean bExito=false;
		if(iDiasdePrestamos> 0 && iDiasdePrestamos < MAXDIASALQUILER) {
		this.iDiasdePrestamos = iDiasdePrestamos;
		bExito=true;
		}
	return bExito;
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
	public int getMAXDIASALQUILER() {
		return MAXDIASALQUILER;
	}
	
	@Override
	public String toString() {
		String sMensaje="";
		sMensaje += "Id de Alquiler: " + getId();
		sMensaje += "Dias de prestamo: " + getiDiasdePrestamos();
		sMensaje += "Precio" + getiPrecio();
		return sMensaje;
	}
	
}
