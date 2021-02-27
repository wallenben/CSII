package cards;

public class Cards {

	public enum suit{Diamond, Club, Heart, Spade;}
	public enum face{Ace(1), Two(2), Three(2), Four(4), Five(5), Six(6), Seven(7), Eight(8), Nine(9), Ten(10),
		Jack(11), Queen(12), King(13);
	private int val;
	private face(int val) {
		val = this.val;
	}
	}
	private suit x;
	private face y;
	public Cards(suit aa, face xx) {
		x = aa;
		y= xx;
	}
	public String toString() {
		return y.toString() + "of" + x.toString();
	}
	
}