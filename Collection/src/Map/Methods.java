package Map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class Methods {
	public static void main(String[] args) {
		Map<Integer, String> as = new LinkedHashMap<Integer, String>();

		                           // Insertion Order
		as.put(15, "asdfgh");
		as.put(45, "rtyygyb");
		as.put(44, "sdfghj");
		as.put(55, null);
		as.put(12, "fgtrf");
		as.put(2, "ert");

		System.out.println(as);
		
		
		as.put(01, "dof");              //Insert a new values
		System.out.println(as);
		
		boolean containsKey = as.containsKey(44);     //contains only key is present
		System.out.println(containsKey);
		
		boolean containsValue = as.containsValue("asdfgh");    //contains only value is present
		System.out.println(containsValue);
		
		
		as.remove(45,"rtyygyb");        // a key,value same time remove
		System.out.println(as);
		
		String string = as.get(2);    // getting a specific value 
		System.out.println(string);
		
		int size = as.size();
		System.out.println(size);
		
		Collection<String> values = as.values();    // specifically values displaying
		System.out.println(values);
		
		Set<Entry<Integer,String>> entrySet = as.entrySet();
		System.out.println(entrySet);
		
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(as.get(entry));
		}
		
		
		
		
		
		
	}
	

}
