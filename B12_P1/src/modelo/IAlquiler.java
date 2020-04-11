package modelo;

public interface IAlquiler {
	public final int MAXDIASALQUILER = 30;

	public int getId();

	public int getiDiasdePrestamos();

	public boolean setiDiasdePrestamos(int iDiasdePrestamos);

	public int getiPrecio();

	public void setiPrecio(int iPrecio);

	public int getMAXDIASALQUILER();

}