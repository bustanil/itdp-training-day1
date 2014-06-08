package com.codequ.exception;

public class Rekening {
	
	String nomor;
	double saldo;

	public Rekening(String nomor, double saldo) {
		this.nomor = nomor;
		this.saldo = saldo;
	}
	
	public double tarikDana(double jumlah){
		if(saldo <  jumlah){
			throw new RuntimeException("Saldo tidak cukup");
		}
		else {
			saldo = saldo - jumlah;
			return saldo;
		}
	}

}
