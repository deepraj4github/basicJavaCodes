package arraylistdemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(15);
		list1.add(20);
		list1.add(25);
		System.out.println(list1);
		list1.add(2, 50);
		System.out.println(list1);
		list1.remove(1);
		System.out.println(list1);
		list1.set(1, 100);
		System.out.println(list1);

	}

}
