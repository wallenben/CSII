
public class UserInput {
	String emailAddress;
	int age;
	String firstName;
	String lastName;

	public UserInput() {
		emailAddress = "";
		firstName = "";
		lastName = "";
		age = 0;
	}

	public UserInput(String email, String first, String last, int age) {
		this.emailAddress = email;
		this.firstName = first;
		this.lastName = last;
		this.age = age;
	}
	
}
