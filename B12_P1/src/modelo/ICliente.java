package modelo;

public interface ICliente {

	public int getIdCliente();
	public boolean setIdCliente(int idCliente);
	public String getsNombre();
	public boolean setsNombre(String sNombre);
	public int getiSaldo();
	public boolean setiSaldo(int iSaldo);
	public boolean validarCliente();
}