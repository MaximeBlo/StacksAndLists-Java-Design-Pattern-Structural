package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayList<E> implements List<E> {

	private Object[] list;
	private int currentSize;
	
	public ArrayList(){
		this.currentSize = 0;
		this.list = (E[]) new Object[10];
	}
	
	@Override
	public void add(int index, Object element) {
		this.currentSize++;
		this.list[index] = element;
	}

	@Override
	public E remove(int index) {
		this.currentSize--;
		return (E) this.list[index];
	}

	@Override
	public E get(int index) {
		return (E) this.list[index];
	}

	@Override
	public int size() {
		return this.currentSize;
	}
	

}
