package controller;

import modelo.cliente;

public interface IClienteController {
	public final int MAXCLIENTE = 100;
	public String mostrarClientes();
	public void setContador(int contador);
}
