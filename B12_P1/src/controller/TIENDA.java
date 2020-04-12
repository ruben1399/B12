package controller;

import modelo.pelicula;

public class TIENDA {
	ArticuloController atcc;
	ClienteController clcc;
	CarritoController carcc;
	Pelicula_Controller pcc;
	AlquilerController acc;
	public TIENDA() {
		atcc = new ArticuloController();
		clcc = new ClienteController();
		carcc = new CarritoController();
		pcc = new Pelicula_Controller() ;
		acc = new AlquilerController() ;
	}
	public ArticuloController getAtcc() {
		return atcc;
	}

	public Pelicula_Controller getPcc() {
		return pcc;
	}
	public AlquilerController getAcc() {
		return acc;
	}

	public ClienteController getClcc() {
		return clcc;
	}

	public CarritoController getCarcc() {
		return carcc;
	}
	
	
}
