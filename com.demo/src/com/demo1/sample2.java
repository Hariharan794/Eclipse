package com.demo1;

public class sample2 extends sample1 {
	public sample2( char as) {    //2
		this(42542l);
		System.out.println("parent char parameterized constructor");
	}
	public sample2(long phone) {    //3 
		this(45);
		System.out.println("parent long parameterized constructor");
	}
	public sample2(int roll) {    //4
		super();
		System.out.println("parent int parameterized constructor");
	}
	public sample2() {     //1
		this('d');
		System.out.println("parent empty parameterized constructor ");
	}
	public static void main(String[] args) {
		sample2 s2 = new sample2();
		
	}

}
