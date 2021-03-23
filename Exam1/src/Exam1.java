
public class Exam1 {
	String goArray[][] = new String[17][17];
	enum Month {Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec}
	enum PrimeColor {Red, Blue, Yellow}
	PrimeColor color = PrimeColor.Red;
	public void returnArray() {
		for (int i = 0; i < 17; i++) {
			for (int a = 0; a < 17; a++) {
				// formatting not required, but added space for readability
				System.out.println(goArray[i][a] + " ");
			}
			// move to next row, \n works too
			System.out.println();
		}
	}
	
	

}

public class Speaker {
	private int volume;

	Speaker() {
		volume = 0;
	}

	public void increaseVolume() {
		volume = volume + 5;
	}

	public void decreaseVolume() {
		volume = volume - 5;
	}

}