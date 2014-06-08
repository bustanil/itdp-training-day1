
public class BreakAndContinue {

	public static void main(String[] args) {
		System.out.println("Break");
		int i = 0;
		while(i < 10){
			if(i == 5){
				break;
			}
			System.out.println(i);
			i++;
		}
		System.out.println("Continue");
		for (i = 0; i < 10; i++) {
			if(i == 5){
				continue;
			}
			System.out.println(i);
		}
		
		// break dari loop bersarang
		for (int x = 0; x < 5; x++) {
			System.out.println("Baris " + x);
			for (int y = 0; y < 5; y++) {
				if(y == 3){
					break;
				}
				System.out.println("Kolom " + y);
			}
		}
		
	}

}
