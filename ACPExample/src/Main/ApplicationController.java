package Main;

import java.util.HashMap;

public class ApplicationController {
	private HashMap<String, Handler> commands;
	
	
	public ApplicationController() {
		//constructor
		commands = new HashMap<String, Handler>();
		commands.put("displayMenu", new DisplayMenuHandler());
		commands.put("displayParents", new DisplayParentsHandler());
		commands.put("displayChildren", new DisplayChildrenHandler());
		commands.put("displayFamilyFavorites", new DisplayFamilyFavoritesHandler());
	}
		
	public Object doCommand(String commandKey, HashMap<String, Object> commandData) throws Exception{
		Handler command = commands.getOrDefault(commandKey, null);
		if(command==null) {
			throw new Exception("Ther is no command with the key word'" + commandKey +"'.");
		}
		
		return command.handleIt(commandData);
		}
	
}
