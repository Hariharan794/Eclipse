package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Types {
	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<Integer>();   //Random order
	  //Set<Character> s2 = new HashSet<Character>();  
	  //Set<String> s3 = new HashSet<String>();
		
		                   // Not repeated duplicate Value 
		s1.add(45);
		s1.add(12);
		s1.add(12);
		s1.add(20);
		s1.add(43);
		s1.add(14);
		s1.add(43);
		
		
		System.out.println(s1);
		
		
		Set<Integer> a = new LinkedHashSet<Integer>();    //Insertion Order
	  //Set<Character> a1 = new LinkedHashSet<Character>();  
	  //Set<String> a2 = new LinkedHashSet<String>();  
		
		                      // not repeated duplicate value
		a.add(4);
		a.add(123);
		a.add(36);
		a.add(123);
		a.add(13);
		a.add(25);
		a.add(34);
		a.add(29);
		
		 
		System.out.println(a);
		
		Set<Integer> q = new TreeSet<Integer>();    //ascending Order
	  //Set<Character> q = new TreeSet<Character>();    
	  //Set<String> q = new TreeSet<String>();    
	
		                         // not repeated duplicate value
		q.add(30);
		q.add(13);
		q.add(23);
		q.add(26);
		q.add(15);
		q.add(04);
		q.add(07);
		q.add(30);
		
		System.out.println(q);
		
	}


}
