package main;
import java.util.Scanner;

public class Profile {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		
		
		System.out.println("Insert your first name:");
		
		String firstName = in.nextLine();
		
		System.out.println("Insert your last name:");
		
		String lastName = in.nextLine();
		
		System.out.println("Your full name is: " + firstName + " " + lastName);

	}

}
