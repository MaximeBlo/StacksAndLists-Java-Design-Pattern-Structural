package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ListAdapter<E> implements Stack<E>{

	private List list;
	
	public ListAdapter(List theList) {
		this.list = theList;
	}
	@Override
	public void push(E element) {
		this.list.add(this.list.size(),element);
	}

	@Override
	public E pop() {
		return (E) this.list.remove(this.list.size()-1);
	}

	@Override
	public E peek() {
		return (E) this.list.get(this.list.size()-1);
	}

	@Override
	public int size() {
		return this.list.size();
	}

}
