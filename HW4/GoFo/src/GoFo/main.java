package GoFo;

import java.util.Scanner;

public class main {
	public static void main(String Args[]) {
		Scanner scan = new Scanner(System.in);
		String name, address, email, password;
		int age, phone, type, choice = 0;
		Login login = new Login();
		TableOfSlots table = new TableOfSlots();
		Player player = null;
		PlaygroundOwner owner = null;
		System.out.println("welcome GOFO");
		while (choice != 3) {
			System.out.print("enter 1 to register or 2 to login or 3 to exit");
			choice = scan.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("press 1 to register as player or 2 to register as playground owner");
				type = scan.nextInt();
				System.out.println("registration page:");
				System.out.println("please enter your user name: ");
				name = scan.next();
				System.out.println("please enter your age: ");
				age = scan.nextInt();
				System.out.println("please enter your password: ");
				password = scan.next();
				System.out.println("please enter your address: ");
				address = scan.next();
				System.out.println("please enter your email: ");
				email = scan.next();
				System.out.println("please enter yourphone number: ");
				phone = scan.nextInt();
				RegisterUser R = new RegisterUser(name, address, age, phone, email, type, password);
				if (type == 2) {
					login.addOwner(R.getOwner());
				} else {
					login.addPlayer(R.getPlayer());
				}
				break;
			}
			case 2: {
				System.out.println("press 1 to login as player or 2 to login as playground owner");
				type = scan.nextInt();
				System.out.println("please enter user name:");
				name = scan.next();
				System.out.println("please enter password:");
				password = scan.next();
				if (type == 1) {
					player = login.playerLogin(name, password);
				} else {
					owner = login.ownerLogin(name, password);
				}
				if (owner != null || player != null) {
					switch (type) {
					case 1: {
						table.display();
						Playground pg = new Playground("", "", 0);
						String pname;
						int nslot;
						System.out.print("please enter the play ground name you choose and the number of slot:");
						pname = scan.next();
						nslot = scan.nextInt();
						for (int i = 0; i < table.limit; i++) {
							if (table.pgs[i].name == pname) {
								pg = table.pgs[i];
								break;
							}
						}
						if (player.booking(table, nslot - 1, pg)) {
							System.out.println("slot booked");
						} else {
							System.out.println("slot is not free");
							System.out.println("please chose another one");
							System.out.print("please enter the play ground name you choose and the number of slot:");
							pname = scan.next();
							nslot = scan.nextInt();
							for (int i = 0; i < table.limit; i++) {
								if (table.pgs[i].name == pname) {
									pg = table.pgs[i];
									break;
								}
							}
							if (player.booking(table, nslot - 1, pg)) {
								System.out.println("slot booked");
							}
						}
						break;
					}
					case 2: {
						String pname, plocation;
						int pprice;
						System.out.print("please enter the name of play ground:");
						pname = scan.next();
						System.out.print("please enter the location of play ground:");
						plocation = scan.next();
						System.out.print("please enter the price per hour of play ground:");
						pprice = scan.nextInt();
						owner.addPlayground(pname, plocation, pprice);
						table.addPlayground(owner.pg);
					}
					}
				} else {
					System.out.println("error while login");
				}
				break;
			}
			case 3: {
				break;
			}
			}

		}
	}
}