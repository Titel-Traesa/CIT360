package Main;

import java.util.HashMap;
//import java.util.Scanner;

public class DisplayParentsHandler implements Handler{

	
	@Override
	public Object handleIt(HashMap<String, Object> data) {
		
		FamilyModel family = (FamilyModel)data.get("Family");
		
		String mom = family.getMom();
		String dad = family.getDad();
		
		
		String parents = "Mom: " + mom + "\nDad: " + dad;
		

		System.out.print(parents);
		
		return null;
	

}
}