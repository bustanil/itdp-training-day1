
public class IfThenElse {

	public static void main(String[] args) {
		int tarikan = 50000;
		double saldo = 300000.00;
		
		// IF-THEN
		if(tarikan < saldo){
			// hanya akan dieksekusi apabila umur kurang dari 5
			saldo = saldo - tarikan;
		}
		
		// IF-THEN-ELSE
		if(tarikan < saldo){
			// hanya akan dieksekusi apabila umur kurang dari 5
			saldo = saldo - tarikan;
		}
		else {
			System.out.println("Saldo tidak cukup");
		}

	}

}
