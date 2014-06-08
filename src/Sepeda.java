
	public class Sepeda {
		
		int gear;
		int kecepatan;
		String merk;
		
		void tambahKecepatan(int tambah){
			kecepatan = kecepatan + tambah;
		}
		
		void kurangiKecepatan(int kurang){
			kecepatan = kecepatan - kurang;
		}
		
		void berhenti(){
			this.kecepatan = 0;
		}
	
	}


	