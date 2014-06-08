
public class Object {

	public static void main(String[] args) {
		Sepeda polygon = new Sepeda();
		polygon.merk = "Polygon";
		polygon.gear = 5;
		polygon.kecepatan = 0;
		
		polygon.tambahKecepatan(10);
		polygon.kurangiKecepatan(5);
		System.out.println("Kecepatan sepeda sekarang: " + polygon.kecepatan);
		
		polygon.berhenti();
		System.out.println("Kecepatan sepeda sekarang: " + polygon.kecepatan);
		
		
	}

}
