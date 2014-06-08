package com.codequ.collection;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {
	
	public static void main(String[] args) {
		Map<String, String> warnaBuah = new HashMap<String, String>();
		
		// menambah elemen
		warnaBuah.put("Jeruk", "Orange");
		warnaBuah.put("Apel", "Merah");
		warnaBuah.put("Kelapa", "Hijau");
		
		// mengambil elemen berdasarkan key
		System.out.println("Warna dari buah kelapa: " + warnaBuah.get("Kelapa"));
		
		// menghapus elemen berdasarkan key
		warnaBuah.remove("Apel");
		
		System.out.println("Jumlah buah: " + warnaBuah.size());
	}

}
