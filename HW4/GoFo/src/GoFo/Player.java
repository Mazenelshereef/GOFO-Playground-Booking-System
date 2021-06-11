package GoFo;

public class Player {
	String name;
	int age;
	int phoneNumber;
	String email;
	String address;
	String password;
	int id;
	static int counter = 1;

	public Player(String n, String Address, int Age, int Phone, String Email, String Password) {
		name = n;
		age = Age;
		phoneNumber = Phone;
		email = Email;
		address = Address;
		password = Password;
		id = counter;
		counter++;
	}

	public Player() {
		name = "";
		age = 0;
		phoneNumber = 0;
		email = "";
		address = "";
		password = "";
		id = counter;
		counter++;
	}

	public boolean booking(TableOfSlots t, int num, Playground pg) {
		int temp = 0;
		for (int i = 0; i < t.limit; i++) {
			if (t.pgs[i] == pg) {
				temp = i;
				break;
			}
		}
		if (t.pgs[temp].slots[num] != 0) {
			t.pgs[temp].slots[num] = 0;
			return true;
		} else {
			return false;
		}
	}
}
