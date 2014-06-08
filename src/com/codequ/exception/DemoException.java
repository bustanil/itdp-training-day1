package com.codequ.exception;

public class DemoException {
	
	public static void main(String[] args) {
		Rekening rekening = new Rekening("12345", 2000000);
		
		rekening.tarikDana(10000);
		
		try {
			rekening.tarikDana(100000000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
