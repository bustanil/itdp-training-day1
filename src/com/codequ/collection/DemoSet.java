
package com.codequ.collection;

import java.util.HashSet;
import java.util.Set;

public class DemoSet {
	
	public static void main(String[] args) {
		Set<String> buah = new HashSet<String>();
		buah.add("Jeruk");
		buah.add("Jeruk"); // tidak masuk, karena sudah ada
		buah.add("Tomat");
		buah.add("Kelapa");
		
		System.out.println("Jumlah buah: " + buah.size());
		
		buah.remove("Tomat");
		
		System.out.println("Jumlah buah setelah dihapus: " + buah.size());
	}

}
