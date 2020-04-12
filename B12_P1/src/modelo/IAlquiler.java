package modelo;

public interface IAlquiler {
	public final int MAXDIASALQUILER = 30;

	public int hashCode() ;
	public boolean equals(Object obj);
	public int getId();
	public boolean setId(int id);
	public int getiDiasdePrestamos();
	public boolean setiDiasdePrestamos(int iDiasdePrestamos);
	public int getiPrecio();
	public boolean setiPrecio(int iPrecio);
}