package Main;

import java.util.HashMap;
import java.util.Scanner;

public class DisplayMenuHandler implements Handler{

	public DisplayMenuHandler() {
	}
	
	@Override
	public Object handleIt(HashMap<String, Object> data) {
		
		String menuList = "\n---------------------------------------------------"
		        +"\n|  Main Menu For Familiy Information              |"
		        +"\n---------------------------------------------------"
		        +"\n1 - Display Parents        "
		        +"\n2 - Display Children"    
		        +"\n3 - Display Familiy Favorites"
		        +"\n4 - Quit"

		        +"\n---------------------------------------------------"

		        +"\nPlease enter your choice: ";
		

		System.out.print(menuList);
		Scanner in = (Scanner)data.get("scanner");
		int selection = GetNextInt(in);
		return selection;
		
	}

	private int GetNextInt(Scanner scanner) {
		String input = scanner.nextLine();
		try {
			int result = Integer.parseInt(input);
			return result;
		}
		catch (Exception e) {
			System.out.println("You must enter a number form the menu.");
			return -1;
		}
		
	}
}

