package AutomationFramework.FirstDay;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_without_Generics_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList names = new ArrayList();
	    names.add("Chaitanya");
	    names.add("Steve");
	    names.add("Jack");
	 
	    Iterator it = names.iterator();
	 
	    while(it.hasNext()) {
	      String obj = (String)it.next();
	      System.out.println(obj);
	    }
	}

}
