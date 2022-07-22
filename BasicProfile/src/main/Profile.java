package main;
import java.util.Scanner; //import scanner to allow user for user input

public class Profile { //name of project

	public static void main(String[] args) { //main method for java
		
		
/*The following statement will a new variable called 'in' with the type being Scanner. 
 * Using the try with resource statement, I can avoid a resource leak error where
 * the scanner never closes. For reference, use the following URL.
 * https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
*/

		try(Scanner in = new Scanner (System.in)){
			System.out.println("Insert your first name:");
		
			String firstName = in.nextLine();
			
			System.out.println("Insert your last name:");
			
			String lastName = in.nextLine();
			
			System.out.println("Your full name is: " + firstName + " " + lastName);
		}

	
	}

}
