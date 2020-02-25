package modelo;

public interface ICarrito {
	public final int MAXARTCARRITO = 100;
	public articulo[] getArrayCarrito();

	public void setArrayCarrito(articulo[] arrayCarrito);

	public int getiContArtCarrito();

	public void setiContArtCarrito(int iContArtCarrito);

	public int getMAXARTCARRITO();

}