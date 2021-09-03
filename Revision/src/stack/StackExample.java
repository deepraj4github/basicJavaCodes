package stack;
import java.util.Stack;
public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> animals = new Stack<String>();
		animals.push("Lion");
		animals.push("Dog");
		animals.push("Rabbit");
		animals.push("Cat");
		animals.push("Horse");
		
		System.out.println(animals);
		System.out.println(animals.peek());
		System.out.println(animals.pop());
		System.out.println(animals);

	}

}
