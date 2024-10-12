package week6;

import java.util.Scanner;

public class FullName {
	static Scanner userinput = new Scanner(System.in);

	public static void main(String[] args) {
		String firstName, middleName, lastName,fullName;

		System.out.println("Enter your first name --> ");
		firstName = userinput.nextLine();
		System.out.println("Enter your middle name --> ");
		middleName = userinput.nextLine();
		System.out.println("Enter your last name --> ");
		lastName = userinput.nextLine();
		
		fullName = firstName + " " + middleName + " " + lastName;
		
		System.out.println("Your full name is: " + fullName);
	}
}
