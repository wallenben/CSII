package cs145.lab5;

/**
 * @author Ben Wallen Class depicting information on a SI at Stout.
 * @version 2020.03.02
 */
public class StoutSI extends StoutStudent {

	public String course;

	/**
	 * @param id        is the Stout ID used
	 * @param lastName  is the lastname of the person
	 * @param firstName is the firstname of the person
	 * @param course	is the course being taken
	 */
	public StoutSI(int id, String lastName, String firstName, String course) {
		super(id, lastName, firstName);
		this.course = course;
	}

	/**
	 * @return the course attended
	 */
	public String getCourse() {
		return course;
	}

	/**
	 * Overloads role(), returns the original role plus an additional stirng.
	 */
	public String role() {
		// TODO Auto-generated method stub
		super.role();
		return "and teaches students";
	}

	/**
	 * @param Sets the course variable.
	 */
	public void setCourse(String course) {
		this.course = course;
	}

	/**
	 * 
	 * @param id        is the Stout ID used
	 * @param lastName  is the lastname of the person
	 * @param firstName is the firstname of the person
	 */
	public StoutSI(int id, String lastName, String firstName) {
		super(id, lastName, firstName);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param id        is the Stout ID used
	 * @param lastName  is the lastname of the person
	 * @param firstName is the firstname of the person
	 * @param year      is the year of the Student
	 * @param major     is the major of the student
	 */
	public StoutSI(int id, String lastName, String firstName, Level year, String major) {
		super(id, lastName, firstName, year, major);
		// TODO Auto-generated constructor stub
	}
	/**
	 * compareTo method for comparing the lastName variables.
	 * This overloads the toString method from the parent and adds course information.
	 */
	public String toString() {
		return super.toString() + " \n" + this.course;
	}
}
