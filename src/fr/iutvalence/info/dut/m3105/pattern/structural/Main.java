package fr.iutvalence.info.dut.m3105.pattern.structural;

public class Main
{

	public static void main(String[] args)
	{
		Stack<String> stack = new ArrayStack<String>();
		List<String> list = new ArrayList<String>();
		new StackOfStringTester(stack).testStack();
		System.out.println("\nPassons aux listes\n");
		new StackOfStringTester(new ListAdapter(list)).testStack();
	}

}
