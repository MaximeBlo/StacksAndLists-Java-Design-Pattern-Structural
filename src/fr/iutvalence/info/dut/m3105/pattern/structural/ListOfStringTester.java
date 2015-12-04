package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ListOfStringTester {

	private List<String> theList;
	
	public ListOfStringTester(List<String> liste) {
		this.theList =  liste;
	}

	public void testList() {
		System.out.println("Size of the list: "+this.theList.size());
		this.theList.add(0,"a");
		System.out.println("Size of the list: "+this.theList.size());
		this.theList.add(1,"b");
		System.out.println("Size of the list: "+this.theList.size());
		System.out.println("Get of the list: "+this.theList.get(1));
		System.out.println("Size of the list: "+this.theList.size());
		System.out.println("Remove element of the list: "+this.theList.remove(1));
		System.out.println("Size of the list: "+this.theList.size());
		System.out.println("Remove element of the list: "+this.theList.remove(0));
		System.out.println("Size of the list: "+this.theList.size());
	}

}
