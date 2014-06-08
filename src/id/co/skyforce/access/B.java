package id.co.skyforce.access;

public class B extends A {
	
	public void methodB(){
		// System.out.println(x); // private field tidak dapat diakses
		int n = y;
		System.out.println("Nilai turunan dari y: " + n);
		System.out.println("Nilai public dari z: " + z);
	}

}
