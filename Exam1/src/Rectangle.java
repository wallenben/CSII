public class Rectangle {

     private double length;

     private double width;

 

     public Rectangle(double len, double w) {

          length = len;

          width = w;

     }

     public double getArea() {

          return length * width;

     }

}

class Box extends Rectangle {
	double height;

	public Box(double len, double w, double h) {
		super(len, w);
		this.height = h;
	}

	public double getVolume() {
		return this.getArea() * this.height;
	}
}