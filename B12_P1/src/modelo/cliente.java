package modelo;

public class cliente implements ICliente {
	private int idCliente;
	private String sNombre;
	private int iSaldo;
	public cliente(int idCliente, String sNombre, int iSaldo) {
		setIdCliente(idCliente);
		setsNombre(sNombre);
		setiSaldo(iSaldo);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCliente;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean b = false;
		cliente other = (cliente) obj;
		if (this != null && other != null && this.idCliente == other.idCliente) {
			b = true;
		}
		return b;
	}
	@Override
	public int getIdCliente() {
		return idCliente;
	}
	@Override
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
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
	public int getiSaldo() {
		return iSaldo;
	}
	@Override
	public void setiSaldo(int iSaldo) {
		this.iSaldo = iSaldo;
	}


	
	@Override
	public boolean validarCliente() {
		boolean bExito = false;
		if (this.idCliente != -1 && this.sNombre != null) {
			bExito = true;

		}
		return bExito;
	}
}