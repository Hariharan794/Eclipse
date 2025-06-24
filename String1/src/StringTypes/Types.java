package StringTypes;

public class Types {
	public static void main(String[] args) {
		//literal string
		System.out.println("literal String type:");
		String s1 ="java";
		String s2 ="fullstack";
		String s3 ="java";

		System.out.println("java memory address:"+System.identityHashCode(s1));
		System.out.println("fullstack memory address:"+System.identityHashCode(s2));
		System.out.println(" dub java memory address:"+System.identityHashCode(s3));

		System.out.println("\nnon-literal string:");  
		        //non-literal string
		String h1 =new String("JAVA");
		String h2 =new String("fullstack");
		String h3 =new String("JAVA");

		System.out.println("JAVA memory address:"+System.identityHashCode(h1));
		System.out.println("fullstack memory address:"+System.identityHashCode(h2));
		System.out.println(" dub JAVA memory address:"+System.identityHashCode(h3));

		System.out.println("\nImmutable string:");
		        //Immutable String
		String a1 = "python";
		String a2 = "c++";
		String a3 = "web tech";

		System.out.println("python memory address:"+System.identityHashCode(a1));
		System.out.println("c++ memory address:"+System.identityHashCode(a2));
		System.out.println("web tech memory address:"+System.identityHashCode(a3));

		String concat = a1.concat(a2);

		System.out.println(concat);
		System.out.println(System.identityHashCode(concat));

		a2 ="full stack";
		String concat2 = a1.concat(a2);
		System.out.println(concat2);

		System.out.println(System.identityHashCode(concat2));

		System.out.println("\nmutable string:");
		         //mutable string

		StringBuffer q1 =new StringBuffer("ece");
		StringBuffer q2 =new StringBuffer("mech");
		StringBuffer q3 =new StringBuffer("cse");

		System.out.println("ece memory address:"+System.identityHashCode(q1));
		System.out.println("mech memory address:"+System.identityHashCode(q2));
		System.out.println("cse memory address:"+System.identityHashCode(q3));

		StringBuffer append = q1.append(q2);

		System.out.println(append);
		System.out.println(System.identityHashCode(append));

		q2= new StringBuffer("mca");
		StringBuffer append2 = q1.append(s2);
		System.out.println(append2);
		System.out.println(System.identityHashCode(append2));

		

	}

}
