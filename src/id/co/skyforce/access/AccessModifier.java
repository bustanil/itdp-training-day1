package id.co.skyforce.access;

public class AccessModifier {
	
	public static void main(String[] args) {
		A a = new A();
		// System.out.println(a.x); // field private tidak dapat diakses class lain
 		// a.methodPrivate(); // method private tidak dapat diakses class lain
		System.out.println(a.v); // field v dapat diakses karena satu package
		
		a.methodPublic();
		a.getX();
	}

}
