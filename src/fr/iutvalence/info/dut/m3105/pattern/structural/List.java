package fr.iutvalence.info.dut.m3105.pattern.structural;

public interface List<E> {
	
	public void add(int index, E element);
	
	public E remove(int index);
	
	public E get(int index);
	
	public int size();

}
