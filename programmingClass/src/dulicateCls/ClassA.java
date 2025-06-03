package dulicateCls;

import java.util.LinkedHashSet;
import java.util.Set;

public class ClassA {
	public static void main(String[] args) {
		 
		String s = "programming class";
		
		Set<String> se = new LinkedHashSet<String>();
		
		for (int i = 0; i < s.length(); i++) {
			char charAt = s.charAt(i);
			se.add(s);
			
		}
		System.out.println(se);
	}

}
