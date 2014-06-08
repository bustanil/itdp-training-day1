package com.codequ.collection;

import java.util.ArrayList;
import java.util.List;

public class DemoList {
	
	public static void main(String[] args) {
		List<String> buah = new ArrayList<String>();
		
		// menambah elemen
		buah.add("Jeruk");
		buah.add("Jeruk");
		buah.add("Kelapa");
		
		// menambah elemen di index tertentu
		buah.add(2, "Tomat");
		
		// mengganti elemen di index tertentu
		buah.set(1, "Apel");
		
		System.out.println("Jumlah buah: " + buah.size());
		
		// mengakses elemen berdasarkan index
		System.out.println("Isi dari elemen ke-1: " + buah.get(1));
		
		// menghapus elemen berdasarkan index
		buah.remove(0);
		System.out.println("Jumlah buah: " + buah.size());
		
		// menghapus elemen berdasarkan elemen
		buah.remove("Kelapa");
		System.out.println("Jumlah buah: " + buah.size());
	}

}
