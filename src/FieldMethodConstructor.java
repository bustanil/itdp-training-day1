
public class FieldMethodConstructor {
	
	public static void main(String[] args) {
		Manusia andi = new Manusia("Andi");
		
		andi.berlari(10);
		System.out.println("Umur Andi adalah " + andi.getUmur());
		
		Manusia budi = new Manusia("Budi", 40);
		budi.berlari();
		System.out.println("Umur Budi adalah " + budi.getUmur());

	}

}
