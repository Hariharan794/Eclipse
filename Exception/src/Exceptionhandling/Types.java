package Exceptionhandling;

public class Types {
public static void main(String[] args) {
		
		System.out.println(1+2);
		System.out.println(1+0);
		System.out.println(1+5);
		try {
			System.out.println(2/0);
//			try {
//				System.out.println(10<5);
//			} catch (Exception e) {
//				System.out.println("done");
//			}finally {
//				System.out.println("bad performance");
//			}
			
		} catch (ArithmeticException e) {
			System.out.println("donot divided by zero");
		}finally {
			System.out.println("good performance");
		}
		
		System.out.println(1*5);
		System.out.println(1*5);
		
	}


}
