package shapes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int userChoice;
		Rectangle rr = null;
		Circle cc = null;
		Triangle tt = null;
		do {
			System.out.println("Choose your Shape");
			System.out.println("1. Triangle");
			System.out.println("2. Circle");
			System.out.println("3. Rectangle");
			System.out.println("4. Quit");

			System.out.println("------------------");

			System.out.println("Your Selection: ");

			userChoice = in.nextInt();

			if (userChoice == 1) {
				System.out.println("-----------------");
				System.out.println("You Selected TRIANGLE");
				System.out.println("-----------------");
				System.out.println("Please enter a number for all the sides");
				System.out.println("How long is Side A, B, and C? (Place a number then press SHFT)");
				tt = new Triangle(in.nextDouble(), in.nextDouble(), in.nextDouble());
				tt.printStats();
			} else if (userChoice == 2) {
				System.out.println("-----------------");
				System.out.println("You Selected CIRCLE");
				System.out.println("-----------------");
				System.out.println("Please enter a number for the Radius");
				System.out.println("How long the radius? (Place a number then press SHFT)");
				cc = new Circle(in.nextDouble());
				cc.printStats();
			} else if (userChoice == 3) {
				System.out.println("-----------------");
				System.out.println("You Selected RECTANGLE");
				System.out.println("-----------------");
				System.out.println("Please enter a number Length and Width");
				System.out.println("How long the Length and Width? (Place a number then press SHFT)");
				rr = new Rectangle(in.nextDouble(), in.nextDouble());
				rr.printStats();

			} else if (userChoice == 4) {
				System.out.println("You have Ended the program. GoodBye!");
				System.exit(0);
			}
			System.out.println("-----------------");
			System.out.println("NEW SET");
			System.out.println("-----------------");

		} while (userChoice != 4);
		System.out.println("-----------------");
		System.out.println("NEW SET");
		System.out.println("-----------------");
	}
}
