package GoFo;

public class Playground {
	public String name;
	public String location;
	public int slots[];
	int price;

	Playground(String n, String l, int p) {

		name = n;
		location = l;
		price = p;
		slots = new int[12];
		for (int i = 0; i < 12; i++) {
			slots[i] = i + 1;
		}

	}

}
