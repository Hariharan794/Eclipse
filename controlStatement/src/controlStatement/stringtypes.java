package controlStatement;



public class stringtypes {
	public static void main(String[] args) {
//		System.out.println("literal string");
		
//		String h1 ="python";
//		String h2 ="c++";
//		String h3 ="web design";
//		
//		
//		System.out.println("python memory address:"+System.identityHashCode(h1));
//		System.out.println("c++ memory address:"+System.identityHashCode(h2));
//		System.out.println("web design memory address:"+System.identityHashCode(h3));

//		System.out.println("\nnon-literal string");
//		
//		String s1 =new String("java");
//		String s2 =new String("python");
//		String s3 =new String("angular");
//		
//		System.out.println("java memory address:"+System.identityHashCode(s1));
//		System.out.println("c++ memory address:"+System.identityHashCode(s2));
//		System.out.println("web design memory address:"+System.identityHashCode(s3));
//		
		String h1 ="python";
		String h2 ="c++";
		String h3 ="web design";
		
		
		System.out.println("python memory address:"+System.identityHashCode(h1));
		System.out.println("c++ memory address:"+System.identityHashCode(h2));
		System.out.println("web design memory address:"+System.identityHashCode(h3));
		
		String concat = h1.concat(h2);
		System.out.println(concat);
		System.out.println(System.identityHashCode(concat));

		h2 ="web tech";
		String concat2 = h1.concat(h2);
		System.out.println(concat2);
		System.out.println(System.identityHashCode(concat2));
		
		

	}


}
