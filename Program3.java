package lab11;


import java.util.ArrayList;
import java.util.List;

public class Program3 {

	public static void main(String[] args) {
		 List a1 = new ArrayList();
	      a1.add("A");
	      a1.add("B");
	      a1.add("C");
	      a1.add("D");
	      a1.add("E");
	      int index1 = a1.indexOf("C");
	      int index2 = a1.indexOf("Z");
System.out.println(index1);
System.out.println(index2);
	}

}
