package GoFo;

public class PlaygroundOwner {
	public String name;
	int age;
	int phoneNumber;
	String email;
	String address;
	Playground pg;
	public String password;
	int id;
	static int counter = 1;

	public PlaygroundOwner(String n, String Address, int Age, int Phone, String Email, String Password) {
		name = n;
		age = Age;
		phoneNumber = Phone;
		email = Email;
		address = Address;
		password = Password;
		id = counter;
		counter++;
	}

	public PlaygroundOwner() {
		name = "";
		age = 0;
		phoneNumber = 0;
		email = "";
		address = "";
		password = "";
		id = counter;
		counter++;
	}

	public void addPlayground(String name, String location, int price) {
		pg = new Playground(name, location, price);
	}
}
