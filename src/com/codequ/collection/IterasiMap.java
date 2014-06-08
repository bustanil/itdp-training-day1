package com.codequ.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class IterasiMap {
	
	public static void main(String[] args) {
		Map<String, String> warnaBuah = new HashMap<String, String>();
		warnaBuah.put("Jeruk", "Orange");
		warnaBuah.put("Apel", "Merah");
		warnaBuah.put("Kelapa", "Hijau");
		
		System.out.println("Iterasi key-nya");
		for (String buah : warnaBuah.keySet()) {
			System.out.println(buah);
		}
		
		System.out.println("Iterasi nilai-nya");
		for (String warna : warnaBuah.values()) {
			System.out.println(warna);
		}
		
		System.out.println("Iterasi key dan nilai-nya");
		for (Entry<String, String> entry : warnaBuah.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		
		
	}

}
