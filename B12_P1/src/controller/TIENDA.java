package controller;



public class TIENDA {
	ArticuloController atcc;
	ClienteController clcc;
	CarritoController carcc;
	public TIENDA() {
		atcc = new ArticuloController();
		clcc = new ClienteController();
		carcc = new CarritoController();
	}
	public ArticuloController getAtcc() {
		return atcc;
	}

	public ClienteController getClcc() {
		return clcc;
	}

	public CarritoController getCarcc() {
		return carcc;
	}
	
	
	


}
