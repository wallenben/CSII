/**
 * 
 */
package cs145.lab5;

/**
 * @author Ben Wallen Class depicting information on a student at Stout.
 * @version 2020.03.02
 */
public class StoutStudent extends StoutPerson {
	enum Level {
		Freshman, Sophomore, Junior, Senior
	};

	Level year;
	String major;

	/**
	 * @param id        is the Stout ID used
	 * @param lastName  is the lastname of the person
	 * @param firstName is the firstname of the person
	 */
	public StoutStudent(int id, String lastName, String firstName) {
		super(id, lastName, firstName);
		// TODO Auto-generated constructor stub
		year = Level.Freshman;
		major = "Undeclared";
	}

	@Override
	/**
	 * returns a string when called
	 */
	public String role() {
		// TODO Auto-generated method stub
		return "takes classes";
	}

	/**
	 * @return the year
	 */
	public Level getYear() {
		return year;
	}

	/**
	 * @param Sets the year variable
	 */
	public void setYear(Level year) {
		this.year = year;
	}

	/**
	 * @return the major variable
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * @param Sets the major variable
	 */
	public void setMajor(String major) {
		this.major = major;
	}

	/**
	 * @param id        is the Stout ID used
	 * @param lastName  is the lastname of the person
	 * @param firstName is the firstname of the person
	 * @param year      is the year of the person at Stout
	 * @param major     is the major of the person at Stout
	 */
	public StoutStudent(int id, String lastName, String firstName, Level year, String major) {
		super(id, lastName, firstName);
		this.year = year;
		this.major = major;
	}

	/**
	 * compareTo method for comparing the lastName variables.
	 */
	public String toString() {
		return super.toString() + this.major + " " + this.year + " " + this.role();
	}
}
