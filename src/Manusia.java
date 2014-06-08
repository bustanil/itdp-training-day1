
public class Manusia {
	
	String nama;
	int umur;
	
	public Manusia(String nama, int age) {
		this.nama = nama;
		this.umur = age;
	}
	
	public Manusia(String nama) {
		this.nama = nama;
		this.umur = 17;
	}
	
	public void berlari(){
		System.out.println(nama + " berlari dengan kecepatan 5 km/jam");
	}
	
	public void berlari(int kecepatan){
		System.out.println(nama + " berlari dengan kecepatan " + kecepatan + " km/jam" );
	}
	
	public int getUmur() {
		return umur;
	}
	
	public String getNama() {
		return nama;
	}

}
