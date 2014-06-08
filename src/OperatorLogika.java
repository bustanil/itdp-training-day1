
public class OperatorLogika {

	public static void main(String[] args) {
		
		// AND
		boolean hujan = false;
		boolean berangin = true;
		boolean badaiTropis = hujan && berangin; // false
		
		int umur = 25;
		boolean s3 = true;
		boolean jenius = (umur < 25) && s3; // true
		
		// OR
		boolean rajin = false;
		boolean pintar = false;
		boolean lulusKuliah = rajin || pintar; // false
		
		double totalPembelian = 350000.00;
		int totalPoin = 250;
		boolean dapatDiskon = (totalPembelian > 500000.00) || (totalPoin > 200); // true
		
		// NOT
		boolean basah = true;
		boolean kering = !basah; // false
		
		int bilangan = 13;
		boolean bilanganGanjil = !(bilangan % 2 == 0);
		
		// TERNARY
		boolean menang = true;
		int poin = menang ? 3 : 0;
	}

}
