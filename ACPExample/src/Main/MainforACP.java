package Main;

import java.util.*;

public class MainforACP {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		//Put in sample data for program example 
		
		String[] mySons = {"Kyle", "Dallin"};
		String[] myDaughters = {"Zenna", "Sarah", "Hannah"};
		String[] ourFavorites = {"Camping", "Surfing", "Snowboarding and Skiing", "Boating", "Hiking", "Christmas", "Laughing"};
		
		FamilyModel myFamily = new FamilyModel("Traesa", "Ben", mySons, myDaughters, ourFavorites);
		
		
		ApplicationController controller = new ApplicationController();
		Scanner scanner = new Scanner(System.in);
		try {
		
		int choice = -1;
		
		while(choice !=4) {
		
				choice = (int)controller.doCommand("displayMenu", GetCommmandData("scanner", scanner));
			
			switch (choice) {
			case 1: 
				System.out.println();
				
				controller.doCommand("displayParents", GetCommmandData("Family", myFamily));
				
				break;
			case 2:
				System.out.println();
				
				controller.doCommand("displayChildren", GetCommmandData("Family", myFamily));
				break;
				
			case 3:
				System.out.println();
				
				controller.doCommand("displayFamilyFavorites", GetCommmandData("Family", myFamily));
				break;	
				
			case 4:
				System.out.println("\nGoodbye");
				break;
				
			default:
				System.out.println("That is not a valid menu option, please enter a valid choice.");
				break;
			}
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//Create hash map to use to pass to handler
	public static HashMap<String, Object> GetCommmandData (String key, Object value)
	{
		HashMap<String, Object> data = new HashMap<String, Object>();
		data.put(key,value);
		return data;
		
	}
	
}
