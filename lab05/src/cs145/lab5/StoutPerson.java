/**
 * 
 */
package cs145.lab5;

/**
 * @author Ben Wallen
 * Class depicting information on a person at Stout.
 * @version 2020.03.02
 */
public abstract class StoutPerson implements Comparable<StoutPerson> {
private int id;
private String lastName;
private String firstName;
public abstract String role();
/**
 * @param id is the Stout ID used
 * @param lastName is the lastname of the person
 * @param firstName is the firstname of the person
 */
public StoutPerson(int id, String lastName, String firstName) {
	this.id = id;
	this.lastName = lastName;
	this.firstName = firstName;
}
/** 
 * @return the lastName
 */
public String getLastName() {
	return lastName;
}
/**
 * @param Sets the lastname variable
 */
public void setLastName(String lastName) {
	this.lastName = lastName;
}
/**
 * @return the firstName
 */
public String getFirstName() {
	return firstName;
}
/**
 * @param Sets the firstname variable
 */
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * toString method for printing applicable data from the class.
 */
public String toString() {
	return this.lastName + ", " + this.firstName + "\n" + "ID: " + this.id + "\n";
}
/**
 * compareTo method for comparing the lastName variables.
 */
public int compareTo(StoutPerson x) {
	return this.getLastName().compareTo(x.getLastName());
}
}
