import java.util.*;
public class ListTester {
	public static void main(String[] args) {
		LinkedList patrick = new LinkedList();	
		for(int i = 0; i < 10; i++) {
			patrick.add(i);
		}
		System.out.println(patrick);
		// find
		System.out.println(patrick.find(0));
		System.out.println(patrick.find(5));
		
		// length
		// isEmpty
		// clear
		
		// TO DO
		// insert
		patrick.insert(15, 0);
		System.out.println(patrick);
		patrick.insert(25, 5);
		System.out.println(patrick);
		System.out.println(patrick.insert(99, 15));
		patrick.insert(75, 12);
		System.out.println(patrick);
		System.out.println(patrick.length());
		
		// remove position
		// remove beginning
		System.out.println(patrick.remove(0));
		System.out.println(patrick);
		// remove middle
		System.out.println(patrick.remove(7));
		System.out.println(patrick);
		// remove end
		System.out.println(patrick.remove(patrick.length() - 1));
		System.out.println(patrick);
		// remove non existent position
		System.out.println(patrick.remove(25));
		System.out.println(patrick);
		
		// remove element
		System.out.println(patrick.remove((Integer) 6));
		System.out.println(patrick.remove((Integer) 25));
		System.out.println(patrick);
		
		
	}

}
