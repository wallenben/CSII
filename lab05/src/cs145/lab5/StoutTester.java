package cs145.lab5;

import java.util.Arrays;

import cs145.lab5.StoutStudent.Level;
/**
 * Method for testing the other classes in the package
 * @author Ben
 * @version 2020.03.02
 */
public class StoutTester {
	public static void main(String args[]) {
		StoutPerson[] people = new StoutPerson[6];
		StoutFaculty scott = new StoutFaculty(1256, "Turner", "Scott", "Associate Professor");
		StoutFaculty diane = new StoutFaculty(615, "Christie", "Diane", "Professor");
		StoutFaculty terry = new StoutFaculty(1073, "Terry", "Mason", "Professor");
		StoutStudent ben = new StoutStudent(77777, "Wallen", "Ben", Level.Sophomore, "Computer Science");
		StoutStudent jared = new StoutStudent(1291, "Swagman", "Jared");
		StoutSI z = new StoutSI(12, "Nelson", "Andrew", Level.Junior, "Computer Science");
		z.setCourse("CS145");
		people[0] = scott;
		people[1] = diane;
		people[2] = terry;
		people[3] = ben;
		people[4] = jared;
		people[5] = z;
		Arrays.sort(people);
		for (int i = 0; i < 6; i++) {
			System.out.println(people[i].toString());
		}
	}

}
