package StringTypes;

public class ewge {
	public static void main(String[] args) {
		System.out.println("\n");

		String a1="java";
		String a2="selium";
		String a3="java";
		
		System.out.println(System.identityHashCode(a1));
		System.out.println(System.identityHashCode(a2));
		System.out.println(System.identityHashCode(a3));
		
		
		
		System.out.println("\n");
		

		String k1=new String("java");
		String k2=new String("selium");
		String k3=new String("java");
		
		System.out.println(System.identityHashCode(k1));
		System.out.println(System.identityHashCode(k2));
		System.out.println(System.identityHashCode(k3));
		
		
		
		System.out.println("\n");
		
		
		

		StringBuffer l1=new StringBuffer("java");
		StringBuffer l2=new StringBuffer("selium");
		StringBuffer l3=new StringBuffer("java");
		
		
		System.out.println(System.identityHashCode(l1));
		System.out.println(System.identityHashCode(l2));
		System.out.println(System.identityHashCode(l3));
		
		
		StringBuffer append = l1.append(l2);
		System.out.println(append);
		System.out.println(System.identityHashCode(append));
		
		
		l2=new StringBuffer("python");
		StringBuffer append2 = l1.append(l2);
		System.out.println(append);
		System.out.println(System.identityHashCode(append2));
	}

}
