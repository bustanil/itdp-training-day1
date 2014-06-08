package com.codequ.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IterasiListDanSet {
	
	public static void main(String[] args) {
		Set<String> setBuah = new HashSet<String>();
		setBuah.add("Jeruk");
		setBuah.add("Jeruk");
		setBuah.add("Tomat");
		setBuah.add("Kelapa");
		
		System.out.println("Iterasi sebuah Set menggunakan iterator");
		for (Iterator<String> iterator = setBuah.iterator(); iterator.hasNext();) {
			String buah = (String) iterator.next();
			System.out.println(buah);
		}
		
		System.out.println("Iterasi sebuah Set menggunakan for bentuk ke-2");
		for (String buah : setBuah) {
			System.out.println(buah);
		}
		
		List<String> listBuah = new ArrayList<String>();
		listBuah.add("Jeruk");
		listBuah.add("Jeruk");
		listBuah.add("Kelapa");
		
		System.out.println("Iterasi sebuah List menggunakan iterator");
		for (Iterator<String> iterator = listBuah.iterator(); iterator.hasNext();) {
			String buah = (String) iterator.next();
			System.out.println(buah);
		}
		
		System.out.println("Iterasi sebuah List menggunakan for bentuk ke-2");
		for (String buah : listBuah) {
			System.out.println(buah);
		}
	}

}
