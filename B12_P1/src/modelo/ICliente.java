package modelo;

public interface ICliente {

	public int getIdCliente();

	public void setIdCliente(int idCliente);

	public String getsNombre();

	public void setsNombre(String sNombre);

	public int getiSaldo();

	public void setiSaldo(int iSaldo);

	public boolean validarCliente();

}