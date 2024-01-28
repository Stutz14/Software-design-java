package utilities;

import java.util.Scanner;

public class ACStateReader {
	
	private static ACStateReader instance = null;
	
	private ACStateReader ACStateReader() {
		return new ACStateReader();
	}
	
	public static ACStateReader getInstance() {
		if (instance== null) {
			instance = new ACStateReader();
		}
		return instance;
	}
	
	public int getACStateID() {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter Aircraft State (1, 2, or 3): ");
	 
	    
	    System.out.print("Enter Selection: ");
	    

	    int selection = Integer.parseInt(myObj.nextLine());  // Read user input
	    
	    return selection;
	}

}
