package modelo;

public interface IArticulo {
	public int getId();

	public String getsNombre();

	public boolean setsNombre(String sNombre);

	public double getdPrecio();

	public boolean setdPrecio(double dPrecio);

	public boolean validarArticulo();
}
