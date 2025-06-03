package Exceptionhandling;

public class Throw {
	public static void main(String[] args) {
		System.out.println(1+2);
		System.out.println(1+0);
		System.out.println(1+5);
		try {
			System.out.println(1/0);
		} catch (Exception e) {
			System.out.println("fghj");
		}finally {
			System.out.println("abcfdg");
		}
		
		System.out.println(1*5);
		System.out.println(1*5);
		
		
	}


}
