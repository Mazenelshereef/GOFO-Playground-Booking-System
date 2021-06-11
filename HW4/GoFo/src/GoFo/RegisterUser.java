package GoFo;

public class RegisterUser {

	private Player player;
	private PlaygroundOwner owner;

	public RegisterUser(String n, String address, int age, int phone, String email, int type, String password) {
		switch (type) {
		case 1: {
			setPlayer(n, address, age, phone, email, password);
			break;
		}
		case 2: {
			setPlaygroundOwner(n, address, age, phone, email, password);
			break;
		}
		}

	}

	public Player setPlayer(String n, String address, int age, int phone, String email, String Password) {
		player = new Player(n, address, age, phone, email, Password);
		return player;
	}

	public PlaygroundOwner setPlaygroundOwner(String n, String address, int age, int phone, String email,
			String Password) {
		owner = new PlaygroundOwner(n, address, age, phone, email, Password);
		return owner;
	}

	public Player getPlayer() {
		return player;
	}

	public PlaygroundOwner getOwner() {
		return owner;
	}
}
