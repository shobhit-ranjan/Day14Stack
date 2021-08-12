
public class StackDemo {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>(4);
		stack.push("70");
		stack.push("30");
		stack.push("56");
		stack.push("22");
		System.out.println(stack.POP());
		//System.out.println(stack.POP());
		
	}

}
