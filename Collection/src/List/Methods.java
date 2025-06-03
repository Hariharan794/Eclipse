package List;

import java.util.LinkedList;
import java.util.List;

public class Methods {
	public static void main(String[] args) {
		List<Integer> h = new LinkedList<Integer>();
		h.add(47);
		h.add(54);
		h.add(12);
		h.add(25);
		h.add(10);
		h.add(36);
		h.add(47);
		h.add(68);

		System.out.println(h);

		int size = h.size(); // length of integer
		System.out.println(size);

		Integer integer = h.get(5); // index value of length(n-1)
		System.out.println(integer);

		int indexOf = h.indexOf(10);
		System.out.println(indexOf);

		int lastIndexOf = h.lastIndexOf(47);
		System.out.println(lastIndexOf);

		boolean empty = h.isEmpty();
		System.out.println(empty);

		h.add(4, 86); // add the index value
		System.out.println(h);

		h.set(0, 41); // update
		System.out.println(h);

		h.remove(5); // remove specific index value
		System.out.println(h);

		h.retainAll(h);
		System.out.println(h);

		boolean contains = h.contains(36);
		System.out.println(contains);

		boolean equals = h.equals(25);
		System.out.println(equals);
		
		
        System.out.println("\n Normal for loop");
		for (int i = 0; i < h.size(); i++) {
			System.out.println(h.get(i));

			System.out.println("\nenchanced for loop");
			
			for (Integer x : h) {
				System.out.println(x);
			}

//		for (Integer integer2 : h) {
//				System.out.println(integer2);
//
//			}

		}

	}

}
