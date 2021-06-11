package GoFo;

public class Login {
	PlaygroundOwner owners[];
	Player players[];
	int plimit = 1, olimit = 1;
	int pnum = 0, onum = 0;

	public Login() {
		owners = new PlaygroundOwner[olimit];
		players = new Player[plimit];
	}

	void ensure() {
		if (pnum >= plimit) {

			Player arr[] = new Player[plimit];
			for (int i = 0; i < pnum; i++) {

				arr[i] = players[i];
			}

			players = arr;
		}
		if (onum >= olimit) {
			PlaygroundOwner array[] = new PlaygroundOwner[++plimit];
			for (int i = 0; i < onum; i++) {
				array[i] = owners[i];
			}
			owners = array;
		}
	}

	public void addPlayer(Player p) {
		ensure();
		players[pnum++] = p;
	}

	public void addOwner(PlaygroundOwner o) {
		ensure();
		owners[onum++] = o;
	}

	public Player playerLogin(String username, String pass) {
		for (int i = 0; i < pnum; i++) {
			if (players[i].name.equals(username)) {
				if (players[i].password.equals(pass)) {
					return players[i];
				}
			}
		}
		return null;
	}

	public PlaygroundOwner ownerLogin(String username, String pass) {
		for (int i = 0; i < onum; i++) {
			if (owners[i].name.equals(username)) {
				if (owners[i].password.equals(pass)) {
					return owners[i];
				}
			}
		}
		return null;
	}
}
