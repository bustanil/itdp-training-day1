	
	public class Inheritance {
	
		public static void main(String[] args) {
			SepedaGunung sepedaGunung = new SepedaGunung();
			sepedaGunung.merk = "Wimcycle";
			sepedaGunung.gear = 5;
			sepedaGunung.kecepatan = 0;
			sepedaGunung.tinggiSeat = 10;
			
			sepedaGunung.tambahKecepatan(5);
			sepedaGunung.berhenti();
			sepedaGunung.gantiTinggiSeat(10);
		}
	
	}

	
	