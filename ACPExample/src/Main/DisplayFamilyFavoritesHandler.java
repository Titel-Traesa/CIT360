package Main;

import java.util.Arrays;
import java.util.HashMap;

public class DisplayFamilyFavoritesHandler implements Handler {

	
	@Override
	public Object handleIt(HashMap<String, Object> data) {
		
	FamilyModel family = (FamilyModel)data.get("Family");
	
	String[] favorites = family.getFavorites();
	
	
	
	System.out.println("Family Favorites: " + Arrays.deepToString(favorites));
	
	return null;

}

}
