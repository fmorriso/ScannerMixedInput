import java.util.Scanner;

public class ScannerMixedInput {
	public static void main(String[] args) {

		Scanner textIn = new Scanner(System.in); // for string input
		Scanner numIn = new Scanner(System.in);  // for numeric input

		System.out.println("What is your first name?");
		String firstName = textIn.nextLine();

		System.out.println("How old are you?");
		int age = numIn.nextInt();

		System.out.println("What is your last name?");
		String lastName = textIn.nextLine();

		System.out.println("What is your weekly wage rate?");
		double wages = numIn.nextDouble();

		System.out.format("%s, %s, age %d, wages %.2f", lastName, firstName, age, wages);

		textIn.close();
		numIn.close();
	}
}
