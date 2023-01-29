import java.util.Scanner;

public class convert {

	public static void main(String[] args) {

		float rupees;

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter rupees:");

		rupees = in.nextLong();

		float dollars = rupees / 64;

		System.out.println(dollars + " Dollars");
	}
}