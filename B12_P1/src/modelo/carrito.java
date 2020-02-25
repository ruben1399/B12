package modelo;

import java.util.Arrays;

public class carrito implements ICarrito {
	private articulo[] arrayCarrito;
	private int iContArtCarrito;
	

	public carrito(articulo[] arrayCarrito, int iContArtCarrito) {
		setArrayCarrito(arrayCarrito);
		setiContArtCarrito(iContArtCarrito);
	}

	@Override
	public articulo[] getArrayCarrito() {
		return arrayCarrito;
	}

	@Override
	public void setArrayCarrito(articulo[] arrayCarrito) {
		this.arrayCarrito = arrayCarrito;
	}

	@Override
	public int getiContArtCarrito() {
		return iContArtCarrito;
	}

	@Override
	public void setiContArtCarrito(int iContArtCarrito) {
		this.iContArtCarrito = iContArtCarrito;
	}

	@Override
	public int getMAXARTCARRITO() {
		return MAXARTCARRITO;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + MAXARTCARRITO;
		result = prime * result + Arrays.hashCode(arrayCarrito);
		result = prime * result + iContArtCarrito;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		carrito other = (carrito) obj;
		if (MAXARTCARRITO != other.MAXARTCARRITO)
			return false;
		if (!Arrays.equals(arrayCarrito, other.arrayCarrito))
			return false;
		if (iContArtCarrito != other.iContArtCarrito)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Hay " + getiContArtCarrito() + " Articulos que son: " + Arrays.toString(arrayCarrito);
	}

}
