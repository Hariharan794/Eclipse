package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class Types {
	public static void main(String[] args) {
		Map<Integer, String> as = new LinkedHashMap<Integer, String>();
	 
		                                 //Insertion Order 
		as.put(15, "asdfgh");
		as.put(45, "rtyygyb");
		as.put(44, "sdfghj");
		as.put(55, null);
		as.put(12, "fgtrf");
		as.put(2, "ert");
		
		System.out.println(as);
		
		
		
		Map<Integer, String> q = new HashMap<Integer, String>();
		                                //Random Order 
		q.put(20, "lkuj");
		q.put(56, "wert");
		q.put(369,"tghy");
		q.put(9, "rftg");
		q.put(41, "as");
		q.put(87, "yhju");
		q.put(45, "tuik");
		
		System.out.println(q);
		
		
		Map<Integer, String> a = new TreeMap<Integer, String>();
		                           //ascending Order
		a.put(9, "dvf");
		a.put(21, "klm");
		a.put(14, "25");
		a.put(5, "mnb");
		a.put(20, "df");
		a.put(56, "dwerf");
		a.put(7, "vvbc");
		
		
		System.out.println(a);
		
		
		
	}


}
