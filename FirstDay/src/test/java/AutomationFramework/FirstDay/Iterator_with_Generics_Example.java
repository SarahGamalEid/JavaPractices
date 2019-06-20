package AutomationFramework.FirstDay;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_with_Generics_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
	    names.add("Chaitanya");
	    names.add("Steve");
	    names.add("Jack");
	 
	    Iterator<String> it = names.iterator();
	 
	    while(it.hasNext()) {
	      String obj = it.next();
	      System.out.println(obj);
	    }
	}

}
