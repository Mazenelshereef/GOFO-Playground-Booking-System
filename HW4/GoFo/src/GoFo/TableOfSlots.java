package GoFo;

public class TableOfSlots {
	int limit = 1;
	int number = 0;
	Playground pgs[];

	public TableOfSlots() {
		pgs = new Playground[limit];
	}

	void ensure() {
		if (number >= limit) {
			Playground array[] = new Playground[++limit];
			for (int i = 0; i < number; i++) {
				array[i] = pgs[i];
			}
			pgs = array;
		}
	}

	public void addPlayground(Playground pg) {
		ensure();
		pgs[number++] = pg;
	}

	public void display() {
		System.out.println("playground name|slots");
		for (int i = 0; i < limit; i++) {
			System.out.print(pgs[i].name + "|");
			for (int j = 0; j < 12; j++) {
				System.out.print(pgs[i].slots[j] + "|");
			}
			System.out.println();
		}
	}
}
