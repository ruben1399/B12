package modelo;

public class cliente {
	private int idCliente;
	private String sNombre;
	private int iSaldo;
	
	
	
	public cliente(int idCliente, String sNombre, int iSaldo) {
		setIdCliente(idCliente);
		this.sNombre(sNombre);
		this.iSaldo = iSaldo;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getsNombre() {
		return sNombre;
	}
	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}
	public int getiSaldo() {
		return iSaldo;
	}
	public void setiSaldo(int iSaldo) {
		this.iSaldo = iSaldo;
	}

}
