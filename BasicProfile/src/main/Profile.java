package main;
import java.util.Scanner; //import scanner to allow user for user input

public class Profile { //name of project

	public static void main(String[] args) { //main method for java

		String firstName; //uninitiated string named firstName
		String lastName; //uninitiated string named lastName
		String streetAddress; //uninitiated string named streetAddress
		String userCity; //uninitiated string named userCity
		String zipCode; //uninitiated string named zipCode

		
		
/*The following statement will a new variable called 'in' with the type being Scanner. 
 * Using the try with resource statement, I can avoid a resource leak error where
 * the scanner never closes. "A resource is an object that must be closed after the program is finished with it.
 * The try-with-resources statement ensures that each resource is closed at the end of the statement."
 * For reference, use the following URL.
 * https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
*/

		try(Scanner in = new Scanner (System.in)){ //create new scanner called 'in'
			System.out.print("Input your first name: "); //ask the user to input their first name
		
			firstName = in.nextLine(); //assign next input to firstName
			
			System.out.print("Input your last name: "); // asks the user to input their last name
			
			lastName = in.nextLine(); //assign next input to lastName
			
			System.out.print("Input your street address: "); //ask the user to input their street address

			streetAddress = in.nextLine(); //assign next input to streetAddress

			System.out.print("Input your city: ");

			userCity = in.nextLine(); //assign next input to userCity

			System.out.print("Input your zip code: ");

			zipCode = in.nextLine(); //assign next input to zipCode

			System.out.println("Here is your profile!");
			System.out.println("First name: " + firstName); //print value of firstName
			System.out.println("Last name: " + lastName); //print value of lastName
			System.out.println("Street Address: " + streetAddress); //print value of streetAddress
			System.out.println("City: " + userCity); //print value of userCity
			System.out.println("Zip Code: " + zipCode); //print value of zipCode
			System.out.println("You may now close this program.");
			System.out.println("Thank you for playing!");

		}
	}

} 
