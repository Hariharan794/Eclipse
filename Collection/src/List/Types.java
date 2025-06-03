package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Types {
	public static void main(String[] args) {

		List<Integer> h = new ArrayList<Integer>(); 
	  //List<Character> h1 = new ArrayList<Character>(); 
   	  //List<String> h2 = new ArrayList<String>(); 
		                          //Insertion order
		h.add(52);
		h.add(12);
		h.add(87);
		h.add(54);
		h.add(14);
		h.add(78);
		h.add(12);
		System.out.println(h);

		Integer integer = h.get(2);
		System.out.println(integer);

		int size = h.size();
		System.out.println(size);

		int indexOf = h.indexOf(54);
		System.out.println(indexOf);

		List<String> a = new LinkedList<String>(); 
	  //List<Integer> a = new LinkedList<Integer>();
	  //List<Character> a = new LinkedList<Character>();
		                          //Insertion order
		a.add("hari");
		a.add("aswin");
		a.add("santhosh");
		a.add("dhanaa");
		a.add("nandthini");
		a.add("samantha");

		System.out.println(a);

		a.add(2, "haran"); // add the value
		System.out.println(a);

		a.set(5, "asha"); // replace the value
		System.out.println(a);

		int size2 = a.size();
		System.out.println(size2);

		List<Character> q = new Vector<Character>(); 
	  //List<Integer> q = new Vector<Integer>(); 
      //List<String> q = new Vector<String>(); 
		                    //Insertion order

		q.add('j');
		q.add('w');
		q.add('r');
		q.add('t');
		q.add('i');
		q.add('o');
		q.add('h');

		System.out.println(q);

		int indexOf2 = q.indexOf('r');
		System.out.println(indexOf2);

		System.out.println("\n Normal for loop");
		for (int i = 0; i < q.size(); i++) {
			System.out.println(q);
		}
		System.out.println("\nEnchanced for loop");
		for (Character e : q) {
			System.out.println(e);

		}

	}


}
