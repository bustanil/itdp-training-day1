
public class Array {

	public static void main(String[] args) {
		// deklarasi array
		int[] a = new int[3];
		a[0] = 7;
		a[1] = 8;
		a[2] = 9;
		// a[2] = true; compile-error karena beda tipe
		
		// deklarasi dan inisialisasi array
		int[] b = new int[]{15, 20, 25, 30};
		
		System.out.println("Elemen a ke 0: " + a[0]);
		System.out.println("Elemen b ke 2: " + b[2]);
		
		System.out.println("Ukuran array a: " + a.length);
		System.out.println("Ukuran array b: " + b.length);
		
		// Gunakan looping untuk mencetak semua isi array
		System.out.println("Isi dari array a adalah: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		
		// array 2 dimensi
		int[][] matrix1 = new int[3][3];
		matrix1[0][3] = 1;
		
		int[][] matrix2 = new int[][]{ {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		System.out.println(matrix2[2][2]);
	}

}
