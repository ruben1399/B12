package controller;

public interface ICrud <T> {

	public T[] getArray();

	public int getContador();

	public int search(T Object);

	public boolean add(T Object);

	public boolean remove(T Object);

	public boolean update(T Object);


}