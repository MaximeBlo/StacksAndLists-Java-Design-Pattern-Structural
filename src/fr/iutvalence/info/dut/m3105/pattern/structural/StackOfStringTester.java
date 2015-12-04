package fr.iutvalence.info.dut.m3105.pattern.structural;

public class StackOfStringTester {

	private Stack<String> stack;
	
	public StackOfStringTester(Stack<String> stack) {
		this.stack = stack;
	}

	public void testStack() {
		System.out.println("Size of the stack: "+this.stack.size());
		this.stack.push("a");
		System.out.println("Size of the stack: "+this.stack.size());
		this.stack.push("b");
		System.out.println("Size of the stack: "+this.stack.size());
		System.out.println("Peek of the stack: "+this.stack.peek());
		System.out.println("Size of the stack: "+this.stack.size());
		System.out.println("Element of the stack: "+this.stack.pop());
		System.out.println("Size of the stack: "+this.stack.size());
		System.out.println("Element of the stack: "+this.stack.pop());
		System.out.println("Size of the stack: "+this.stack.size());
	}

}
