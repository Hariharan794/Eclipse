package array;

import java.util.LinkedList;
import java.util.List;
                            //similar and DisSimialr DataType //
public class Types {
	public static void main(String[] args) {
		List<Integer> q1 = new LinkedList<Integer>(); // similar DataType

		System.out.println("\nSimilar DataType:");
		q1.add(45);
		q1.add(47);
		q1.add(52);
		q1.add(12);
		q1.add(41);
		q1.add(32);
		q1.add(25);

		System.out.println(q1);

		List li = new LinkedList();   	 // Dissimilar DataType

		System.out.println("\nDissimilar DataType:");

		li.add(45);
		li.add(45.7f);
		li.add(12.235);
		li.add(78);
		li.add('d');
		li.add("well");
		li.add(452l);

		System.out.println(li);

	}


}
