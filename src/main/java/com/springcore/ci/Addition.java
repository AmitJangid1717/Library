package com.springcore.ci;

public class Addition {
	private int a;
	private int b;
	public Addition(double a, double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("constructor :double, double");
	}
	
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("constructor :int, int");
	}
	
	public Addition(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("constructor :string,string");
	}
	
	public void doSum() {
		System.out.println(" a is"+a  +"b is"+b);
		
		System.out.println("sum is=" + (this.a + this.b));
	}
	
}
