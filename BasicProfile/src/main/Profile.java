package main;
import java.util.Scanner; //import scanner to allow user for user input

public class Profile { //name of project

	public static void main(String[] args) { //main method for java
		
		Scanner in = null; //creates a new variable called 'in' with the type being Scanner.

		try{
			in = new Scanner (System.in);
			System.out.println("Insert your first name:");
		
			String firstName = in.nextLine();
			
			System.out.println("Insert your last name:");
			
			String lastName = in.nextLine();
			
			System.out.println("Your full name is: " + firstName + " " + lastName);
		}

		finally{
			if(in != null){
				in.close();
			}
		}
		

	}

}
