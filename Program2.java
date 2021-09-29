package lab11;

import java.util.ArrayList;
import java.util.List;

public class Program2 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
    
    l1.add("Dell");
   l1.add("IBM");
    l1.add("HP");
    l1.add("Apple");
    
    /*
     * To replace element in ArrayList, use
     * set(int index, E element)
     * method.
     */
    
    
    String replaced = l1.set(1, "Lenovo");
    
    System.out.println(replaced + " replaced with " + "Lenovo");
    
    
    for(String laptop : l1)
        System.out.println(laptop);
	}

}
