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
	
	public cliente (int idCliente) {
		setIdCliente(idCliente);
	}

	@Override
	public int getIdCliente() {
		return idCliente;
	}
	@Override
	public boolean setIdCliente(int idCliente) {
		boolean bExito=false;
		if(idCliente > 0) {
			this.idCliente = idCliente;
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
	public int getiSaldo() {
		return iSaldo;
	}
	
	@Override
	public boolean setiSaldo(int iSaldo) {
		boolean bExito=false;
		if(iSaldo > 0) {
			this.iSaldo = iSaldo;
			bExito=true;
		}
		return bExito;
	}
	
	@Override
	public boolean validarCliente() {
		boolean bExito = false;
		if (this.idCliente != -1 && this.sNombre != null) {
			bExito = true;

		}
		return bExito;
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
	public String toString() {
		String sResultado = "";
		sResultado += "-------------------------------------- \n";
		sResultado += "Id Cliente: " + getIdCliente() + "\n";
		sResultado += "Cliente: " + getsNombre() + "\n";
		sResultado += "Precio: " + getiSaldo() + "\n";
		sResultado += "-------------------------------------- \n";
		return sResultado;
	}
	
}