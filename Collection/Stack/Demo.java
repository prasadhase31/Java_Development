
import java.util.*;
class Demo{
	
	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<>();

		stack.push(10);
		stack.push(20);
		stack.push(30);

		System.out.println(stack);

		stack.pop();
		stack.peek();

		System.out.println(stack);
	}
}