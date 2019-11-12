package Main;
import java.util.Arrays;

import java.util.HashMap;
//import java.util.Scanner;

public class DisplayChildrenHandler implements Handler{


	
	@Override
	public Object handleIt(HashMap<String, Object> data) {
		
	FamilyModel family = (FamilyModel)data.get("Family");
	
	String[] sons = family.getSons();
	String[] daughters = family.getDaughters();
	
	
	System.out.println("Sons: " + Arrays.deepToString(sons) + "\nDaughters: "+ Arrays.deepToString(daughters));
	
	return null;

}
}