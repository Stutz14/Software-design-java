package utilities;

import java.util.Scanner;

public class StateReader {
	
	private static StateReader instance = null;
	
	private StateReader StateReader() {
		return new StateReader();
	}
	
	public static StateReader getInstance() {
		if(instance == null) {
			instance = new StateReader();
		}
		return instance;
	}
	
	public int readStateFromUser() {
		// here the scanner
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter Aircraft State (1, 2, or 3): ");
	    
	    
	    System.out.print("Enter Selection: ");
	    

	    int selection = Integer.parseInt(myObj.nextLine());  // Read user input
		return selection;
	}
}
