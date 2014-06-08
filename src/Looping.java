
public class Looping {

	public static void main(String[] args) {
		System.out.println("Menggunakan for");
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello");
		}
		
		System.out.println("Menggunakan while");
		int i = 0;
		while(i < 5){
			System.out.println("Hello");
			i++;
		}
		
		System.out.println("Menggunakan for (decrement)");
		for (int j = 10; j > 0; j--) {
			System.out.println(j);
		}
		
		System.out.println("Menggunakan while (decrement)");
		int j = 10;
		while(j > 0){
			System.out.println(j);
			j--;
		}
		
		// for bersarang
		for (int k = 0; k < 3; k++) {
			System.out.println("Baris " + k);
			for (int l = 0; l < 2; l++) {
				System.out.println("Kolom " + l);
			}
		}
	}

}
