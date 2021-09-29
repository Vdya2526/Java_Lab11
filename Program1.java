package lab11;

import java.util.ArrayList;
import java.util.List;

public class Program1 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		  l1.add("cat");
		  l1.add("dog");
		l1.add("rabbit");
		 l1.add("fox");
		  l1.add("cow");
		
		  System.out.println(l1);
		  // Retrive the first and third element
		  String element = l1.get(0);
		  System.out.println("First element: "+element);
		  element = l1.get(2);
		  System.out.println("Third element: "+element);

	}

}
