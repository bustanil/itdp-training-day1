package id.co.skyforce.access;

public class A {
	
	int v = 9;
	private int x = 10;
	protected int y = 11;
	public int z = 12;
	
	public int getX(){
		return x;
	}
	
	private void methodPrivate(){
		System.out.println("sebuah private method");
	}
	
	public void methodPublic(){
		System.out.println("Method public dipanggil");
	}

}
