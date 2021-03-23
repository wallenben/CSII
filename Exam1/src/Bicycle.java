public class Bicycle implements Drivable {

	private int speed;

	public Bicycle() {

		speed = 0;

	}

	public void accelerate(int amtToSpeedUp) {
		speed += amtToSpeedUp;
		
	}

	public void brake(int amtToSlowDown) {
		speed -= amtToSlowDown;
		
	}
}

public interface Drivable {

	void accelerate(int amtToSpeedUp);

	void brake(int amtToSlowDown);

}