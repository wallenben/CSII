/**
 * 
 */
package cs145.lab5;

/**
 * @author Ben
 *
 */
public class StoutFaculty extends StoutPerson {
	String position;
	/**
	 * @param id
	 * @param lastName
	 * @param firstName
	 */
	public StoutFaculty(int id, String lastName, String firstName) {
		super(id, lastName, firstName);
		this.position = "Instructor";
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param lastName
	 * @param firstName
	 * @param position
	 */
	public StoutFaculty(int id, String lastName, String firstName, String position) {
		super(id, lastName, firstName);
		this.position = position;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String role() {
		// TODO Auto-generated method stub
		return "teaches students";
	}
	public String toString() {
		return super.toString() + this.position + " " + this.role();
	}
}
